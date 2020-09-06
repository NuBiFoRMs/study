package com.nubiform.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ClassicModels {
	
	List<HashMap<Object, Object>> getOrders();
}