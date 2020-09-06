package com.nubiform.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nubiform.dao.ClassicModels;

@Service
public class OrdersService {
	
	@Autowired
	private ClassicModels classicModels;
	
	@Transactional
	public List<HashMap<Object, Object>> getOrders() {
		return classicModels.getOrders();
	}
	
}