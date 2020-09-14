package com.nubiform.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nubiform.service.OrdersService;

@RestController
public class OrdersController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrdersService ordersService;
	
	@RequestMapping("/getOrders")
	public List<HashMap<Object, Object>> getOrders() {
		return ordersService.getOrders();
	}
}