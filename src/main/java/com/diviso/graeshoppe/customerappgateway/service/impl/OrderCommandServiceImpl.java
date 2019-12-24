package com.diviso.graeshoppe.customerappgateway.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.diviso.graeshoppe.customerappgateway.client.order.api.AddressResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.order.api.AuxilaryOrderLineResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.order.api.DeliveryInfoCommandResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.order.api.NotificationResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.order.api.OfferResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.order.api.OrderCommandResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.order.api.OrderLineCommandResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.order.api.OrderLineResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.order.api.OrderQueryResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.order.model.AddressDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.AuxilaryOrderLineDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.CommandResource;
import com.diviso.graeshoppe.customerappgateway.client.order.model.DeliveryInfoDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.NotificationDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.OfferDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.OrderDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.OrderLineDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.AuxilaryOrderLine;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.DeliveryInfo;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Offer;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Order;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.OrderInitiateResponse;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.OrderLine;
import com.diviso.graeshoppe.customerappgateway.service.OrderCommandService;
import com.diviso.graeshoppe.customerappgateway.service.mapper.AuxilaryOrderLineMapper;
import com.diviso.graeshoppe.customerappgateway.service.mapper.DeliveryInfoMapper;
import com.diviso.graeshoppe.customerappgateway.service.mapper.OfferMapper;
import com.diviso.graeshoppe.customerappgateway.service.mapper.OrderLineMapper;
import com.diviso.graeshoppe.customerappgateway.service.mapper.OrderMapper;

@Service
public class OrderCommandServiceImpl implements OrderCommandService {

	@Autowired
	private AddressResourceApi addressResourceApi;
	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private AuxilaryOrderLineMapper auxilaryOrderLineMapper;

	@Autowired
	private OrderLineMapper orderLineMapper;

	@Autowired
	private DeliveryInfoMapper deliveryInfoMapper;

	@Autowired
	private OfferMapper offerMapper;

	@Autowired
	private OrderCommandResourceApi orderCommandResourceApi;
	@Autowired
	private OrderLineResourceApi orderLineResourceApi;
	@Autowired
	private OrderLineCommandResourceApi orderLineCommandResource;
	@Autowired
	private AuxilaryOrderLineResourceApi auxilaryOrderLineApi;
	@Autowired
	private DeliveryInfoCommandResourceApi deliveryInfoCommandApi;
	@Autowired
	private OrderQueryResourceApi orderQueryResource;
	@Autowired
	private NotificationResourceApi notificationResourceApi;

	@Autowired
	private OfferResourceApi offerResourceApi;

	@Override
	public OrderInitiateResponse initiateOrder(Order order) {
		OrderInitiateResponse orderResponse = new OrderInitiateResponse();
		OrderDTO orderDTO = orderMapper.toDto(order);
		CommandResource resource = createOrder(orderDTO);
		Order orderResult = orderMapper.toEntity(orderDTO);
		orderResult.setId(resource.getSelfId());
		orderResult.setOrderId(resource.getOrderId());
		orderResponse.setCommandResource(resource);
		orderResponse.setOrder(orderResult);
		order.getOrderLines().forEach(orderLine -> {
			OrderLineDTO orderLineDTO = orderLineMapper.toDto(orderLine);
			orderLineDTO.setOrderId(resource.getSelfId());
			OrderLineDTO lineDTOResult = createOrderLine(orderLineDTO);
			OrderLine orderLineResult = orderLineMapper.toEntity(lineDTOResult);
			orderLine.getRequiedAuxilaries().forEach(auxilaryOrderLine -> {
				AuxilaryOrderLineDTO auxilaryOrderLineDTO = auxilaryOrderLineMapper.toDto(auxilaryOrderLine);
				auxilaryOrderLineDTO.setOrderLineId(lineDTOResult.getId());
				AuxilaryOrderLineDTO auxilaryOrderLineDTOresult = createAuxilaryLineItem(auxilaryOrderLineDTO);
				AuxilaryOrderLine auxilaryOrderLineresult = auxilaryOrderLineMapper
						.toEntity(auxilaryOrderLineDTOresult);
				orderLineResult.getRequiedAuxilaries().add(auxilaryOrderLineresult);
			});
			orderResponse.getOrder().getOrderLines().add(orderLineResult);
		});
		order.getAppliedOffers().forEach(offer -> {
			OfferDTO offerDTO = offerMapper.toDto(offer);
			offerDTO.setOrderId(resource.getSelfId());
			OfferDTO offerDTOResult = createOfferLine(offerDTO);
			Offer offerResult = offerMapper.toEntity(offerDTOResult);
			orderResponse.getOrder().getAppliedOffers().add(offerResult);
		});
		return orderResponse;

	}

	public AuxilaryOrderLineDTO createAuxilaryLineItem(AuxilaryOrderLineDTO auxilaryOrderLineDTO) {
		return auxilaryOrderLineApi.createAuxilaryOrderLineUsingPOST(auxilaryOrderLineDTO).getBody();
	}

	public OfferDTO createOfferLine(OfferDTO offerDTO) {
		return offerResourceApi.createOfferUsingPOST(offerDTO).getBody();
	}

	public CommandResource createOrder(OrderDTO orderDTO) {

		return orderCommandResourceApi.createOrderUsingPOST(orderDTO).getBody();

	}

	public OrderLineDTO createOrderLine(OrderLineDTO orderLineDTO) {
		return orderLineResourceApi.createOrderLineUsingPOST(orderLineDTO).getBody();
	}

