package com.nubiform.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nubiform.service.OrdersService;

@RestController
public class OrdersController {
	
	@Autowired
	OrdersService ordersService;
	
	@RequestMapping("/getOrders")
	public List<HashMap<Object, Object>> getOrders() {
		
		return ordersService.getOrders();
	}
}