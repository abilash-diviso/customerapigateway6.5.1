package com.diviso.graeshoppe.customerappgateway.service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.diviso.graeshoppe.customerappgateway.client.product.model.AuxilaryLineItem;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Category;
import com.diviso.graeshoppe.customerappgateway.client.product.model.ComboLineItem;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Discount;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Product;
import com.diviso.graeshoppe.customerappgateway.client.product.model.ProductDTO;
import com.diviso.graeshoppe.customerappgateway.client.product.model.StockCurrent;
import com.diviso.graeshoppe.customerappgateway.domain.ResultBucket;


public interface ProductQueryService {


	Page<Product> findAllProductBySearchTerm(String searchTerm, Pageable pageable);

	Page<Product> findProductByCategoryId(Long categoryId, String userId, Pageable pageable);

	Page<StockCurrent> findStockCurrentByProductId(Long productId, Pageable pageable);

	Page<StockCurrent> findStockCurrentByProductName(String name, String storeId, Pageable pageable);

	Page<Product> findAllProductsByStoreId(String storeId, Pageable pageable);

	Page<StockCurrent> findStockCurrentByStoreId(String iDPcode, Pageable pageable);

	//Page<ResultBucket> findCategoryAndCount(Pageable pageable);

	List<ResultBucket> findCategoryAndCountByStoreId(String storeId, Pageable pageable);

	Page<StockCurrent> findAllStockCurrentByProductNameStoreId(String productName, String storeId, Pageable pageable);

	Page<Category> findCategoryByIDPcode(String iDPcode, Pageable pageable);

	//Page<Product> findProductByStoreIdAndCategoryName(String userId, String categoryName, Pageable pageable);

	List<StockCurrent> findStockCurrentByStoreIdAndCategoryId(String userId, Long categoryId);

	Product findProductById(Long id);

	Page<StockCurrent> findAndSortProductByPrice(Double from, Double to, Pageable pageable);

	Page<Product> findProductsByCategoryName(String name, Pageable pageable);

	Page<AuxilaryLineItem> findAllAuxilariesByProductId(Long productId, Pageable pageable);

	Page<StockCurrent> findStockCurrentByCategoryNameAndStoreId(String categoryName, String storeId, Pageable pageable);

	Page<ComboLineItem> findAllCombosByProductId(Long productId, Pageable pageable);

	Discount findDiscountByProductId(Long productId);
	
	public ProductDTO findProductDTO( Long id);

	
	
}
