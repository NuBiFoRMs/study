package com.nubiform.service;

import java.util.HashMap;
import java.util.List;

import com.nubiform.util.MyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SampleService extends MyService {
	
	@Value("${value.value}")
	String value;
	
	public String getValue() {
		logger.info("Property1 : " + value);
		logger.info("Property2 : " + commonProperty.getProperty("value.value"));
		return value;
	}
	
	public void getList() {
		List<HashMap> list = getSqlSession().selectList("test.getList");
	}
	
}