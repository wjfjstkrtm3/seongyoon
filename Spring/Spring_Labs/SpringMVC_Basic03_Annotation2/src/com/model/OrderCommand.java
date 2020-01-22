package com.model;

import java.util.List;

public class OrderCommand {

	private List<OrderItem> orderItem;
	
	public List<OrderItem> getOrderItem() {
		return this.orderItem;
	}
	
	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}
	
}
