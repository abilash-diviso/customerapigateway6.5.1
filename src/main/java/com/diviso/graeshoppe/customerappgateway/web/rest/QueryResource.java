package com.diviso.graeshoppe.customerappgateway.web.rest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.customerappgateway.client.customer.api.ContactResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.customer.api.CustomerResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.ContactDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.CustomerDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteProduct;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteStore;
import com.diviso.graeshoppe.customerappgateway.client.order.api.OrderQueryResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Address;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.AuxilaryOrderLine;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Offer;
import com.diviso.graeshoppe.customerappgateway.client.order.model.OpenTask;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Order;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.OrderLine;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Notification;
import com.diviso.graeshoppe.customerappgateway.client.product.api.CategoryResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.product.api.ProductResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.product.api.StockCurrentResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.product.model.AuxilaryLineItem;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Category;
import com.diviso.graeshoppe.customerappgateway.client.product.model.ComboLineItem;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Discount;
import com.diviso.graeshoppe.customerappgateway.client.product.model.Product;
import com.diviso.graeshoppe.customerappgateway.client.product.model.ProductDTO;
import com.diviso.graeshoppe.customerappgateway.client.product.model.StockCurrent;
import com.diviso.graeshoppe.customerappgateway.client.report.model.OrderAggregator;
import com.diviso.graeshoppe.customerappgateway.client.store.api.BannerResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.store.api.ReviewResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.store.api.StoreTypeResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.store.api.UserRatingResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.store.model.DeliveryInfo;
//import com.diviso.graeshoppe.customerappgateway.client.store.domain.RatingReview;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Review;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Store;
import com.diviso.graeshoppe.customerappgateway.client.store.model.StoreAddress;
import com.diviso.graeshoppe.customerappgateway.client.store.model.StoreSettings;
import com.diviso.graeshoppe.customerappgateway.client.store.model.StoreType;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Type;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRating;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRatingReview;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Banner;
import com.diviso.graeshoppe.customerappgateway.client.store.model.BannerDTO;
import com.diviso.graeshoppe.customerappgateway.domain.ResultBucket;
import com.diviso.graeshoppe.customerappgateway.domain.StoreTypeWrapper;
import com.diviso.graeshoppe.customerappgateway.service.CustomerQueryService;
import com.diviso.graeshoppe.customerappgateway.service.OfferQueryService;
import com.diviso.graeshoppe.customerappgateway.service.OrderQueryService;
import com.diviso.graeshoppe.customerappgateway.service.ProductQueryService;
import com.diviso.graeshoppe.customerappgateway.service.StoreQueryService;

@RestController
@RequestMapping("/api/query")
public class QueryResource {

	private final Logger log = LoggerFactory.getLogger(QueryResource.class);
	@Autowired
	ProductQueryService productQueryService;

	@Autowired
	StoreQueryService storeQueryService;

	@Autowired
	CustomerQueryService customerQueryService;

	@Autowired
	OrderQueryService orderQueryService;

	@Autowired
	OfferQueryService offerQueryService;

	@Autowired
	com.diviso.graeshoppe.customerappgateway.client.report.api.QueryResourceApi reportQueryResourceApi;

	@Autowired
	private OrderQueryResourceApi orderQueryResourceApi;

	// ****************Customer related end points********
	
	/**
     * GET  /findCustomerByMobileNumber/:mobileNumber : Get the mobileNumber based CustomerDTO
     * @param mobileNumber the mobileNumber of the CustomerDTO
     * @return the ResponseEntity with status 201 (Created) and with body the new CustomerDTO, or with status 400 (Bad Request) if the review has already an ID
     */
	@GetMapping("/findCustomerByMobileNumber/{mobileNumber}")
	public ResponseEntity<CustomerDTO> findByMobileNumber(@PathVariable Long mobileNumber) {
		CustomerDTO result= customerQueryService.findByMobileNumber(mobileNumber);
		return  ResponseEntity.ok().body(result);
		
	}

