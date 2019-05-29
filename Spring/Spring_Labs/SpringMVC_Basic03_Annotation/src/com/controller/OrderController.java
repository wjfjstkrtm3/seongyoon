package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.OrderCommand;
import com.model.OrderItem;

//주문화면(UI) , 주문(처리)
//1. 하나의 요청 주소 (method="GET , POST")

//다른 방식 : 요청 주소 > 화면 order.do
//                      > 처리 orderok.do

//하나의 주소 : order.do : 화면, 처리 모두

@Controller
@RequestMapping("/order/order.do")
public class OrderController {
	
	@RequestMapping(method=RequestMethod.GET) // 화면 전달
	public String form() {
		return "order/OrderForm";
	}
	
	@RequestMapping(method=RequestMethod.POST) //결과 처리
	public String submit(OrderCommand orderCommand) { //OrderCommand orderCommand 자동 빈 객체 생성
		System.out.println("orderCommand 주소 : " + orderCommand);
		System.out.println("orderCommand 의 Item 크기 :" + orderCommand.getOrderItem().size());
		
		//검증코드
		List<OrderItem> items = orderCommand.getOrderItem();
		for(OrderItem item : items) {
			System.out.println(item.toString());
		}
		
		//OrderCommand orderCommand 자동 forward (객체의 이름 >> orderCommand
		//request.setAttribute("orderCommand" , orderCommand)
		return "order/OrderCommited";
	}
}





