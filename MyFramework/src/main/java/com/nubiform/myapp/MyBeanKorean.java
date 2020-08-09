package com.nubiform.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBeanKorean implements MyBean {
	
	@Autowired
	private Name name;
	
	@Override
	public void sayHello() throws Exception {
		System.out.println(this.name.name + ": 안녕하세요");
		
		throw new Exception();
	}
	
}