	/**
     * GET  /customers/findCustomerByIdpCode/:idpCode : Get the idpCode based CustomerDTO
     * @param idpCode the idpCode of the CustomerDTO
     * @return the ResponseEntity with status 201 (Created) and with body the new CustomerDTO, or with status 400 (Bad Request) if the review has already an ID
     */
	@GetMapping("/customers/findCustomerByIdpCode/{idpCode}")
	public ResponseEntity<CustomerDTO> findCustomerByIdpCode(@PathVariable String idpCode) {
		CustomerDTO result = customerQueryService.findCustomerByIdpCode(idpCode);
		return  ResponseEntity.ok().body(result);
	}

	/**
     * GET  /contacts/:id : Get the id based CustomerDTO
     * @param id the id of the CustomerDTO
     * @return the ResponseEntity with status 201 (Created) and with body the new CustomerDTO, or with status 400 (Bad Request) if the review has already an ID
     */
	@GetMapping("/contacts/{id}")
	public ResponseEntity<ContactDTO> findContactById(@PathVariable Long id) {
		ContactDTO result =customerQueryService.findContactById(id);
		return  ResponseEntity.ok().body(result);
	}

	/**
     * GET  /checkUserExistsByIdpcode/:idpCode : Get the idpCode based status
     * @param idpCode the idpCode of the CustomerDTO
     * @return Boolean, true when user exist with given idpCode otherwise false.
     */
	@GetMapping("/checkUserExistsByIdpcode/{idpCode}")
	public Boolean checkUserExistsByIdpcode(@PathVariable String idpCode) {
		return customerQueryService.checkUserExistsByIdpCode(idpCode);
	}

	/**
     * GET  /favouriteproductsbycustomerreference/:reference : Get the reference based FavouriteProduct
     * @param idpCode the idpCode of the FavouriteProduct
     * @return  page of FavouriteProduct in body
     */
	@GetMapping("/favouriteproductsbycustomeridpcode/{idpCode}")
	public Page<FavouriteProduct> findFavouriteProductsByCustomerIdpCode(@PathVariable String idpCode,
			Pageable pageable) {

		return customerQueryService.findFavouriteProductsByCustomerIdpCode(idpCode, pageable);
	}

	/**
     * GET  /favouritestoresbycustomerreference/:reference : Get the reference based FavouriteStore
     * @param reference the idpCode of the FavouriteStore
     * @return  page of FavouriteStore in body
     */
	@GetMapping("/favouritestoresbycustomeridpcode/{idpCode}")
	public Page<FavouriteStore> findFavouriteStoresByCustomerIdpCode(@PathVariable String idpCode,
			Pageable pageable) {
		return customerQueryService.findFavouriteStoresByCustomerIdpCode(idpCode, pageable);
	}

	// ****************product related end points********
	
	/**
     * GET  /findAllCategories/:iDPcode : Get the iDPcode based Category
     * @param iDPcode the idpCode of the Category 
     * @param pageable the pageable to create
     * @return  the ResponseEntity with status 200 (OK) and the page of Category in body
     */
	@GetMapping("/findAllCategories/{iDPcode}")
	public ResponseEntity<Page<Category>> findAllCategories(@PathVariable String iDPcode, Pageable pageable) {
		return ResponseEntity.ok().body(productQueryService.findCategoryByIDPcode(iDPcode, pageable));
	}

	/**
     * GET  /products/:id : Get the id based ProductDTO
     * @param id the id of the ProductDTO 
     * @return  the ResponseEntity with status 200 (OK) and the ProductDTO in body
     */
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDTO> findProduct(@PathVariable Long id) {
	ProductDTO result= productQueryService.findProductDTO(id);
	return ResponseEntity.ok().body(result);
	}

	/**
     * GET  /findProductById/:id : Get the id based ProductDTO
     * @param id the id of the ProductDTO 
     * @return  the ResponseEntity with status 200 (OK) and the Product in body
     */
	@GetMapping("/findProductById/{id}")
	public ResponseEntity<Product> findProductById(@PathVariable Long id) {
		return ResponseEntity.ok().body(productQueryService.findProductById(id));

	}

