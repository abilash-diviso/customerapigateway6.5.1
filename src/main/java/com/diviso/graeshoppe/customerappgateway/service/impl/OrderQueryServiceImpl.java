package com.diviso.graeshoppe.customerappgateway.service.impl;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.core.CountRequest;
import org.elasticsearch.client.core.CountResponse;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Address;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.AuxilaryOrderLine;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Order;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.OrderLine;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Store;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Notification;
import com.diviso.graeshoppe.customerappgateway.service.OrderQueryService;
import com.diviso.graeshoppe.customerappgateway.web.rest.util.ServiceUtility;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.elasticsearch.index.query.QueryBuilder;

@Service
public class OrderQueryServiceImpl implements OrderQueryService {

	private final Logger log = LoggerFactory.getLogger(OrderQueryServiceImpl.class);

	@Autowired
	ServiceUtility serviceUtility;

	private RestHighLevelClient restHighLevelClient;

	private ObjectMapper objectMapper;

	public OrderQueryServiceImpl(ObjectMapper objectMapper, RestHighLevelClient restHighLevelClient) {
		this.objectMapper = objectMapper;
		this.restHighLevelClient = restHighLevelClient;
	}

	/**
	 * @param id the id of the Order
	 * @return Order in body
	 */
	@Override
	public Order findById(Long id) {

		log.debug("input", id);

		QueryBuilder dslQuery = QueryBuilders.boolQuery().must(matchAllQuery()).filter(termQuery("id", id));

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(dslQuery);

		SearchResponse searchResponse = serviceUtility.searchResponseForObject("order", dslQuery);

		log.debug("output", serviceUtility.getObjectResult(searchResponse, new Order()));

		return serviceUtility.getObjectResult(searchResponse, new Order());

	}

