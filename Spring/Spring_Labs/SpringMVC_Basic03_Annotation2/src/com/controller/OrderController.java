package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.OrderCommand;
import com.model.OrderItem;

@Controller
@RequestMapping("/order/order.do")
public class OrderController {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		return "order/OrderForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(OrderCommand orderCommand) {
		System.out.println("orderCommand의 주소 : " + orderCommand);
		System.out.println("orderCommand의 Item의 크기 : " + orderCommand.getOrderItem().size());
		
		List<OrderItem> items = orderCommand.getOrderItem(); 
		
		for(OrderItem item : items) {
			System.out.println(item.toString());
		}
		return "order/OrderCommited";
	}
}
