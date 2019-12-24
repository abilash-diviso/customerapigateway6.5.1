package com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator;

import com.diviso.graeshoppe.customerappgateway.client.order.model.CommandResource;

public class OrderInitiateResponse {

	private CommandResource commandResource;
	private Order order;
	/**
	 * @return the commandResource
	 */
	public CommandResource getCommandResource() {
		return commandResource;
	}
	@Override
	public String toString() {
		return String.format("OrderInitiateResponse [commandResource=%s,\n order=%s]", commandResource, order);
	}
	/**
	 * @param commandResource the commandResource to set
	 */
	public void setCommandResource(CommandResource commandResource) {
		this.commandResource = commandResource;
	}
	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
}
