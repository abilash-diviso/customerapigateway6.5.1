package com.diviso.graeshoppe.customerappgateway.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.diviso.graeshoppe.customerappgateway.client.aggregators.CustomerAggregator;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.ContactDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.Customer;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.CustomerDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteProductDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteStoreDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.OTPChallenge;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.OTPResponse;

public interface CustomerCommandService {

	public ResponseEntity<CustomerDTO> createCustomer(CustomerAggregator customerAggregator);

	public ResponseEntity<OTPResponse> sendSMS(long numbers);
	
	public	ResponseEntity<OTPChallenge> verifyOTP(long numbers,String code) ;
	public ResponseEntity<CustomerDTO> updateCustomer(CustomerDTO customerDTO);
	public void deleteCustomer(Long id);
	public ResponseEntity<ContactDTO> updateContact(ContactDTO contact);
	
	public ResponseEntity<Void> deleteContact( Long id);
	public ResponseEntity<Void> deleteFavouriteProduct(Long id);
	public ResponseEntity<FavouriteProductDTO> createFavouriteProduct( FavouriteProductDTO favouriteProductDTO);
	public ResponseEntity<FavouriteStoreDTO> createFavouriteStore(FavouriteStoreDTO favouriteStoreDTO);
	public ResponseEntity<Void> deleteFavouriteStore(Long id) ;
	
	
	
	
}