	/**
     * GET  /findStockCurrentByProductNameStoreId/:name/:storeId : Get the name and storeId based StockCurrent
     * @param name the name of the StockCurrent 
     * @param storeId the iDPcode of the StockCurrent
     * @param  pageable to create
     * @return   page of StockCurrent in body
     */
	@GetMapping("/findStockCurrentByProductNameStoreId/{name}/{storeId}")
	public Page<StockCurrent> findStockCurrentByProductNameAndStoreId(@PathVariable String name,
			@PathVariable String storeId, Pageable pageable) {
		return productQueryService.findStockCurrentByProductName(name, storeId, pageable);
	}

	/**
     * GET  /stock-current-by-categoryname/:categoryName/:storeId : Get the categoryName and storeId based StockCurrent
     * @param categoryName the categoryName of the StockCurrent 
     * @param storeId the iDPcode of the StockCurrent
     * @param  pageable the pageable to create
     * @return page of StockCurrent in body
     */
	@GetMapping("/stock-current-by-categoryname/{categoryName}/{storeId}")
	public Page<StockCurrent> findStockCurrentByCategoryNameAndStoreId(@PathVariable String categoryName,
			@PathVariable String storeId, Pageable pageable) {
		return productQueryService.findStockCurrentByCategoryNameAndStoreId(categoryName, storeId, pageable);

	}
	/**
     * GET  /stockcurrent/:storeId : Get the storeId based StockCurrent
     * @param storeId the iDPcode of the StockCurrent
     * @param  pageable to create
     * @return the ResponseEntity with status 200 (OK) page of StockCurrent in body
     */
	@GetMapping("/stockcurrent/{storeId}")
	public ResponseEntity<Page<StockCurrent>> findStockCurrentByStoreId(@PathVariable String storeId,
			Pageable pageable) {

		return ResponseEntity.ok().body(productQueryService.findStockCurrentByStoreId(storeId, pageable));
	}

	/**
     * GET  /findCategoryAndCountBystoreId/:storeId : Get the storeId based ResultBucket
     * @param storeId the iDPcode of the Category
     * @param  pageable the pageable to create
     * @return list of ResultBucket in body
     */
	@GetMapping("/findCategoryAndCountBystoreId/{storeId}")
	public List<ResultBucket> findCategoryAndCountBystoreId(@PathVariable String storeId, Pageable pageable) {

		return productQueryService.findCategoryAndCountByStoreId(storeId, pageable);
	}
	/**
     * GET  /findProductsByCategoryName/:name : Get the name based Product
     * @param storeId the iDPcode of the Product
     * @param  pageable the pageable to create
     * @return the ResponseEntity with status 200 (OK) page of Product in body
     */
	@GetMapping("/findProductsByCategoryName/{name}")
	public Page<Product> findProductsByCategoryName(@PathVariable String name, Pageable pageable) {
		return productQueryService.findProductsByCategoryName(name, pageable);
	}

	/**
     * GET  /productByPrice/:from/:to : Get the from price to to price based StockCurrent
     * @param from the from of the Double
     * @param to the to of Double
     * @param  pageable the pageable to create
     * @return the ResponseEntity with status 200 (OK) page of StockCurrent in body
     */
	@GetMapping("/productByPrice/{from}/{to}")
	public Page<StockCurrent> findAndSortProductByPrice(@PathVariable Double from, @PathVariable Double to,
			Pageable pageable) {

		return productQueryService.findAndSortProductByPrice(from, to, pageable);
	}
	// List<StockCurrent> to Page<StockCurrent>

	/**
     * GET  /findStockCurrentByStoreIdAndCategoryId/:userId/:categoryId : Get the userId  and categoryId based StockCurrent
     * @param userId the iDPcode of the StockCurrent
     * @param categoryId the id of category
     * @param  pageable the pageable to create
     * @return list of StockCurrent in body
     */
	@GetMapping("/findStockCurrentByStoreIdAndCategoryId/{userId}/{categoryId}")
	public List<StockCurrent> findStockCurrentByStoreIdAndCategoryId(@PathVariable("userId") String userId,
			@PathVariable("categoryId") Long categoryId, Pageable pageable) {
		log.debug("REST request to findStockCurrentByStoreIdAndCategoryId : {}", userId, categoryId);
		return productQueryService.findStockCurrentByStoreIdAndCategoryId(userId, categoryId);
	}

