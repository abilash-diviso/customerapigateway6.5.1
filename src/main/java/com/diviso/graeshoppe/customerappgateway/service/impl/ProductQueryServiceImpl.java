package com.diviso.graeshoppe.customerappgateway.service.impl;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.filter.Filter;
import org.elasticsearch.search.aggregations.bucket.filter.FilterAggregationBuilder;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.customerappgateway.client.product.api.ProductResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.product.model.AuxilaryLineItem;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Category;
import com.diviso.graeshoppe.customerappgateway.client.product.model.ComboLineItem;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Discount;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Product;
import com.diviso.graeshoppe.customerappgateway.client.product.model.ProductDTO;
import com.diviso.graeshoppe.customerappgateway.client.product.model.StockCurrent;
import com.diviso.graeshoppe.customerappgateway.domain.ResultBucket;
import com.diviso.graeshoppe.customerappgateway.service.ProductQueryService;
import com.diviso.graeshoppe.customerappgateway.service.mapper.ProductMapper;
import com.diviso.graeshoppe.customerappgateway.web.rest.QueryResource;
import com.diviso.graeshoppe.customerappgateway.web.rest.util.ServiceUtility;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ProductQueryServiceImpl implements ProductQueryService {

	private final Logger log = LoggerFactory.getLogger(ProductQueryServiceImpl.class);

	@Autowired
	ServiceUtility serviceUtility;

	@Autowired
	ProductMapper productMapper;

	private RestHighLevelClient restHighLevelClient;

	private ObjectMapper objectMapper;

	public ProductQueryServiceImpl(ObjectMapper objectMapper, RestHighLevelClient restHighLevelClient) {
		this.objectMapper = objectMapper;
		this.restHighLevelClient = restHighLevelClient;
	}

	/**
	 * This method always returns Page of products which excludes the sub-objects
	 * like category and brand.
	 * 
	 * @param searchTerm the name of the Product
	 * @param pageable   the pageable to create
	 * @return the page of Category in body
	 */
	@Override
	public Page<Product> findAllProductBySearchTerm(String searchTerm, Pageable pageable) {
		log.debug("input:", searchTerm);
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		String[] includeFields = new String[] { "iDPcode", "image" };
		String[] excludeFields = new String[] { "category.*", "brand.*" };
		searchSourceBuilder.fetchSource(includeFields, excludeFields);

		searchSourceBuilder.query(matchQuery("name", searchTerm).prefixLength(3));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("product", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output:", serviceUtility.getPageResult(searchResponse, pageable, new Product()));

		return serviceUtility.getPageResult(searchResponse, pageable, new Product());

	}

	/**
	 * This method always returns Page of products which excludes the sub-objects
	 * like category and brand.
	 * 
	 * @param categoryId the id of the Category
	 * @param pageable   the pageable to create
	 * @return the page of Category in body
	 */
	@Override
	public Page<Product> findProductByCategoryId(Long categoryId, String userId, Pageable pageable) {
		log.debug("inputs", categoryId, userId);
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		String[] includeFields = new String[] { "iDPcode", "image" };
		String[] excludeFields = new String[] { "category.*", "brand.*" };
		searchSourceBuilder.fetchSource(includeFields, excludeFields);

		searchSourceBuilder.query(QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("category.id", categoryId))
				.must(QueryBuilders.matchQuery("iDPcode", userId)));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("product", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output", serviceUtility.getPageResult(searchResponse, pageable, new Product()));

		return serviceUtility.getPageResult(searchResponse, pageable, new Product());

	}

	/**
	 * @param productId the id of the product
	 * @param pageable  the pageable to create
	 * @return the page of StockCurrent in body
	 */
	@Override
	public Page<StockCurrent> findStockCurrentByProductId(Long productId, Pageable pageable) {

		log.debug("input", productId);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		/*
		 * String[] includeFields = new String[] { "iDPcode"}; String[] excludeFields =
		 * new String[] { "category.*" }; searchSourceBuilder.fetchSource(includeFields,
		 * excludeFields);
		 */
		searchSourceBuilder.query(termQuery("product.id", productId));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("stockcurrent", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}
		log.debug("output", serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent()));

		return serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent());

	}

	/**
	 * @param name     the id of the product
	 * @param storeId  the iDPcode of the product
	 * @param pageable the pageable to create
	 * @return the page of StockCurrent in body
	 */
	@Override
	public Page<StockCurrent> findStockCurrentByProductName(String name, String storeId, Pageable pageable) {

		log.debug("inputs", name, storeId);

		QueryBuilder query = QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("product.name", name))
				.must(QueryBuilders.matchQuery("product.iDPcode", storeId))
				.filter(QueryBuilders.termQuery("product.isAuxilaryItem", "false"));

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		/*
		 * String[] includeFields = new String[] { "iDPcode"}; String[] excludeFields =
		 * new String[] { "category.*" }; searchSourceBuilder.fetchSource(includeFields,
		 * excludeFields);
		 */
		searchSourceBuilder.query(query);

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("stockcurrent", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output", serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent()));

		return serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent());

	}

	/**
	 * @param storeId  the iDPcode of the product
	 * @param pageable the pageable to create
	 * @return the page of Product in body
	 */
	@Override
	public Page<Product> findAllProductsByStoreId(String storeId, Pageable pageable) {

		log.debug("input", storeId);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		/*
		 * String[] includeFields = new String[] { "iDPcode"}; String[] excludeFields =
		 * new String[] { "category.*" }; searchSourceBuilder.fetchSource(includeFields,
		 * excludeFields);
		 */
		searchSourceBuilder.query(termQuery("iDPcode.keyword", storeId));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("product", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output", serviceUtility.getPageResult(searchResponse, pageable, new Product()));

		return serviceUtility.getPageResult(searchResponse, pageable, new Product());
	}

	/**
	 * This method returns page of StockCurrent according to idpcode and is
	 * filtered, if product is not auxilaryItem,that is isAuxilaryItem is "false"
	 * 
	 * @param iDPcode  the iDPcode of the product
	 * @param pageable the pageable to create
	 * @return the page of StockCurrent in body
	 */
	@Override
	public Page<StockCurrent> findStockCurrentByStoreId(String iDPcode, Pageable pageable) {

		log.debug("input", iDPcode);

		QueryBuilder query = QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("iDPcode", iDPcode))
				.filter(QueryBuilders.termQuery("product.isAuxilaryItem", "false"));

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		/*
		 * String[] includeFields = new String[] { "iDPcode"}; String[] excludeFields =
		 * new String[] { "category.*" }; searchSourceBuilder.fetchSource(includeFields,
		 * excludeFields);
		 */
		searchSourceBuilder.query(query);

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("stockcurrent", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output", serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent()));

		return serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent());

	}

	/*
	 * @Override public Page<ResultBucket> findCategoryAndCount(Pageable pageable) {
	 * List<ResultBucket> resultBucketList = new ArrayList<>(); //SearchRequest
	 * searchRequest = new SearchRequest("product"); SearchSourceBuilder
	 * searchSourceBuilder = new SearchSourceBuilder();
	 * searchSourceBuilder.query(matchAllQuery());
	 * searchSourceBuilder.aggregation(AggregationBuilders.terms("totalcategories").
	 * field("category.name.keyword"));
	 * 
	 * SearchRequest searchRequest = serviceUtility.generateSearchRequest("product",
	 * pageable.getPageSize(), pageable.getPageNumber(), searchSourceBuilder);
	 * 
	 * 
	 * 
	 * 
	 * //searchRequest.source(searchSourceBuilder); SearchResponse searchResponse =
	 * null; try { searchResponse = restHighLevelClient.search(searchRequest,
	 * RequestOptions.DEFAULT); } catch (IOException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * System.out.println("elasticsearch response: {} totalhitssshits" +
	 * searchResponse.getHits().getTotalHits());
	 * System.out.println("elasticsearch response: {} hits .toostring" +
	 * searchResponse.toString()); // searchResponse.getHits(). Aggregations
	 * aggregations = searchResponse.getAggregations(); Terms categoryAggregation =
	 * searchResponse.getAggregations().get("totalcategories"); for (Terms.Bucket
	 * bucket : categoryAggregation.getBuckets()) { ResultBucket result = new
	 * ResultBucket(); result.setKey(bucket.getKey().toString());
	 * result.setDocCount(bucket.getDocCount());
	 * result.setKeyAsString(bucket.getKeyAsString()); resultBucketList.add(result);
	 * System.out.println("KEY:" + bucket.getKey() + "!!keyAsString:" +
	 * bucket.getKeyAsString() + "!!count:" + bucket.getDocCount());
	 * 
	 * }
	 * 
	 * //return resultBucketList;
	 * 
	 * return new PageImpl<>(resultBucketList, pageable, resultBucketList.size());
	 * 
	 * }
	 * 
	 * 
	 */
	/**
	 * TO_DO DESC:@author rafeek
	 * 
	 * @param storeId  the iDPcode of the product
	 * @param pageable the pageable to create
	 * @return the page of ResultBucket in body
	 */
	@Override
	public List<ResultBucket> findCategoryAndCountByStoreId(String storeId, Pageable pageable) {

		log.debug("input", "storeId");

		List<ResultBucket> resultBucketList = new ArrayList<>();

		 SearchRequest searchRequest = new SearchRequest("product");

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		FilterAggregationBuilder filterAggregationBuilder = AggregationBuilders.filter("byStoreFilter",
				QueryBuilders.termQuery("iDPcode.keyword", storeId));

		TermsAggregationBuilder aggregation = AggregationBuilders.terms("by_categories").field("category.name.keyword").size(50);

		filterAggregationBuilder.subAggregation(aggregation);

		searchSourceBuilder.aggregation(filterAggregationBuilder);

		searchSourceBuilder.query(QueryBuilders.matchAllQuery());

		

		searchRequest.source(searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) {

			e.printStackTrace();
		}

		Aggregations aggregations = searchResponse.getAggregations();

		Filter byStoreFilterAggregation = aggregations.get("byStoreFilter");

		Terms byCompanyAggregation = byStoreFilterAggregation.getAggregations().get("by_categories");
//refactor by for each
		for (Terms.Bucket bucket : byCompanyAggregation.getBuckets()) {

			ResultBucket result = new ResultBucket();

			result.setKey(bucket.getKey().toString());

			result.setDocCount(bucket.getDocCount());

			result.setKeyAsString(bucket.getKeyAsString());

			resultBucketList.add(result);

			log.debug("KEY:" + bucket.getKey() + "!!keyAsString:" + bucket.getKeyAsString() + "!!count:"
					+ bucket.getDocCount());

		}
		// 

		

		//return new PageImpl<>(resultBucketList, pageable, resultBucketList.size());
		return resultBucketList;
	}

	/**
	 * @param productName the name of product
	 * @param storeId     the iDPcode of the StockCurrent
	 * @param pageable    the pageable to create
	 * @return the page of StockCurrent in body
	 */
	@Override
	public Page<StockCurrent> findAllStockCurrentByProductNameStoreId(String productName, String storeId,
			Pageable pageable) {

		log.debug("inputs", productName, storeId);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		/*
		 * String[] includeFields = new String[] { "iDPcode"}; String[] excludeFields =
		 * new String[] { "category.*" }; searchSourceBuilder.fetchSource(includeFields,
		 * excludeFields);
		 */

		searchSourceBuilder.query(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("iDPcode.keyword", storeId))
				.must(QueryBuilders.termQuery("product.name.keyword", productName)));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("stockcurrent", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output", serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent()));

		return serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent());

	}

	/**
	 * @param iDPcode  the iDPcode of Category
	 * @param pageable the pageable to create
	 * @return the page of Category in body
	 */
	@Override
	public Page<Category> findCategoryByIDPcode(String iDPcode, Pageable pageable) {
		log.debug("input", iDPcode);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		/*
		 * String[] includeFields = new String[] { "iDPcode"}; String[] excludeFields =
		 * new String[] { "category.*" }; searchSourceBuilder.fetchSource(includeFields,
		 * excludeFields);
		 */

		searchSourceBuilder.query(termQuery("iDPcode.keyword", iDPcode));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("category", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output", serviceUtility.getPageResult(searchResponse, pageable, new Category()));

		return serviceUtility.getPageResult(searchResponse, pageable, new Category());

	}

	/*
	 * @Override public Page<Product> findProductByStoreIdAndCategoryName(String
	 * userId, String categoryName, Pageable pageable) { SearchSourceBuilder
	 * searchSourceBuilder = new SearchSourceBuilder(); String[] includeFields = new
	 * String[] { "iDPcode", "image" }; String[] excludeFields = new String[] {
	 * "category.*" }; searchSourceBuilder.fetchSource(includeFields,
	 * excludeFields);
	 * 
	 * searchSourceBuilder.query(QueryBuilders.boolQuery().must(QueryBuilders.
	 * termQuery("iDPcode.keyword", userId))
	 * .must(QueryBuilders.termQuery("category.name.keyword", categoryName)));
	 * 
	 * SearchRequest searchRequest = serviceUtility.generateSearchRequest("product",
	 * pageable.getPageSize(), pageable.getPageNumber(), searchSourceBuilder);
	 * SearchResponse searchResponse = null; try { searchResponse =
	 * restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT); } catch
	 * (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
	 * serviceUtility.getPageResult(searchResponse, pageable, new Product());
	 * 
	 * }
	 */

	/**
	 * This method returns page of StockCurrent according to userid and ctegoryid
	 * and is filtered, if product is not auxilaryItem,that is isAuxilaryItem is
	 * "false"
	 * 
	 * @param userId     the iDPcode of StockCurrent
	 * @param categoryId the id to Category
	 * @return the List of StockCurrent in body
	 */
	@Override
	public List<StockCurrent> findStockCurrentByStoreIdAndCategoryId(String userId, Long categoryId) {

		log.debug("input", userId);

		QueryBuilder query = QueryBuilders.boolQuery().must(QueryBuilders.termQuery("iDPcode.keyword", userId))
				.must(QueryBuilders.termQuery("product.category.id", categoryId))
				.filter(QueryBuilders.termQuery("product.isAuxilaryItem", "false"));

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(query);

		SearchRequest searchRequest = new SearchRequest("stockcurrent");

		searchRequest.source(searchSourceBuilder);

		SearchResponse searchResponse = null;

		try {

			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		SearchHit[] searchHit = searchResponse.getHits().getHits();

		List<StockCurrent> stockCurrentList = new ArrayList<>();

		for (SearchHit hit : searchHit) {

			StockCurrent s = objectMapper.convertValue(hit.getSourceAsMap(), StockCurrent.class);
			s.getProduct().getImageLink();
			// System.out.println("image Link
			// issssssssssssssssssss"+s.getProduct().getImageLink());
			stockCurrentList.add(objectMapper.convertValue(hit.getSourceAsMap(), StockCurrent.class));
		}

		return stockCurrentList;

	}

	/*
	 * @Override public Page<StockCurrent>
	 * findStockCurrentByStoreIdAndCategoryId(String userId, Long categoryId,
	 * Pageable pageable) {
	 * 
	 * QueryBuilder query =
	 * QueryBuilders.boolQuery().must(QueryBuilders.termQuery("iDPcode.keyword",
	 * userId)) .must(QueryBuilders.termQuery("product.category.id", categoryId))
	 * .filter(QueryBuilders.termQuery("product.isAuxilaryItem", "false"));
	 * 
	 * SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
	 * searchSourceBuilder.query(query); SearchRequest searchRequest =
	 * serviceUtility.generateSearchRequest("stockcurrent", pageable.getPageSize(),
	 * pageable.getPageNumber(), searchSourceBuilder); SearchResponse searchResponse
	 * = null; try { searchResponse = restHighLevelClient.search(searchRequest,
	 * RequestOptions.DEFAULT); } catch (IOException e) { // TODO Auto-generated
	 * e.printStackTrace(); }
	 * 
	 * SearchHit[] searchHit = searchResponse.getHits().getHits();
	 * 
	 * List<Product> productList = new ArrayList<>();
	 * 
	 * for (SearchHit hit : searchHit) {
	 * productList.add(objectMapper.convertValue(hit.getSourceAsMap(),
	 * Product.class)); } return findStockCurrentByProductId(productList);
	 * 
	 * SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
	 * searchSourceBuilder.query(query); SearchResponse searchResponse =
	 * serviceUtility.searchResponseForPage("stockcurrent", searchSourceBuilder,
	 * pageable);
	 * 
	 * return serviceUtility.getPageResult(searchResponse, pageable, new
	 * StockCurrent()); }
	 */

	/*
	 * private List<StockCurrent> findStockCurrentByProductId(List<Product>
	 * productList) { List<StockCurrent> resultList = new ArrayList<>();
	 * SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
	 * 
	 * String[] includeFields = new String[] { "iDPcode", "image" }; String[]
	 * excludeFields = new String[] { "category.*" };
	 * searchSourceBuilder.fetchSource(includeFields, excludeFields);
	 * 
	 * for (Product product : productList) {
	 * searchSourceBuilder.query(termQuery("product.id", product.getId()));
	 * 
	 * SearchRequest searchRequest = new SearchRequest("stockcurrent");
	 * searchRequest.source(searchSourceBuilder); SearchResponse searchResponse =
	 * null; try { searchResponse = restHighLevelClient.search(searchRequest,
	 * RequestOptions.DEFAULT); } catch (IOException e) { // TODO Auto-generated
	 * e.printStackTrace(); }
	 * 
	 * SearchHit[] searchHit = searchResponse.getHits().getHits();
	 * 
	 * List<StockCurrent> stockCurrentList = new ArrayList<>();
	 * 
	 * for (SearchHit hit : searchHit) {
	 * stockCurrentList.add(objectMapper.convertValue(hit.getSourceAsMap(),
	 * StockCurrent.class)); } resultList.add(stockCurrentList.get(0));
	 * 
	 * } return resultList; }
	 */

	/**
	 * 
	 * @param id the id of the Product
	 * @return the Product in body
	 */
	@Override
	public Product findProductById(Long id) {
		log.debug("input", id);

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		/*
		 * String[] includeFields = new String[] { "iDPcode", "image" }; String[]
		 * excludeFields = new String[] { "category.*" };
		 * searchSourceBuilder.fetchSource(includeFields, excludeFields);
		 */
		searchSourceBuilder.query(termQuery("id", id));

		SearchRequest searchRequest = new SearchRequest("product");
		searchRequest.source(searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output", serviceUtility.getObjectResult(searchResponse, new Product()));

		return serviceUtility.getObjectResult(searchResponse, new Product());

	}

	/**
	 * This method returns page of StockCurrent in given range of selling price,
	 * sorting in according to descending order of selling price
	 * 
	 * @param from     the from of the Double
	 * @param to       the to of Double
	 * @param pageable the pageable to create
	 * @return page of StockCurrent in body
	 */
	@Override
	public Page<StockCurrent> findAndSortProductByPrice(Double from, Double to, Pageable pageable) {

		log.debug("input",from,to);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(rangeQuery("sellPrice").gte(from).lte(to));
		searchSourceBuilder.sort(new FieldSortBuilder("sellPrice").order(SortOrder.DESC));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("stockcurrent", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}
		
		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent()));

		return serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent());

	}

	/**
	 * * This method always returns Page of products which excludes the sub-objects
	 * like category and brand.
	 * 
	 * @param name     the name of the Product
	 * @param pageable the pageable to create
	 * @return the page of Product in body
	 */
	@Override
	public Page<Product> findProductsByCategoryName(String name, Pageable pageable) {
		
		log.debug("input",name);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		
		String[] includeFields = new String[] { "iDPcode", "image" };
		
		String[] excludeFields = new String[] { "category.*", "brand.*" };
		
		searchSourceBuilder.fetchSource(includeFields, excludeFields);

		searchSourceBuilder.query(matchQuery("category.name", name));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("product", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}
		return serviceUtility.getPageResult(searchResponse, pageable, new Product());
	}

	/**
	 * @param productId the id of the Product
	 * @param pageable  the pageable to create
	 * @return the page of AuxilaryLineItem in body
	 */
	@Override
	public Page<AuxilaryLineItem> findAllAuxilariesByProductId(Long productId, Pageable pageable) {
		
		log.debug("input",productId);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("product.id", productId));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("auxilarylineitem", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new AuxilaryLineItem()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new AuxilaryLineItem());

	}

	/**
	 * @param categoryName the name of the category
	 * @param storeId      the iDPcode of product
	 * @param pageable     the pageable to create
	 * @return the page of StockCurrent in body
	 */
	@Override
	public Page<StockCurrent> findStockCurrentByCategoryNameAndStoreId(String categoryName, String storeId,
			Pageable pageable) {
		
		log.debug("input",categoryName,storeId);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(
				QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("product.category.name.keyword", categoryName))
						.must(QueryBuilders.matchQuery("product.iDPcode", storeId)));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("stockcurrent", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new StockCurrent());

	}

	/**
	 * @param productId the id of the product
	 * @param pageable  the pageable to create
	 * @return the page of ComboLineItem in body
	 */
	@Override
	public Page<ComboLineItem> findAllCombosByProductId(Long productId, Pageable pageable) {
		
		log.debug("input",productId);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("product.id", productId));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("combolineitem", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new ComboLineItem()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new ComboLineItem());
	}

	/**
	 * This method returns discount from corresponding product
	 * @param productId the id of the product
	 * @return the  Discount in body
	 */
	@Override
	public Discount findDiscountByProductId(Long productId) {
		
		log.debug("input",productId);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("id", productId));

		SearchRequest searchRequest = new SearchRequest("product");
		searchRequest.source(searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output",serviceUtility.getObjectResult(searchResponse, new Product()).getDiscount());
		
		return serviceUtility.getObjectResult(searchResponse, new Product()).getDiscount();

	}

	/**
	 * @param id the id of the product
	 * @return the  ProductDTO in body
	 */
	public ProductDTO findProductDTO(Long id) {
		
		log.debug("input",id);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("id", id));

		SearchRequest searchRequest = new SearchRequest("product");
		searchRequest.source(searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		Product product = serviceUtility.getObjectResult(searchResponse, new Product());

		log.debug("product",product);
		
		log.debug("output",productMapper.toDto(product));
		
		return productMapper.toDto(product);
	}

}