	/**
	 * Return page of order in desc order
	 * 
	 * @param customerId the customerId of the Order
	 * @param pageable   the pageable to create
	 * @return the page of Order in body
	 */
	@Override
	public Page<Order> findOrderByCustomerId(String customerId, Pageable pageable) {

		log.debug("input", customerId);

		QueryBuilder dslQuery = termQuery("customerId.keyword", customerId);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(dslQuery);
		searchSourceBuilder.sort(new FieldSortBuilder("id").order(SortOrder.DESC));
		SearchRequest searchRequest = serviceUtility.generateSearchRequest("order", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		Page<Order> orderPage = serviceUtility.getPageResult(searchResponse, pageable, new Order());
		orderPage.forEach(order -> {

			order.setOrderLines(new HashSet<OrderLine>(findOrderLinesByOrderId(order.getId())));

		});

		log.debug("output", orderPage);

		return orderPage;

	}

	/**
	 * @param orderId the id of the Order
	 * @return the list of OrderLines in body
	 */
	@Override
	public List<OrderLine> findOrderLinesByOrderId(Long orderId) {

		log.debug("input", orderId);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		/*
		 * String[] includeFields = new String[] { "iDPcode", "image" }; String[]
		 * excludeFields = new String[] { "category.*" };
		 * searchSourceBuilder.fetchSource(includeFields, excludeFields);
		 */
		searchSourceBuilder.query(termQuery("order.id", orderId));

		SearchRequest searchRequest = new SearchRequest("orderline");
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		SearchHit[] searchHit = searchResponse.getHits().getHits();

		List<OrderLine> orderLineList = new ArrayList<>();

		for (SearchHit hit : searchHit) {
			orderLineList.add(objectMapper.convertValue(hit.getSourceAsMap(), OrderLine.class));
		}

		log.debug("output", orderLineList);

		return orderLineList;

	}

	/**
	 * @param orderId the id of the Order
	 * @return the Order in body
	 */
	@Override
	public Order findOrderByOrderId(String orderId) {

		log.debug("input", orderId);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		/*
		 * String[] includeFields = new String[] { "iDPcode", "image" }; String[]
		 * excludeFields = new String[] { "category.*" };
		 * searchSourceBuilder.fetchSource(includeFields, excludeFields);
		 */
		searchSourceBuilder.query(termQuery("orderId.keyword", orderId));

		SearchRequest searchRequest = new SearchRequest("order");
		searchRequest.source(searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}
		log.debug("output", serviceUtility.getObjectResult(searchResponse, new Order()));

		return serviceUtility.getObjectResult(searchResponse, new Order());
	}

	/**
	 * @param statusName the name of the Status
	 * @param pageable   ,the pageable to create
	 * @return the page of Order in body
	 */
	@Override
	public Page<Order> findOrderByStatusName(String statusName, Pageable pageable) {

		log.debug("input", statusName);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(matchQuery("status.name.keyword", statusName));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("order", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		log.debug("output", serviceUtility.getPageResult(searchResponse, pageable, new Order()));

		return serviceUtility.getPageResult(searchResponse, pageable, new Order());
	}

	/**
	 * @param from     the from date of Order
	 * @param to       the to date of Order
	 * @param storeId  the sttoreId of order
	 * @param pageable the pageable to create
	 * @return page of Order in body
	 */
	@Override
	public Page<Order> findOrderByDatebetweenAndStoreId(Instant from, Instant to, String storeId, Pageable pageable) {

		log.debug("inputs", from, to, storeId);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(QueryBuilders.boolQuery().must(termQuery("storeId.keyword", storeId))
				.must(rangeQuery("date").gte(from).lte(to)));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("order", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		log.debug("output", serviceUtility.getPageResult(searchResponse, pageable, new Order()));

		return serviceUtility.getPageResult(searchResponse, pageable, new Order());

	}

	/**
	 * @param orderId  the id of order
	 * @param pageable the pageable to create
	 * @return page of OrderLine in body
	 */
	@Override
	public Page<OrderLine> findAllOrderLinesByOrderId(Long orderId, Pageable pageable) {

		log.debug("input", orderId);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("order.id", orderId));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("orderline", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		log.debug("output", serviceUtility.getPageResult(searchResponse, pageable, new OrderLine()));

		return serviceUtility.getPageResult(searchResponse, pageable, new OrderLine());

	}

	/**
	 * @param receiverId  the receiverId of Notification
	 * @param staus the staus of Notification
	 * @return Long
	 */
	@Override
	public Long findNotificationCountByReceiverIdAndStatusName(String receiverId, String status) {

		log.debug("input",receiverId,status);
		
		CountRequest countRequest = new CountRequest("notification"); // <1>

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder(); // <2>

		searchSourceBuilder.query(QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("receiverId", receiverId))
				.must(QueryBuilders.matchQuery("status", status))); // <3>

		countRequest.source(searchSourceBuilder);

		CountResponse countResponse = null;
		try {
			countResponse = restHighLevelClient.count(countRequest, RequestOptions.DEFAULT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		log.debug("countResponse",countResponse);
		
		long count = countResponse.getCount();

		log.debug("output",count);
		return count;

	}
	
	/**
	 * Return Notification in descending order
	 * @param receiverId  the receiverId of Notification
	 * @param pageable the Pageable to create
	 * @return the Page of Notification in body
	 */
	@Override
	public Page<Notification> findNotificationByReceiverId(String receiverId, Pageable pageable) {

		log.debug("input",receiverId);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("receiverId.keyword", receiverId));
		searchSourceBuilder.sort(new FieldSortBuilder("_id").order(SortOrder.DESC));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("notification", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		return serviceUtility.getPageResult(searchResponse, pageable, new Notification());
	}

	/**
	 * @param orderLineId  the id of OrderLine
	 * @param pageable the Pageable to create
	 * @return the Page of AuxilaryOrderLine in body
	 */
	@Override
	public Page<AuxilaryOrderLine> findAuxilaryOrderLineByOrderLineId(Long orderLineId, Pageable pageable) {

		log.debug("input",orderLineId);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("orderLine.id", orderLineId));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("auxilaryorderline", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		
		SearchResponse searchResponse = null;
		
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new AuxilaryOrderLine()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new AuxilaryOrderLine());

	}

	/**
	 * @param customerId  the customerId of Address
	 * @param pageable the Pageable to create
	 * @return the Page of Address in body
	 */
	@Override
	public Page<Address> findAllSavedAddresses(String customerId, Pageable pageable) {
		
		log.debug("input",customerId);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("customerId.keyword", customerId));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("orderaddress", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new Address()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new Address());
	}

}