	/**
     * GET  /auxilaries-productId/:productId: Get the productId based AuxilaryLineItem
     * @param productId the id of the product
     * @param pageable the  pageable to create
     * @return page of AuxilaryLineItem in body
     */
	@GetMapping("/auxilaries-productId/{productId}")
	public Page<AuxilaryLineItem> findAuxilariesByProductId(@PathVariable Long productId, Pageable pageable) {
		return productQueryService.findAllAuxilariesByProductId(productId, pageable);
	}


	/**
     * GET  /combos-productId/:productId: Get the productId based ComboLineItem
     * @param productId the id of the product
     * @param  pageable the pageable to create
     * @return page of ComboLineItem in body
     */
	@GetMapping("/combos-productId/{productId}")
	public Page<ComboLineItem> findComboByProductId(@PathVariable Long productId, Pageable pageable) {
		return productQueryService.findAllCombosByProductId(productId, pageable);
	}

	/**
     * GET  /discount-productId/:productId: Get the productId based Discount
     * @param productId the id of the product
     * @param  pageable the pageable to create
     * @return page of ComboLineItem in body
     */
	@GetMapping("/discount-productId/{productId}")
	public Discount findDiscountByProductId(@PathVariable Long productId) {
		return productQueryService.findDiscountByProductId(productId);
	}

	// ****************store related end points********

	/**
     * GET  /findStoreById/:id: Get the id based Store
     * @param id the id of the product
     * @return the ResponseEntity with status 200 (OK) Store in body
     */
	@GetMapping("/findStoreById/{id}")
	public ResponseEntity<Store> findStoreById(@PathVariable Long id) {
		return ResponseEntity.ok().body(storeQueryService.findStoreById(id));

	}
	/**
     * GET  /sortStoreByMinAmount: Get the id based Store
     * @param pageable the pageable to create
     * @return the ResponseEntity with status 200 (OK) Store in body
     */
	@GetMapping("/sortStoreByMinAmount")
	public Page<Store> findAndSortStoreByMinAmount(Pageable pageable) {

		return storeQueryService.findAndSortStoreByMinAmount(pageable);
	}
	/**
     * GET  /stores: Get the id based Store
     * @param pageable the pageable to create
     * @return the ResponseEntity with status 200 (OK) page of Store in body
     */

	@GetMapping("/stores")
	public ResponseEntity<Page<Store>> findAllStores(Pageable pageable) {
		return ResponseEntity.ok().body(storeQueryService.findAllStores(pageable));
	}

	/**
     * GET  /stores/:regNo Get the regNo based Store
     * @param regNo the idpCode of the Store
     * @return the ResponseEntity with status 200 (OK) page of Store in body
     */
	@GetMapping("/store/{regNo}")
	public ResponseEntity<Store> findStoreByRegisterNumber(@PathVariable String regNo) {
		return ResponseEntity.ok().body(storeQueryService.findStoreByRegNo(regNo));
	}

	/**
     * GET  /findStoreTypeAndCount: Get all storetype based ResultBucket
     * @param pageable the pageable to create
     * @return the ResponseEntity with status 200 (OK) page of ResultBucket in body
     */
	@GetMapping("/findStoreTypeAndCount")
	public List<ResultBucket> findStoreTypeAndCount(Pageable pageable) {
		return storeQueryService.findStoreTypeAndCount(pageable);
	}

	// refactored method
	// change StoreId by regNo
	/**
     * GET  /findUserRatingReview/:regNo Get the regNo based UserRatingReview
     * @param regNo the iDPcode of Store
     * @param pageable the pageable to create
     * @return the ResponseEntity with status 200 (OK) page of UserRatingReview in body
     */
	@GetMapping("/findUserRatingReview/{regNo}")
	public ResponseEntity<Page<UserRatingReview>> findUserRatingReviewByRegNo(@PathVariable String regNo,
			Pageable pageable) {
		Page<UserRatingReview> page = storeQueryService.findUserRatingReviewByRegNo(regNo, pageable);
		return ResponseEntity.ok().body(page);

	}

