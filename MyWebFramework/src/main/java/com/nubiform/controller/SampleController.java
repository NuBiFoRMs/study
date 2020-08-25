package com.nubiform.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nubiform.service.SampleService;
import com.nubiform.util.MyController;

@RestController
public class SampleController extends MyController {
	
	@Autowired
	SampleService sampleService;
	
	@RequestMapping(value="getArrayList", method=RequestMethod.GET)
	public ArrayList<HashMap<String,Object>> getArrayList() {
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> value = null;
		
		value = new HashMap<String, Object>();
		value.put("COL1", "동해물과");
		value.put("COL2", "백두산이");
		list.add(value);
		
		value = new HashMap<String, Object>();
		value.put("COL1", "마르고닳");
		value.put("COL2", "도록하느");
		list.add(value);
		
		logger.debug(list);
		
		return list;
	}
	
	@RequestMapping(value="getHashMap", method=RequestMethod.GET)
	public HashMap<String,Object> getHashMap() {
		HashMap<String, Object> value = new HashMap<String, Object>();
		value.put("COL1", "동해물과");
		value.put("COL2", "백두산이");
		
		logger.debug(value);
		
		return value;
	}
	
	@RequestMapping(value="getString", method=RequestMethod.GET)
	public String getString() {
		return "동해물과백두산이";
	}
	
}	