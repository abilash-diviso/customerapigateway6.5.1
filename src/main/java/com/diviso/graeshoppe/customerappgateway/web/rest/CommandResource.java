package com.diviso.graeshoppe.customerappgateway.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.customerappgateway.client.aggregators.CustomerAggregator;
import com.diviso.graeshoppe.customerappgateway.client.customer.api.ContactResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.customer.api.CustomerResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.customer.api.FavouriteProductResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.customer.api.FavouriteStoreResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.ContactDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.CustomerDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteProductDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteStoreDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.OTPChallenge;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.OTPResponse;
import com.diviso.graeshoppe.customerappgateway.client.offer.model.OrderModel;
import com.diviso.graeshoppe.customerappgateway.client.order.model.AddressDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.DeliveryInfoDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.NotificationDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.DeliveryInfo;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Order;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.OrderInitiateResponse;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.OrderRequest;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.OrderResponse;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentDTO;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentExecutionRequest;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentInitiateRequest;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentInitiateResponse;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentTransaction;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentTransactionResponse;
import com.diviso.graeshoppe.customerappgateway.client.product.api.CategoryResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.product.api.ProductResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.product.api.StockCurrentResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.product.api.UomResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.product.model.CategoryDTO;
import com.diviso.graeshoppe.customerappgateway.client.product.model.ProductDTO;
import com.diviso.graeshoppe.customerappgateway.client.product.model.StockCurrentDTO;
import com.diviso.graeshoppe.customerappgateway.client.product.model.UOMDTO;
import com.diviso.graeshoppe.customerappgateway.client.store.api.ReplyResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.store.api.ReviewResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.store.api.StoreResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.store.api.UserRatingResourceApi;
//import com.diviso.graeshoppe.customerappgateway.client.store.domain.RatingReview;
import com.diviso.graeshoppe.customerappgateway.client.store.model.Review;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRating;
import com.diviso.graeshoppe.customerappgateway.client.store.model.ReplyDTO;
import com.diviso.graeshoppe.customerappgateway.client.store.model.ReviewDTO;
import com.diviso.graeshoppe.customerappgateway.client.store.model.StoreDTO;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRatingDTO;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRatingReviewDTO;
import com.diviso.graeshoppe.customerappgateway.service.OfferCommandService;
import com.diviso.graeshoppe.customerappgateway.service.OrderCommandService;
import com.diviso.graeshoppe.customerappgateway.service.PaymentCommandService;
import com.diviso.graeshoppe.customerappgateway.service.StoreQueryService;
import com.diviso.graeshoppe.customerappgateway.service.CustomerCommandService;
import com.diviso.graeshoppe.customerappgateway.service.StoreCommandService;

@RestController
@RequestMapping("/api/command")
public class CommandResource {

	@Autowired
	private OrderCommandService orderCommandService;

	@Autowired
	private CustomerCommandService customerCommandService;

	@Autowired
	private StoreCommandService storeCommandService;

	

	@Autowired
	private PaymentCommandService paymentCommandService;

	@Autowired
	private OfferCommandService offerCommandService;

	//private final Logger log = LoggerFactory.getLogger(CommandResource.class);