	/**
     * GET  /findStoreByNearLocation/:lat/:lon/:distance/:distanceUnit Get the regNo based Store
     * @param lat the location split of Store
     * @param lon the location split of store
     * @param distance the distance of Double
     * @param pageable the pageable to create
     * @return the ResponseEntity with status 200 (OK) page of Store in body
     */
	@GetMapping("/findStoreByNearLocation/{lat}/{lon}/{distance}/{distanceUnit}")
	public Page<Store> findStoreByNearLocation(@PathVariable Double lat, @PathVariable Double lon,
			@PathVariable Double distance, @PathVariable String distanceUnit, Pageable pageable) {
		return storeQueryService.findByLocationNear(lat, lon, distance, distanceUnit, pageable);
	}

	/**
     * GET  /review-count/:regNo Get the regNo based UserRatingReview
     * @param regNo the idpCode of Store
     * @param pageable the pageable to create
     * @return long 
     */
	@GetMapping("/review-count/{regNo}")
	public Long findUserRatingReviewCountByRegNo(@PathVariable String regNo) {
		Long l = storeQueryService.findUserRatingReviewCountByRegNo(regNo);
		return l;
	}


	/**
     * GET  /review-count/:regNo Get the regNo based UserRatingReview
     * @param regNo the iDPcode of Store
     * @param pageable the pageable to create
     * @return long 
     */
	@GetMapping("/deliveryTypes/{storeId}")
	public Page<Type> findAllDeliveryTypesByStoreId(@PathVariable Long storeId, Pageable pageable) {

		return storeQueryService.findAllDeliveryTypesByStoreId(storeId, pageable);

	}

	/**
     * GET  /header/:searchTerm Get the searchTerm based UserRatingReview
     * @param searchTerm the idpCode of Store
     * @param pageable the pageable to create
     * @return page of Store in body 
     * @throws IOException 
     */
	@GetMapping("/header/{searchTerm}")
	public Page<Store> header(@PathVariable("searchTerm") String searchTerm, Pageable pageable) throws IOException {
		return storeQueryService.headerSearch(searchTerm, pageable);
	}

	/**
     * GET  /storeByRating Get all store based on rating Store
     * @param pageable the pageable to create
     * @return page of Store in body 
     */
	@GetMapping("/storeByRating")
	public Page<Store> findStoreByRating(Pageable pageable) {

		return storeQueryService.findStoreByRating(pageable);
	}

	/**
     * GET  /deliveryinfoByStoreId/:storeId Get the storeId based DeliveryInfo
     * @param storeId the regNo of Store 
     * @param pageable the pageable to create
     * @return page of DeliveryInfo in body 
     */
	@GetMapping("/deliveryinfoByStoreId/{storeId}")
	public Page<DeliveryInfo> findDeliveryInfoByStoreId(@PathVariable String storeId, Pageable pageable) {
		return storeQueryService.findDeliveryInfoByStoreId(storeId, pageable);
	}

	/**
     * GET  /store-type/:storeId Get the storeId based StoreType
     * @param storeId the regNo of Store 
     * @param pageable the pageable to create
     * @return page of StoreType in body 
     */
	@GetMapping("/store-type/{storeId}")
	public Page<StoreType> findStoreTypeByStoreId(@PathVariable String storeId, Pageable pageable) {
		return storeQueryService.findStoreTypeByStoreId(storeId, pageable);
	}

	/**
     * GET  /stores/banners Get all store Banners
     * @param pageable the pageable to create
     * @return page of Banner in body 
     */
	@GetMapping("/stores/banners")
	public Page<Banner> findStoreBanner(Pageable pageable) {

		return storeQueryService.findStoreBanner(pageable);
	}
	/**
     * GET  /facetSearchByStoreTypeName Get the storeTypeName based Store
     * @param storeTypeWrapper the storeTypeWrapper to create
     * @param pageable the pageable to create
     * @return page of Store in body 
     */
	@PostMapping("/facetSearchByStoreTypeName")
	public Page<Store> facetSearchByStoreTypeName(@RequestBody StoreTypeWrapper storeTypeWrapper, Pageable pageable) {

		return storeQueryService.facetSearchByStoreTypeName(storeTypeWrapper, pageable);

	}
	
