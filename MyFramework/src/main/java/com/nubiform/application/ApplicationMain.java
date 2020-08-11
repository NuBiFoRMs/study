package com.nubiform.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.nubiform.service.TestService;
import com.nubiform.util.MyComponent;

@Component
public class ApplicationMain extends MyComponent {
	
	@Autowired
	TestService testService;
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/context-*.xml");
		
		context.getBean(ApplicationMain.class).run(args);
	}
	
	public void run(String[] args) {
		logger.info("Start Application");
		
		testService.getValue();
		
		logger.info("End Application");
	}
	
}