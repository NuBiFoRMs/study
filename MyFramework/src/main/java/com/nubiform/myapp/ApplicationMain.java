package com.nubiform.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nubiform.util.MyService;

public class ApplicationMain {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/context-*.xml");
		
		System.out.println("Start Application");
		
		MyBean myBean = null;
		
		try {
			myBean = context.getBean("myBeanEnglish", MyBean.class);
			myBean.sayHello();
			myBean = context.getBean("myBeanKorean", MyBean.class);
			myBean.sayHello();
			
			TestService myService = context.getBean("testServiceImpl", TestService.class);
			myService.getList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("End Application");
	}

}
