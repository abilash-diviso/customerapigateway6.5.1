package com.diviso.graeshoppe.customerappgateway.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.diviso.graeshoppe.customerappgateway.client.customer.model.ContactDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.Customer;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.CustomerDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteProduct;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteStore;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Address;

public interface CustomerQueryService {

	CustomerDTO findCustomerByIdpCode(String idpCode);

	
	public ContactDTO findContactById(Long id);
	Page<FavouriteProduct> findFavouriteProductsByCustomerIdpCode(String idpCode, Pageable pageable);
	public Boolean checkUserExistsByIdpCode(String idpCode);
	public CustomerDTO findByMobileNumber(Long mobileNumber);
	Page<FavouriteStore> findFavouriteStoresByCustomerIdpCode(String idpCode, Pageable pageable);
	
}
