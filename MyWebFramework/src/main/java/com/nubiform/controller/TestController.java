package com.nubiform.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
public class TestController {
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public void test() {
		
	}
}