	@Override
	public CommandResource createDeliveryInfo(String taskId, DeliveryInfo deliveryInfo, String orderId) {
		DeliveryInfoDTO deliveryInfoDTO = deliveryInfoMapper.toDto(deliveryInfo);
		if (deliveryInfo.getDeliveryAddress() != null) {
			deliveryInfoDTO.setDeliveryAddressId(deliveryInfo.getDeliveryAddress().getId());
		}
		return deliveryInfoCommandApi.createDeliveryInfoUsingPOST(taskId, orderId, deliveryInfoDTO).getBody();
	}

	public DeliveryInfoDTO updateDeliveryInfo(DeliveryInfoDTO deliveryInfoDTO) {
		return deliveryInfoCommandApi.updateDeliveryInfoUsingPUT(deliveryInfoDTO).getBody();
	}

	public OrderDTO updateOrder(OrderDTO orderDTO) {
		return orderCommandResourceApi.updateOrderUsingPUT(orderDTO).getBody();
	}

	@Override
	public ResponseEntity<AddressDTO> createAddressUsingPOST(AddressDTO addressDTO) {
		ResponseEntity<AddressDTO> result = addressResourceApi.createAddressUsingPOST(addressDTO);
		return result;
	}

	@Override
	public DeliveryInfoDTO editDeliveryInfo(DeliveryInfo deliveryInfo) {
		DeliveryInfoDTO deliveryInfoDTO = new DeliveryInfoDTO();
		deliveryInfoDTO.setId(deliveryInfo.getId());
		deliveryInfoDTO.setDeliveryCharge(deliveryInfo.getDeliveryCharge());
		deliveryInfoDTO.setDeliveryType(deliveryInfo.getDeliveryType());
		if (deliveryInfo.getDeliveryAddress() != null) {
			deliveryInfoDTO.setDeliveryAddressId(deliveryInfo.getDeliveryAddress().getId());
		}
		deliveryInfoDTO.setDeliveryNotes(deliveryInfo.getDeliveryNotes());
		DeliveryInfoDTO result = updateDeliveryInfo(deliveryInfoDTO);
		ResponseEntity<OrderDTO> orderDTO = orderQueryResource.findByDeliveryInfoIdUsingGET(deliveryInfo.getId());
		orderDTO.getBody().setDeliveryInfoId(deliveryInfo.getId());
		orderCommandResourceApi.updateOrderUsingPUT(orderDTO.getBody());
		return result;
	}

	@Override
	public void deleteOrderLine(Long id) {
		orderLineCommandResource.deleteOrderLineUsingDELETE(id);
	}

	@Override
	public void deleteAuxilaryOrderLine(Long id) {
		auxilaryOrderLineApi.deleteAuxilaryOrderLineUsingDELETE(id);

	}

	@Override
	public Order editOrder(Order order) {
		OrderDTO orderDTO = orderMapper.toDto(order);
		ResponseEntity<OrderDTO> orderResult = orderCommandResourceApi.updateOrderUsingPUT(orderDTO);
		Order orderResponse = orderMapper.toEntity(orderResult.getBody());
		order.getOrderLines().forEach(orderLine -> {
			OrderLineDTO orderLineDTO = orderLineMapper.toDto(orderLine);
			orderLineDTO.setOrderId(orderDTO.getId());
			OrderLineDTO orderLineResult = orderLineCommandResource.updateOrderLineUsingPUT(orderLineDTO).getBody();
			OrderLine orderLineresponse = orderLineMapper.toEntity(orderLineResult);
			orderLine.getRequiedAuxilaries().forEach(auxilaryOrderLine -> {
				AuxilaryOrderLineDTO auxilaryOrderLineDTO = auxilaryOrderLineMapper.toDto(auxilaryOrderLine);
				auxilaryOrderLineDTO.setOrderLineId(orderLineDTO.getId());
				AuxilaryOrderLineDTO auxilaryOrderLineResult = auxilaryOrderLineApi
						.updateAuxilaryOrderLineUsingPUT(auxilaryOrderLineDTO).getBody();
				AuxilaryOrderLine auxilaryOrderLineResponse = auxilaryOrderLineMapper.toEntity(auxilaryOrderLineResult);
				orderLineresponse.getRequiedAuxilaries().add(auxilaryOrderLineResponse);
			});
			orderResponse.getOrderLines().add(orderLineresponse);

		});

		order.getAppliedOffers().forEach(offer -> {
			OfferDTO offerDTO = offerMapper.toDto(offer);
			offerDTO.setOrderId(orderDTO.getId());
			OfferDTO offerDTOresult = offerResourceApi.updateOfferUsingPUT(offerDTO).getBody();
			Offer offerResponse = offerMapper.toEntity(offerDTOresult);
			orderResponse.getAppliedOffers().add(offerResponse);
		});
		return orderResponse;
	}

	@Override
	public ResponseEntity<NotificationDTO> updateNotification(NotificationDTO notificationDTO) {
		return notificationResourceApi.updateNotificationUsingPUT(notificationDTO);
	}

	@Override
	public ResponseEntity<AddressDTO> updateAddress(AddressDTO addressDTO) {
		return addressResourceApi.updateAddressUsingPUT(addressDTO);
	}

	@Override
	public ResponseEntity<Void> deleteAddress(Long id) {
		return addressResourceApi.deleteAddressUsingDELETE(id);
	}

}