	// **************************customerCommandService*********************************
	@PostMapping("/customers/register-customer")
	public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerAggregator customerAggregator) {

		/*
		 * CustomerDTO customerDTO = new CustomerDTO(); ContactDTO contactDTO = new
		 * ContactDTO(); customerDTO.setName(customerAggregator.getName());
		 * customerDTO.setIdpCode(customerAggregator.getIdpCode());
		 * customerDTO.setIdpSub(customerAggregator.getIdpSub());
		 * customerDTO.setImageLink(" ");
		 * 
		 * contactDTO.setMobileNumber(customerAggregator.getMobileNumber());
		 * contactDTO.setEmail(customerAggregator.getEmail());
		 * 
		 * contactDTO.setPhoneCode(customerAggregator.getPhoneCode()); ContactDTO
		 * resultDTO = contactResourceApi.createContactUsingPOST(contactDTO).getBody();
		 * customerDTO.setContactId(resultDTO.getId()); return
		 * customerResourceApi.createCustomerUsingPOST(customerDTO);
		 */
		return customerCommandService.createCustomer(customerAggregator);

	}

	@PostMapping("/customer/otp_send")
	ResponseEntity<OTPResponse> sendSMS(@RequestParam long numbers) {

		/* return customerResourceApi.sendSMSUsingPOST(numbers); */
		return customerCommandService.sendSMS(numbers);
	}

	@PostMapping("/customer/otp_challenge")
	ResponseEntity<OTPChallenge> verifyOTP(@RequestParam long numbers, @RequestParam String code) {

		/* return customerResourceApi.verifyOTPUsingPOST(code, numbers); */
		return customerCommandService.verifyOTP(numbers, code);
	}

	@PutMapping("/customers")
	public ResponseEntity<CustomerDTO> updateCustomer(@RequestBody CustomerDTO customerDTO) {
		/* return customerResourceApi.updateCustomerUsingPUT(customerDTO); */
		return customerCommandService.updateCustomer(customerDTO);
	}

	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		/*
		 * Long contactid =
		 * customerResourceApi.getCustomerUsingGET(id).getBody().getContactId();
		 * customerResourceApi.deleteCustomerUsingDELETE(id);
		 * this.deleteContact(contactid);
		 */
		customerCommandService.deleteCustomer(id);

	}

	@PutMapping("/contacts")
	public ResponseEntity<ContactDTO> updateContact(@RequestBody ContactDTO contact) {
		/* return this.contactResourceApi.updateContactUsingPUT(contact); */
		return customerCommandService.updateContact(contact);
	}

	@DeleteMapping("/contacts/{id}")
	public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
		/* return this.contactResourceApi.deleteContactUsingDELETE(id); */
		return customerCommandService.deleteContact(id);

	}

	@PostMapping("/favouriteproduct")
	public ResponseEntity<FavouriteProductDTO> createFavouriteProduct(
			@RequestBody FavouriteProductDTO favouriteProductDTO) {
		/*
		 * return this.favouriteProductResourceApi.createFavouriteProductUsingPOST(
		 * favouriteProductDTO);
		 */
		return customerCommandService.createFavouriteProduct(favouriteProductDTO);
	}

	@DeleteMapping("/favouriteproduct/{id}")
	public ResponseEntity<Void> deleteFavouriteProduct(@PathVariable Long id) {
		/*
		 * return
		 * this.favouriteProductResourceApi.deleteFavouriteProductUsingDELETE(id);
		 */
		return customerCommandService.deleteFavouriteProduct(id);
	}

	@PostMapping("/favouritestore")
	public ResponseEntity<FavouriteStoreDTO> createFavouriteStore(@RequestBody FavouriteStoreDTO favouriteStoreDTO) {
		// return
		// this.favouriteStoreResourceApi.createFavouriteStoreUsingPOST(favouriteStoreDTO);
		return customerCommandService.createFavouriteStore(favouriteStoreDTO);
	}

	@DeleteMapping("/favouritestore/{id}")
	public ResponseEntity<Void> deleteFavouriteStore(@PathVariable Long id) {
		// return this.favouriteStoreResourceApi.deleteFavouriteStoreUsingDELETE(id);
		return customerCommandService.deleteFavouriteStore(id);
	}

	// ************************** storeCommandService*****************************

	@PostMapping("/replies")
	public ResponseEntity<ReplyDTO> createReply(@RequestBody ReplyDTO replyDTO) {
		// return this.replyResourceApi.createReplyUsingPOST(replyDTO);
		return storeCommandService.createReply(replyDTO);
	}

	@PutMapping("/replies")
	public ResponseEntity<ReplyDTO> updateReply(@RequestBody ReplyDTO replyDTO) {
		// return this.replyResourceApi.updateReplyUsingPUT(replyDTO);
		return storeCommandService.updateReply(replyDTO);
	}

	@DeleteMapping("/replies/{id}")
	public ResponseEntity<Void> deleteReply(@PathVariable Long id) {
		// return this.replyResourceApi.deleteReplyUsingDELETE(id);
		return storeCommandService.deleteReply(id);
	}



	@PostMapping("/user-rating-review")
	public	ResponseEntity<UserRatingReviewDTO> createUserRatingReview(@RequestBody UserRatingReviewDTO userRatingReviewDTO){
	return  storeCommandService.createUserRatingReview(userRatingReviewDTO);
	}
	

	
	
	

	/*********************** Order related operations ****************************/

	@PostMapping("/order/initiateOrder")
	public ResponseEntity<OrderInitiateResponse> initiateOrder(@RequestBody Order order) {
		return ResponseEntity.ok(orderCommandService.initiateOrder(order));
	}

	@PostMapping("/orders/addresses")
	public ResponseEntity<AddressDTO> createAddress(@RequestBody AddressDTO addressDTO) {
		return orderCommandService.createAddressUsingPOST(addressDTO);

	}

	@PostMapping("/orders/collectDeliveryDetails/{taskId}/{orderId}")
	public ResponseEntity<com.diviso.graeshoppe.customerappgateway.client.order.model.CommandResource> collectDeliveryDetails(
			@RequestBody DeliveryInfo deliveryInfo, @PathVariable String taskId, @PathVariable String orderId) {
		return ResponseEntity.ok(orderCommandService.createDeliveryInfo(taskId, deliveryInfo, orderId));
	}

	@PutMapping("/delivery-info")
	public ResponseEntity<DeliveryInfoDTO> editDeliveryInfo(@RequestBody DeliveryInfo deliveryInfo) {
		return ResponseEntity.ok(orderCommandService.editDeliveryInfo(deliveryInfo));
	}

	@DeleteMapping("/orders/{id}")
	public void deleteOrderLine(@PathVariable Long id) {
		orderCommandService.deleteOrderLine(id);
	}

	@DeleteMapping("/auxilaries/{id}")
	public void deleteAuxilaryOrderLine(@PathVariable Long id) {
		orderCommandService.deleteAuxilaryOrderLine(id);
	}

	@PutMapping("/order")
	public ResponseEntity<Order> editOrder(@RequestBody Order order) {
		return ResponseEntity.ok(orderCommandService.editOrder(order));
	}

	@PutMapping("/notifications")
	public ResponseEntity<NotificationDTO> updateNotification(@RequestBody NotificationDTO notificationDTO) {
		return orderCommandService.updateNotification(notificationDTO);
	}

	@PutMapping("/addresses")
	public ResponseEntity<AddressDTO> updateAddress(@RequestBody AddressDTO addressDTO) {
		return orderCommandService.updateAddress(addressDTO);
	}

	@DeleteMapping("/addresses/{id}")
	public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
		return orderCommandService.deleteAddress(id);
	}

	/**************************
	 * Payment related operations
	 ******************************************/

	@PostMapping("/razorpay/order")
	public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest) {
		return paymentCommandService.createOrder(orderRequest);
	}

	@PostMapping("/processPayment/{status}/{taskId}")
	public ResponseEntity<com.diviso.graeshoppe.customerappgateway.client.payment.model.CommandResource> processPayment(
			@RequestBody PaymentDTO paymentDTO, @PathVariable String status, @PathVariable String taskId) {
		return paymentCommandService.processPayment(paymentDTO, status, taskId);
	}

	@PostMapping("/paypal/initiate")
	public ResponseEntity<PaymentInitiateResponse> initiatePayment(
			@RequestBody PaymentInitiateRequest paymentInitiateRequest) {
		return paymentCommandService.initiatePaymentUsingPOST(paymentInitiateRequest);
	}

	@PostMapping("/paypal/execute/{paymentId}")
	public ResponseEntity<Void> executePayment(@RequestBody PaymentExecutionRequest paymentExecutionRequest,
			@PathVariable String paymentId) {
		return paymentCommandService.executePaymentUsingPOST(paymentId, paymentExecutionRequest);
	}

	@GetMapping("/clientToken")
	public ResponseEntity<String> createClientAuthToken() {
		return paymentCommandService.createClientAuthTokenUsingGET();
	}

	@PostMapping("/transaction")
	public ResponseEntity<PaymentTransactionResponse> createTransaction(
			@RequestBody PaymentTransaction paymentTransaction) {
		return paymentCommandService.createTransactionUsingPOST(paymentTransaction);
	}

	/********************************
	 * Offer related operatons
	 ******************************************/

	@PostMapping("/claimOffer/{customerId}")
	public ResponseEntity<OrderModel> checkOfferEligibility(@RequestBody OrderModel orderModel,
			@PathVariable String customerId) {
		return offerCommandService.claimOffer(orderModel, customerId);
	}

	/***********************************************************************************/

}
