package com.diviso.graeshoppe.customerappgateway.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.customerappgateway.client.payment.model.OrderRequest;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.OrderResponse;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentDTO;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentExecutionRequest;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentInitiateRequest;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentInitiateResponse;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentTransaction;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.PaymentTransactionResponse;
import com.diviso.graeshoppe.customerappgateway.client.payment.model.CommandResource;

public interface PaymentCommandService {

	ResponseEntity<OrderResponse> createOrder(OrderRequest orderRequest);

	ResponseEntity<CommandResource> processPayment(PaymentDTO paymentDTO, String status, String taskId);

	ResponseEntity<PaymentInitiateResponse> initiatePaymentUsingPOST(PaymentInitiateRequest paymentInitiateRequest);

	ResponseEntity<Void> executePaymentUsingPOST(String paymentId, PaymentExecutionRequest paymentExecutionRequest);

	ResponseEntity<String> createClientAuthTokenUsingGET();

	ResponseEntity<PaymentTransactionResponse> createTransactionUsingPOST(PaymentTransaction paymentTransaction);

}
