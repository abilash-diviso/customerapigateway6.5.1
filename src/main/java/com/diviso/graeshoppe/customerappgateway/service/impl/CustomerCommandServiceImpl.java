package com.diviso.graeshoppe.customerappgateway.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.customerappgateway.client.aggregators.CustomerAggregator;
import com.diviso.graeshoppe.customerappgateway.client.customer.api.ContactResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.customer.api.CustomerResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.customer.api.FavouriteProductResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.customer.api.FavouriteStoreResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.ContactDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.Customer;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.CustomerDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteProductDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteStoreDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.OTPChallenge;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.OTPResponse;
import com.diviso.graeshoppe.customerappgateway.service.OfferCommandService;
import com.diviso.graeshoppe.customerappgateway.service.CustomerCommandService;
@Service
public class CustomerCommandServiceImpl implements CustomerCommandService {
	@Autowired
	private CustomerResourceApi customerResourceApi;
	
	@Autowired
	private ContactResourceApi contactResourceApi;
	
	
	@Autowired
	FavouriteProductResourceApi favouriteProductResourceApi;

	@Autowired
	FavouriteStoreResourceApi favouriteStoreResourceApi;
	
	public ResponseEntity<CustomerDTO> createCustomer(CustomerAggregator customerAggregator){
		CustomerDTO customerDTO = new CustomerDTO();
		ContactDTO contactDTO = new ContactDTO();
		customerDTO.setName(customerAggregator.getName());
		customerDTO.setIdpCode(customerAggregator.getIdpCode());
		customerDTO.setIdpSub(customerAggregator.getIdpSub());
		customerDTO.setImageLink(" ");
		
		contactDTO.setMobileNumber(customerAggregator.getMobileNumber());
		contactDTO.setEmail(customerAggregator.getEmail());
		
		contactDTO.setPhoneCode(customerAggregator.getPhoneCode());
		ContactDTO resultDTO = contactResourceApi.createContactUsingPOST(contactDTO).getBody();
		customerDTO.setContactId(resultDTO.getId());
		return customerResourceApi.createCustomerUsingPOST(customerDTO);
	}
	
	public ResponseEntity<OTPResponse> sendSMS( long numbers){
		return customerResourceApi.sendSMSUsingPOST(numbers);
	}
	
	
	
	public	ResponseEntity<OTPChallenge> verifyOTP(long numbers,String code) {
		return customerResourceApi.verifyOTPUsingPOST(code, numbers);
	}
	
	public ResponseEntity<CustomerDTO> updateCustomer(CustomerDTO customerDTO){
		return customerResourceApi.updateCustomerUsingPUT(customerDTO);
	}
	
	
	public void deleteCustomer(Long id) {
		Long contactid = customerResourceApi.getCustomerUsingGET(id).getBody().getContactId();
		customerResourceApi.deleteCustomerUsingDELETE(id);
		contactResourceApi.deleteContactUsingDELETE(contactid);
	}
	
	public ResponseEntity<ContactDTO> updateContact(ContactDTO contact){
		return contactResourceApi.updateContactUsingPUT(contact);
	}
	
	public ResponseEntity<Void> deleteContact( Long id){
		return contactResourceApi.deleteContactUsingDELETE(id);
	}
	
	public ResponseEntity<Void> deleteFavouriteProduct(Long id) {
		return this.favouriteProductResourceApi.deleteFavouriteProductUsingDELETE(id);
	}
	
	public ResponseEntity<FavouriteProductDTO> createFavouriteProduct( FavouriteProductDTO favouriteProductDTO) {
		return this.favouriteProductResourceApi.createFavouriteProductUsingPOST(favouriteProductDTO);
	}

	

	public ResponseEntity<FavouriteStoreDTO> createFavouriteStore(FavouriteStoreDTO favouriteStoreDTO) {
		return this.favouriteStoreResourceApi.createFavouriteStoreUsingPOST(favouriteStoreDTO);
	}


	public ResponseEntity<Void> deleteFavouriteStore(Long id) {
		return this.favouriteStoreResourceApi.deleteFavouriteStoreUsingDELETE(id);
	}



}
