package com.diviso.graeshoppe.customerappgateway.service.impl;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;
import org.elasticsearch.index.query.QueryBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.core.CountRequest;
import org.elasticsearch.client.core.CountResponse;
import org.elasticsearch.common.unit.DistanceUnit;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.ScoreSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.diviso.graeshoppe.customerappgateway.client.store.model.Banner;
import com.diviso.graeshoppe.customerappgateway.client.store.model.DeliveryInfo;
import com.diviso.graeshoppe.customerappgateway.client.store.model.HeaderSearch;
/*import com.diviso.graeshoppe.customerappgateway.client.store.domain.RatingReview;*/
import com.diviso.graeshoppe.customerappgateway.client.store.model.Review;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Store;
import com.diviso.graeshoppe.customerappgateway.client.store.model.StoreAddress;
import com.diviso.graeshoppe.customerappgateway.client.store.model.StoreSettings;
import com.diviso.graeshoppe.customerappgateway.client.store.model.StoreType;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Type;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRating;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRatingReview;
import com.diviso.graeshoppe.customerappgateway.domain.ResultBucket;
import com.diviso.graeshoppe.customerappgateway.domain.StoreTypeWrapper;
import com.diviso.graeshoppe.customerappgateway.service.StoreQueryService;
import com.diviso.graeshoppe.customerappgateway.web.rest.util.ServiceUtility;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class StoreQueryServiceImpl implements StoreQueryService {

	@Autowired
	ServiceUtility serviceUtility;

	private final Logger log = LoggerFactory.getLogger(StoreQueryServiceImpl.class);

	private RestHighLevelClient restHighLevelClient;

	private ObjectMapper objectMapper;

	public StoreQueryServiceImpl(ObjectMapper objectMapper, RestHighLevelClient restHighLevelClient) {
		this.objectMapper = objectMapper;
		this.restHighLevelClient = restHighLevelClient;
	}

	/**
	 * @param pageable the pageable to create
	 * @return the page of Store in body
	 */
	@Override
	public Page<Store> findAllStores(Pageable pageable) {

		/*
		 * String[] includeFields = new String[] { ""}; String[] excludeFields = new
		 * String[] { "storeaddress.*","reviews.*" };
		 * searchSourceBuilder.fetchSource(includeFields, excludeFields);
		 */

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(matchAllQuery());
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("store", searchSourceBuilder, pageable);

		Page<Store> storePage = serviceUtility.getPageResult(searchResponse, pageable, new Store());

		/*
		 * storePage.forEach(store -> { List<UserRating> userRating =
		 * findUserRatingByRegNo(store.getRegNo(), pageable).getContent();
		 * store.setUserRatings(userRating); });
		 */

		log.debug("output", storePage);

		return storePage;

	}

	/**
	 * @param regNo the regNo of store
	 * @return the page of Store in body
	 */
	@Override
	public Store findStoreByRegNo(String regNo) {

		QueryBuilder dslQuery = termQuery("regNo.keyword", regNo);
		SearchResponse searchResponse = serviceUtility.searchResponseForObject("store", dslQuery);
		return serviceUtility.getObjectResult(searchResponse, new Store());
	}

	/**
	 * This method return the number of users rated reviewed the corresponding store
	 * by CountRequest
	 * 
	 * @param regNo the regNo of store
	 * @return the Long
	 */
	@Override
	public Long findUserRatingReviewCountByRegNo(String regNo) {

		log.debug("input", regNo);

		CountRequest countRequest = new CountRequest("userratingreview");

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("store.regNo", regNo));

		countRequest.source(searchSourceBuilder);

		CountResponse countResponse = null;
		try {
			countResponse = restHighLevelClient.count(countRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output", countResponse.getCount());

		return countResponse.getCount();
	}

	/**
	 * TO_DO:@author rafeek This method returns the storeType and its count.
	 * 
	 * @param pageable the Pageable to create
	 * @return the page of ResultBucket
	 */
	@Override
	public List<ResultBucket>/* Page<ResultBucket>*/ findStoreTypeAndCount(Pageable pageable) {

		List<ResultBucket> resultBucketList = new ArrayList<>();

		 SearchRequest searchRequest = new SearchRequest("storetype");

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(matchAllQuery());

		searchSourceBuilder.aggregation(AggregationBuilders.terms("totalstoretype").field("name.keyword").size(50));

		 searchRequest.source(searchSourceBuilder);
/*
		SearchRequest searchRequest = serviceUtility.generateSearchRequest("storetype", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);*/

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		log.debug("elasticsearch response: {} totalhitssshits" + searchResponse.getHits().getTotalHits());

		log.debug("elasticsearch response: {} hits .toostring" + searchResponse.toString());
		// searchResponse.getHits().
		Aggregations aggregations = searchResponse.getAggregations();

		Terms categoryAggregation = searchResponse.getAggregations().get("totalstoretype");

		for (Terms.Bucket bucket : categoryAggregation.getBuckets()) {

			ResultBucket result = new ResultBucket();

			result.setKey(bucket.getKey().toString());

			result.setDocCount(bucket.getDocCount());

			result.setKeyAsString(bucket.getKeyAsString());

			resultBucketList.add(result);

			log.debug("KEY:" + bucket.getKey() + "!!keyAsString:" + bucket.getKeyAsString() + "!!count:"
					+ bucket.getDocCount());

		}

		//log.debug("output", new PageImpl<>(resultBucketList, pageable, resultBucketList.size()));

		 return resultBucketList;

	//	return new PageImpl<>(resultBucketList, pageable, resultBucketList.size());
	}

	/**
	 * TO_DO:@author rafeek  This method returns the rating count of stores
	 * @param pageable the Pageable to create
	 * @return the list of ResultBucket
	 */
	@Override
	public List<ResultBucket> findRatingCount(Pageable pageable) {

		List<ResultBucket> resultBucketList = new ArrayList<>();

		SearchRequest searchRequest = new SearchRequest("storetype");

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(matchAllQuery());

		searchSourceBuilder.aggregation(AggregationBuilders.terms("ratings").field("rating"));

		searchRequest.source(searchSourceBuilder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		log.debug("elasticsearch response: {} totalhitssshits" + searchResponse.getHits().getTotalHits());

		log.debug("elasticsearch response: {} hits .toostring" + searchResponse.toString());
		// searchResponse.getHits().

		Aggregations aggregations = searchResponse.getAggregations();

		Terms categoryAggregation = searchResponse.getAggregations().get("ratings");

		for (Terms.Bucket bucket : categoryAggregation.getBuckets()) {

			ResultBucket result = new ResultBucket();

			result.setKey(bucket.getKey().toString());

			result.setDocCount(bucket.getDocCount());

			result.setKeyAsString(bucket.getKeyAsString());

			resultBucketList.add(result);

			log.debug("KEY:" + bucket.getKey() + "!!keyAsString:" + bucket.getKeyAsString() + "!!count:"
					+ bucket.getDocCount());

		}
		
		log.debug("output",resultBucketList);

		return resultBucketList;

	}

	/**
	 * @param deliveryType the name of type 
	 * @param pageable the Pageable to create
	 * @return the page of Store
	 */
	@Override
	public Page<Store> findStoreByDeliveryType(String deliveryType, Pageable pageable) {

		log.debug("input",deliveryType);
		/*
		 * String[] includeFields = new String[] { "iDPcode"}; String[] excludeFields =
		 * new String[] { "category.*" }; searchSourceBuilder.fetchSource(includeFields,
		 * excludeFields);
		 */

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		
		searchSourceBuilder.query(termQuery("deliveryInfos.type.name.keyword", deliveryType));
		
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("store", searchSourceBuilder, pageable);
		
		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new Store()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new Store());

	}

	/*
	 * @Override public Page<Store> findStoreByType(String name, Pageable pageable)
	 * {
	 * 
	 * Set<Store> storeSet = new HashSet<>(); SearchSourceBuilder
	 * searchSourceBuilder = new SearchSourceBuilder();
	 * 
	 * 
	 * String[] includeFields = new String[] { "iDPcode"}; String[] excludeFields =
	 * new String[] { "category.*" }; searchSourceBuilder.fetchSource(includeFields,
	 * excludeFields);
	 * 
	 * searchSourceBuilder.query(termQuery("name", name));
	 * 
	 * SearchRequest searchRequest = new SearchRequest("storetype"); SearchResponse
	 * searchResponse = null; try { searchResponse =
	 * restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT); } catch
	 * (IOException e) { // TODO Auto-generated e.printStackTrace(); }
	 * 
	 * SearchHit[] searchHit = searchResponse.getHits().getHits();
	 * 
	 * List<StoreType> storeTypeList = new ArrayList<>();
	 * 
	 * for (SearchHit hit : searchHit) {
	 * storeTypeList.add(objectMapper.convertValue(hit.getSourceAsMap(),
	 * StoreType.class)); }
	 * 
	 * Page<Store> storePage = serviceUtility.getPageResult(searchResponse,
	 * pageable, new Store());
	 * 
	 * for (StoreType storeType : storeTypeList) {
	 * storeSet.add(storeType.getStore()); }
	 * 
	 * return new PageImpl(new ArrayList<Store>(storeSet), pageable,
	 * searchResponse.getHits().getTotalHits()); }
	 */
	
	/**
	 * @param name the name of type 
	 * @param pageable the Pageable to create
	 * @return the page of Store
	 */
	@Override
	public Page<Store> findStoreByTypeName(String name, Pageable pageable) {
		
		log.debug("input",name);
		
		Set<Store> storeSet = new HashSet<>();
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		
		searchSourceBuilder.query(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("type.name.keyword", name)));
		
		SearchRequest searchRequest = serviceUtility.generateSearchRequest("deliveryinfo", pageable.getPageSize(),
		
				pageable.getPageNumber(), searchSourceBuilder);
		
		SearchResponse searchResponse = null;
		
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		SearchHit[] searchHit = searchResponse.getHits().getHits();

		List<DeliveryInfo> deliveryInfoList = new ArrayList<>();

		for (SearchHit hit : searchHit) {
			deliveryInfoList.add(objectMapper.convertValue(hit.getSourceAsMap(), DeliveryInfo.class));
		}
		for (DeliveryInfo delivery : deliveryInfoList) {
			storeSet.add(delivery.getStore());
		}
		
		log.debug("output",new PageImpl(new ArrayList<Store>(storeSet), pageable, searchResponse.getHits().getTotalHits()));
		
		return new PageImpl(new ArrayList<Store>(storeSet), pageable, searchResponse.getHits().getTotalHits());

	}

	/**
	 * This method return page stores, start matching with prefix length of 3.
	 * @param searchTerm the name of Store 
	 * @param pageable the Pageable to create
	 * @return the page of Store
	 */
	@Override
	public Page<Store> findStoreBySearchTerm(String searchTerm, Pageable pageable) {

		log.debug("input",searchTerm);
		/*
		 * String[] includeFields = new String[] { "iDPcode", "image" }; String[]
		 * excludeFields = new String[] { "category.*" };
		 * searchSourceBuilder.fetchSource(includeFields, excludeFields);
		 */

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		
		searchSourceBuilder.query(matchQuery("name", searchTerm).prefixLength(3));
		
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("store", searchSourceBuilder, pageable);

		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new Store()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new Store());
	}

	/**
	 * Return page of type firstly by getting deliveryInfo according to storeId, 
	 * then get type from deliveryInfo.
	 * @param storeId the id of Store 
	 * @param pageable the Pageable to create
	 * @return the page of Type in body
	 */
	@Override
	public Page<Type> findAllDeliveryTypesByStoreId(Long storeId, Pageable pageable) {
		
		log.debug("input",storeId);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("store.id", storeId));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("deliveryinfo", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated e.printStackTrace(); } return
		}

		SearchHit[] searchHit = searchResponse.getHits().getHits();

		List<DeliveryInfo> deliveryInfoList = new ArrayList<>();

		for (SearchHit hit : searchHit) {
			deliveryInfoList.add(objectMapper.convertValue(hit.getSourceAsMap(), DeliveryInfo.class));
		}
		Page<DeliveryInfo> deliveryinfos = serviceUtility.getPageResult(searchResponse, pageable, new DeliveryInfo());
		List<Type> types = new ArrayList<Type>();

		deliveryinfos.forEach(deliveryInfo -> {
			types.add(deliveryInfo.getType());

		});
		
		log.debug("otput",new PageImpl(types));
		
		return new PageImpl(types);

	}

	/**
	 
	 * @param id the id of DeliveryInfo 
	 * @param pageable the Pageable to create
	 * @return  DeliveryInfo in body
	 */
	@Override
	public DeliveryInfo findDeliveryInfoById(Long id) {
		
		log.info("input",id);
		
		// String[] includeFields = new String[] { "iDPcode", "image" };
		// String[] excludeFields = new String[] { "category.*" };

		QueryBuilder dslQuery = termQuery("id", id);
		
		SearchResponse searchResponse = serviceUtility.searchResponseForObject("deliveryinfo", dslQuery);
		
		log.debug("output",serviceUtility.getObjectResult(searchResponse, new DeliveryInfo()));
		
		return serviceUtility.getObjectResult(searchResponse, new DeliveryInfo());

	}

	/**
	 * Return Page of stores in descending order of totalRating range from 5 to 1.
	 * @param pageable the Pageable to create
	 * @return  page of Store in body
	 */
	@Override
	public Page<Store> findStoreByRating(Pageable pageable) {
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		
		searchSourceBuilder.query(rangeQuery("totalRating").gte(1).lte(5));
		
		searchSourceBuilder.sort(new FieldSortBuilder("totalRating").order(SortOrder.DESC));
		
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("store", searchSourceBuilder, pageable);
		
		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new Store()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new Store());
	}

	/**
	 * @param storeId the regNo of store
	 * @param pageable the Pageable to create
	 * @return  page of DeliveryInfo in body
	 */
	@Override
	public Page<DeliveryInfo> findDeliveryInfoByStoreId(String storeId, Pageable pageable) {

		log.debug("input",storeId);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		
		searchSourceBuilder.query(termQuery("store.regNo.keyword", storeId));
		
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("deliveryinfo", searchSourceBuilder,
				pageable);

		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new DeliveryInfo()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new DeliveryInfo());

	}

	/**
	 * TO_DO:@author rafeek 
	 * @param searchTerm the name of store
	 * @param pageable the Pageable to create
	 * @return  page of Store in body
	 */
	@Override
	public Page<Store> headerSearch(String searchTerm, Pageable pageable) throws IOException {
		
		log.debug("input",searchTerm);
		
		Set<Store> storeSet = new HashSet<Store>();
		
		Set<HeaderSearch> values = new HashSet<HeaderSearch>();
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(matchQuery("name", searchTerm));

		SearchRequest searchRequest = generateSearchRequestForMultipleIndex(pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}

		SearchHit[] searchHit = searchResponse.getHits().getHits();

		for (SearchHit hit : searchHit) {
			String h = hit.getSourceAsString();

			HeaderSearch result = new HeaderSearch();
			Map<String, Object> sourceAsMap = hit.getSourceAsMap();

			if (hit.getIndex().equals("store")) {
				result.setStoreNo((String) sourceAsMap.get("regNo"));

			} else {

				result.setStoreNo((String) sourceAsMap.get("iDPcode"));

			}

			values.add(result);
		}

		log.debug("output",findStoresByRegNoList(values, pageable));
		
		return findStoresByRegNoList(values, pageable);

	}
	
	/**
	 * @param values the HeaderSearch to create
	 * @param pageable the Pageable to create
	 * @return  page of Store in body
	 */
	public Page<Store> findStoresByRegNoList(Set<HeaderSearch> values, Pageable pageable) throws IOException {
	
		log.debug("%%%%Set<HeaderSearch> values%%%%%%%%%%%%%%%" + values);
		
		Set<Store> storeSet = new HashSet<Store>();

		for (HeaderSearch r : values) {
			storeSet.add(createHeaderQuery(r));

		}
		List<Store> storeList = new ArrayList<>();
		storeList.addAll(storeSet);
		
		log.debug("%%%%EXIT%%%%%%%%%%%%%%%" + storeList);
		
		return new PageImpl(storeList);

	}

	/**
	 * @param values the HeaderSearch to create
	 * @param pageable the Pageable to create
	 * @return  page of Store in body
	 */
	@Override
	public Page<Store> findStoreByLocationName(String locationName, Pageable pageable) {

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(matchQuery("locationName", locationName).prefixLength(3));
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("store", searchSourceBuilder, pageable);

		return serviceUtility.getPageResult(searchResponse, pageable, new Store());
	}

	/**Return Page of stores ,sorted in ascending order of minAmount
	 * @param pageable the Pageable to create
	 * @return  page of Store in body
	 */
	@Override
	public Page<Store> findAndSortStoreByMinAmount(Pageable pageable) {
		
		QueryBuilder dslQuery = matchAllQuery();
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		
		searchSourceBuilder.query(dslQuery);
		
		searchSourceBuilder.sort(new FieldSortBuilder("minAmount").order(SortOrder.ASC));
		
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("store", searchSourceBuilder, pageable);
		
		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new Store()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new Store());

	}
	/**Return Page of storeType ,which excludes the store in it.
	 * @param storeId the regNo of Store
	 * @param pageable the Pageable to create
	 * @return  page of StoreType in body
	 */
	@Override
	public Page<StoreType> findStoreTypeByStoreId(String storeId, Pageable pageable) {
		log.debug("input",storeId);
		String[] includeFields = new String[] { "id", "name" };
		String[] excludeFields = new String[] { "store.*" };

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.fetchSource(includeFields, excludeFields);

		searchSourceBuilder.query(termQuery("store.regNo.keyword", storeId));

		SearchResponse searchResponse = serviceUtility.searchResponseForPage("storetype", searchSourceBuilder,
				pageable);

		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new StoreType()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new StoreType());

	}

	/**
	 * @param IDPCode the regNo of Store
	 * @return   StoreSettings in body
	 */
	@Override
	public StoreSettings getStoreSettings(String IDPCode) {

		log.debug("input",IDPCode);
		
		QueryBuilder dslQuery = termQuery("regNo.keyword", IDPCode);
		
		SearchResponse searchResponse = serviceUtility.searchResponseForObject("store", dslQuery);
		
        log.debug("output",serviceUtility.getObjectResult(searchResponse, new Store()).getStoreSettings());
        
		return serviceUtility.getObjectResult(searchResponse, new Store()).getStoreSettings();
	}
	/**
	 * @param iDPCode the regNo of Store
	 * @return StoreAddress in body
	 */
	@Override
	public StoreAddress getStoreAddress(String iDPCode) {

		log.debug("input",iDPCode);
		
		QueryBuilder dslQuery = termQuery("regNo.keyword", iDPCode);
		
		SearchResponse searchResponse = serviceUtility.searchResponseForObject("store", dslQuery);

		log.debug("output",serviceUtility.getObjectResult(searchResponse, new Store()).getStoreAddress());
		
		return serviceUtility.getObjectResult(searchResponse, new Store()).getStoreAddress();

	}

	/*
	 * public List<ResultBucket>Page<ResultBucket> findStoreTypeAndCount1(Pageable
	 * pageable) { List<ResultBucket> resultBucketList = new ArrayList<>();
	 * //SearchRequest searchRequest = new SearchRequest("storetype");
	 * SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
	 * searchSourceBuilder.query(matchAllQuery());
	 * searchSourceBuilder.aggregation(AggregationBuilders.terms("totalstoretype").
	 * field("name.keyword"));
	 * 
	 * //searchRequest.source(searchSourceBuilder);
	 * 
	 * SearchRequest searchRequest =
	 * serviceUtility.generateSearchRequest("storetype", pageable.getPageSize(),
	 * pageable.getPageNumber(), searchSourceBuilder);
	 * 
	 * 
	 * SearchResponse searchResponse = null; try { searchResponse =
	 * restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT); } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * System.out.println("elasticsearch response: {} totalhitssshits" +
	 * searchResponse.getHits().getTotalHits());
	 * System.out.println("elasticsearch response: {} hits .toostring" +
	 * searchResponse.toString()); // searchResponse.getHits(). Aggregations
	 * aggregations = searchResponse.getAggregations(); Terms categoryAggregation =
	 * searchResponse.getAggregations().get("totalstoretype"); for (Terms.Bucket
	 * bucket : categoryAggregation.getBuckets()) { ResultBucket result = new
	 * ResultBucket(); result.setKey(bucket.getKey().toString());
	 * result.setDocCount(bucket.getDocCount());
	 * result.setKeyAsString(bucket.getKeyAsString()); resultBucketList.add(result);
	 * System.out.println("KEY:" + bucket.getKey() + "!!keyAsString:" +
	 * bucket.getKeyAsString() + "!!count:" + bucket.getDocCount());
	 * 
	 * }
	 * 
	 * //return resultBucketList; return new PageImpl<>(resultBucketList, pageable,
	 * resultBucketList.size()); }
	 */
	
	/**
     * @param lat the location split of Store
     * @param lon the location split of store
     * @param distance the distance of Double
     * @param pageable the pageable to create
     * @return page of Store in body
     */
	@Override
	public Page<Store> findByLocationNear(Double lat, Double lon, Double distance, String distanceUnit,
			Pageable pageable) {
		
		log.debug("input",lat,lon,distance,distanceUnit);
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(
				QueryBuilders.geoDistanceQuery("location").point(lat, lon).distance(distance, DistanceUnit.KILOMETERS));

		SearchRequest searchRequest = serviceUtility.generateSearchRequest("store", pageable.getPageSize(),
				pageable.getPageNumber(), searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new Store()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new Store());

	}

	
	private SearchRequest generateSearchRequestForMultipleIndex(Integer totalElement, Integer pageNumber,
			SearchSourceBuilder sourceBuilder) {
		SearchRequest searchRequest = new SearchRequest("store", "product", "category");

		int offset = 0;
		int totalElements = 0;

		if (pageNumber == 0) {
			offset = 0;
			totalElements = totalElement;

		} else {

			offset = totalElements;

			totalElements = totalElement + (pageNumber * totalElement);

		}
		sourceBuilder.from(offset);
		sourceBuilder.size(totalElements);

		searchRequest.source(sourceBuilder);
		return searchRequest;
	}

	/**
	 * @param id the id of Store
	 * @return Store in body
	 */
	@Override
	public Store findStoreById(Long id) {
		
		log.debug("input",id);
		
		QueryBuilder dslQuery = termQuery("id", id);
		
		SearchResponse searchResponse = serviceUtility.searchResponseForObject("store", dslQuery);
		
		log.debug("output",serviceUtility.getObjectResult(searchResponse, new Store()));
		
		return serviceUtility.getObjectResult(searchResponse, new Store());
	}

	/*
	 * private SearchResponse searchResponseForPage(String indexName,
	 * SearchSourceBuilder searchSourceBuilder, Pageable pageable) {
	 * 
	 * SearchRequest searchRequest = serviceUtility.generateSearchRequest(indexName,
	 * pageable.getPageSize(), pageable.getPageNumber(), searchSourceBuilder);
	 * searchRequest.source(searchSourceBuilder); SearchResponse searchResponse =
	 * null; try { searchResponse = restHighLevelClient.search(searchRequest,
	 * RequestOptions.DEFAULT); } catch (IOException e) { // TODO Auto-generated
	 * e.printStackTrace(); } return } return searchResponse; }
	 * 
	 * private SearchResponse searchResponseForObject(String indexName, QueryBuilder
	 * dslQuery) {
	 * 
	 * SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
	 * searchSourceBuilder.query(dslQuery);
	 * 
	 * SearchRequest searchRequest = new SearchRequest(indexName);
	 * searchRequest.source(searchSourceBuilder); SearchResponse searchResponse =
	 * null; try { searchResponse = restHighLevelClient.search(searchRequest,
	 * RequestOptions.DEFAULT); } catch (IOException e) { // TODO Auto-generated
	 * e.printStackTrace(); } return } return searchResponse; }
	 */

	/**TO_DO DESC:rafeek
	 * @param r the regNo of Store
	 * @return Store in body
	 */
	private Store createHeaderQuery(HeaderSearch r) {

		log.debug("input",r);
		
		QueryBuilder dslQuery = termQuery("regNo.keyword", r.getStoreNo());
		
		SearchResponse searchResponse = serviceUtility.searchResponseForObject("store", dslQuery);
		
		log.debug("output",serviceUtility.getObjectResult(searchResponse, new Store()));
		
		return serviceUtility.getObjectResult(searchResponse, new Store());
	}

	/**
	 * TO_DO DESC:rafeek
	 * @param storeTypeWrapper the StoreTypeWrapper to create
	 * @return page of Store in body
	 */
	@Override
	public Page<Store> facetSearchByStoreTypeName(StoreTypeWrapper storeTypeWrapper, Pageable pageable) {
       
		log.debug("input",storeTypeWrapper);
		
		SearchRequest searchRequest = new SearchRequest("storetype");
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		
		QueryBuilder query = QueryBuilders.termsQuery("name.keyword", storeTypeWrapper.getTypeName());

		searchSourceBuilder.query(query);
		
		searchRequest.source(searchSourceBuilder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<StoreType> storeTypeList = serviceUtility.getPageResult(searchResponse, pageable, new StoreType())
				.getContent();
		System.out.println("storeTypeListsizeeeeeeee" + storeTypeList.size());
		Set<Store> storeSet = new HashSet();
		/*
		 * storeTypeList.forEach((storeType) -> storeSet.add(storeType.getStore())
		 * 
		 * );
		 */
		for (StoreType storeType : storeTypeList) {
			storeSet.add(storeType.getStore());
			System.out.println("storeSet.sidddddddddd" + storeSet.size());
		}
		List<Store> storeList = new ArrayList<>();
		storeList.addAll(storeSet);
		System.out.println("storeListiiiiiiiiiiiiiii" + storeList.size());

		return new PageImpl(storeList);

	}
	/**
	 * @param regNo the regNo of store 
	 * @param pageable the Pageable to create
	 * @return page of UserRatingReview in body
	 */
	public Page<UserRatingReview> findUserRatingReviewByRegNo(String regNo, Pageable pageable) {

		log.debug("input",regNo);
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(termQuery("store.regNo.keyword", regNo));

		SearchResponse searchResponse = serviceUtility.searchResponseForPage("userratingreview", searchSourceBuilder,
				pageable);

		log.debug("output",serviceUtility.getPageResult(searchResponse, pageable, new UserRatingReview()));
		
		return serviceUtility.getPageResult(searchResponse, pageable, new UserRatingReview());

	}

	/**
	 *
	 * @param pageable the Pageable to create
	 * @return page of Banner in body
	 */
	@Override
	public Page<Banner> findStoreBanner(Pageable pageable) {

		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(matchAllQuery());

		SearchResponse searchResponse = serviceUtility.searchResponseForPage("banner", searchSourceBuilder, pageable);

		return serviceUtility.getPageResult(searchResponse, pageable, new Banner());
	}

	// **************************************************************************************************************************

}
