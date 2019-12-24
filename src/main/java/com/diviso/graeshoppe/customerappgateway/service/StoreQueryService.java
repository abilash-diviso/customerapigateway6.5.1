package com.diviso.graeshoppe.customerappgateway.service;

import java.io.IOException;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.customerappgateway.client.store.model.Banner;
import com.diviso.graeshoppe.customerappgateway.client.store.model.DeliveryInfo;
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

public interface StoreQueryService {

	/*Page<Review> findAllReviews(Pageable pageable);

	Page<UserRating> findAllUserRatings(Pageable pageable);*/

	Store findStoreByRegNo(String regNo);

	List<ResultBucket> findRatingCount(Pageable pageable);

	Page<Store> findStoreByDeliveryType(String deliveryType, Pageable pageable);

	//Page<Store> findStoreByType(String name, Pageable pageable);

	Page<Store> findStoreByTypeName(String name, Pageable pageable);

	Page<Store> findStoreBySearchTerm(String searchTerm, Pageable pageable);

	Page<Type> findAllDeliveryTypesByStoreId(Long storeId, Pageable pageable);

	DeliveryInfo findDeliveryInfoById(Long id);

	Page<Store> findStoreByRating(Pageable pageable);

	Page<DeliveryInfo> findDeliveryInfoByStoreId(String storeId, Pageable pageable);

	Page<Store> findStoreByLocationName(String locationName, Pageable pageable);

	Page<Store> findAndSortStoreByMinAmount(Pageable pageable);

	Page<StoreType> findStoreTypeByStoreId(String storeId, Pageable pageable);

	Page<Store> facetSearchByStoreTypeName(StoreTypeWrapper storeTypeWrapper, Pageable pageable);

	Page<Store> findAllStores(Pageable pageable);

	List<ResultBucket> findStoreTypeAndCount(Pageable pageable);

	Page<Store> findByLocationNear(Double lat, Double lon, Double distance, String distanceUnit, Pageable pageable);

	Page<Store> headerSearch(String searchTerm, Pageable pageable) throws IOException;

	StoreSettings getStoreSettings(String iDPCode);

	StoreAddress getStoreAddress(String iDPCode);

	Store findStoreById(Long id);

	Page<UserRatingReview> findUserRatingReviewByRegNo(String regNo, Pageable pageable);
	 Long findUserRatingReviewCountByRegNo(String regNo);

	Page<Banner> findStoreBanner(Pageable pageable);

}