	/**
     * GET  /storeSettings/:IDPCode Get the IDPCode based StoreSettings
     * @param IDPCode the regNo of Store 
     * @return StoreSettings in body 
     */
	@GetMapping("/storeSettings/{IDPCode}")
	public StoreSettings getStoreSettings(@PathVariable String IDPCode) {

		return storeQueryService.getStoreSettings(IDPCode);

	}
	/**
     * GET  /storeAddress/:IDPCode Get the IDPCode based StoreAddress
     * @param IDPCode the regNo of Store 
     * @return  StoreAddress in body 
     */
	@GetMapping("/storeAddress/{IDPCode}")
	public StoreAddress getStoreAddress(@PathVariable String IDPCode) {

		return storeQueryService.getStoreAddress(IDPCode);

	}
	
	// ****************order related end points********
	

	@GetMapping("/tasks")
	public ResponseEntity<List<OpenTask>> getTasks(@RequestParam(required = false) String assignee,
			@RequestParam(required = false) String assigneeLike, @RequestParam(required = false) String candidateGroup,
			@RequestParam(required = false) String candidateGroups,
			@RequestParam(required = false) String candidateUser, @RequestParam(required = false) String createdAfter,
			@RequestParam(required = false) String createdBefore, @RequestParam(required = false) String createdOn,
			@RequestParam(required = false) String name, @RequestParam(required = false) String nameLike) {
		return orderQueryResourceApi.getTasksUsingGET(assignee, assigneeLike, candidateGroup, candidateGroups,
				candidateUser, createdAfter, createdBefore, createdOn, name, nameLike);

	}

	/**
     * GET  /orderByOrderId/:orderId Get the orderId based Order
     * @param orderId the id of Order 
     * @return the ResponseEntity with status 200 (OK) page of Order in body
     */
	@GetMapping("/orderByOrderId/{orderId}")
	public ResponseEntity<Order> findOrderByOrderId(@PathVariable String orderId) {
		return ResponseEntity.ok(orderQueryService.findOrderByOrderId(orderId));
	}


	/**
     * GET  /orders/addresses/:customerId Get the IDPCode based Address
     * @param customerId the customerId of  Address
     * @return page of Address in body 
     */
	@GetMapping("/orders/addresses/{customerId}")
	public Page<Address> getAllSavedAddress(@PathVariable String customerId, Pageable pageable) {
		return orderQueryService.findAllSavedAddresses(customerId, pageable);
	}

	/**
     * GET  /orderStatus/:statusName Get the statusName based Order
     * @param statusName the statusName of  Order
     * @param pageable the pageable to create
     * @return page of Order in body 
     */
	@GetMapping("/orderStatus/{statusName}")
	public Page<Order> findOrderByStatusName(@PathVariable String statusName, Pageable pageable) {
		return orderQueryService.findOrderByStatusName(statusName, pageable);
	}

	/**
     * GET  /orders/:from/:to Get the from date to to date based Order
     * @param from the from date  of  Order
     * @param to the to date of Order
     * @param storeId the storeId of order
     * @param pageable the pageable to create
     * @return page of Order in body 
     */
	@GetMapping("/order/{from}/{to}/{storeId}")
	public Page<Order> findOrderByDatebetweenAndStoreId(@PathVariable Instant from, @PathVariable Instant to,
			@PathVariable String storeId, Pageable pageable) {
		return orderQueryService.findOrderByDatebetweenAndStoreId(from, to, storeId, pageable);
	}

