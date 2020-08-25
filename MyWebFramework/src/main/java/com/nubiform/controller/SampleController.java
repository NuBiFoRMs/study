package com.nubiform.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> getData() {
		HashMap<String, Object> returnValue = new HashMap<String, Object>();
		returnValue.put("1", "동해물과");
		returnValue.put("2", "백두산이");
		
		return returnValue;
	}
	
}	