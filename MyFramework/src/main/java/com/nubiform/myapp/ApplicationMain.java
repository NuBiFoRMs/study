package com.nubiform.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) throws Exception {
		System.out.println("Start Application");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/context-*.xml");
		
		MyBean myBean = null;
		
		try {
			myBean = context.getBean("myBeanEnglish", MyBean.class);
			myBean.sayHello();
			myBean = context.getBean("myBeanKorean", MyBean.class);
			myBean.sayHello();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("End Application");
	}

}