	/**
     * GET  /ordersByCustomerId/:customerId Get the customerId based Order
     * @param customerId the customerId of  Order
     * @param pageable the pageable to create
     * @return page of Order in body 
     */
	@GetMapping("/ordersByCustomerId/{customerId}")
	public Page<Order> findOrdersByCustomerId(@PathVariable String customerId, Pageable pageable) {

		return orderQueryService.findOrderByCustomerId(customerId, pageable);

	}
	/**
     * GET  /findAllOrderLinesByOrderId/:orderId Get the customerId based OrderLine
     * @param orderId the id of  Order
     * @param pageable the pageable to create
     * @return page of OrderLine in body 
     */
	@GetMapping("/findAllOrderLinesByOrderId/{orderId}")
	public Page<OrderLine> findAllOrderLinesByOrderId(@PathVariable Long orderId, Pageable pageable) {
		return orderQueryService.findAllOrderLinesByOrderId(orderId, pageable);
	}
	/**
     * GET  /findnotificationcount/:receiverId/:status Get the receiverId and status based Order
     * @param receiverId the receiverId of  Notification
     * @param status the name of Status
     * @param pageable the pageable to create
     * @return long
     */
	@GetMapping("/findnotificationcount/{receiverId}/{status}")
	public Long findNotificationCountByReceiverIdAndStatusName(@PathVariable String receiverId,
			@PathVariable String status) {
		return orderQueryService.findNotificationCountByReceiverIdAndStatusName(receiverId, status);
	}
	/**
     * GET  /findnotificationbyreceiverid/:receiverId Get the receiverId based Notification
     * @param receiverId the receiverId of  Notification
     * @param pageable the pageable to create
     * @return page of Notification in body 
     */
	
	@GetMapping("/findnotificationbyreceiverid/{receiverId}")
	public Page<Notification> findNotificationByReceiverId(@PathVariable String receiverId, Pageable pageable) {
		return orderQueryService.findNotificationByReceiverId(receiverId, pageable);
	}
	/**
     * GET  /findAuxilaryOrderLineByOrderLineId/:orderLineId Get the orderLineId based AuxilaryOrderLine
     * @param orderLineId the id of  OrderLine
     * @param pageable the pageable to create
     * @return page of AuxilaryOrderLine in body 
     */
	
	@GetMapping("/findAuxilaryOrderLineByOrderLineId/{orderLineId}")
	public Page<AuxilaryOrderLine> findAuxilaryOrderLineByOrderLineId(@PathVariable Long orderLineId,
			Pageable pageable) {
		return orderQueryService.findAuxilaryOrderLineByOrderLineId(orderLineId, pageable);
	}

	/**
     * GET  /taskDetails/:taskName/:orderId/:storeId Get the taskName,orderId,storeId based OpenTask
     * @param taskName the taskname of Opentask
     * @param orderId the id of  OpenTask
     * @param storeId ............TO BE FILLED.............
     * @param pageable the pageable to create
     * @return page of OpenTask in body 
     */
	
	@GetMapping("/taskDetails/{taskName}/{orderId}/{storeId}")
	public ResponseEntity<OpenTask> getTaskDetails(@PathVariable String taskName, @PathVariable String orderId,
			@PathVariable String storeId) {
		return orderQueryResourceApi.getTaskDetailsUsingGET(taskName, orderId, storeId);

	}
	// ****************Report related end points********
	
	/**
     * GET  /orderaggregator/:orderNumber Get the orderNumber based OrderAggregator
     * @param orderNumber the orderNumber of OrderMaster
     * @return the ResponseEntity with status 200 (OK) of OrderAggregator in body 
     */
	
	@GetMapping("/orderaggregator/{orderNumber}")
	public ResponseEntity<OrderAggregator> getOrderAggregator(@PathVariable String orderNumber) {
		return reportQueryResourceApi.getOrderAggregatorUsingGET(orderNumber);
	}
	// ****************offer related end points********
	/**
	 * GET /findOfferLinesByOrderId/:id: get all the "id" offer.
	 *
	 * @param id the id of the offerDTO to retrieve
	 * @return the list of offers in body
	 *         
	 */
	
	@GetMapping("/findOfferLinesByOrderId/{id}")
	public List<Offer> findOfferLinesByOrderId(@PathVariable Long id) {
		return offerQueryService.findOfferLinesByOrderId(id);
	}
}
