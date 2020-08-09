package com.nubiform.myapp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyBeanAop {
	public void before() {
		System.out.println("before");
	}
	
	public void after() {
		System.out.println("after");
	}
	
	public void returning() {
		System.out.println("returning");
	}
	
	public void throwing() {
		System.out.println("throwing");
	}
	
	public void around(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("start around");
			long start = System.currentTimeMillis();
			
			joinpoint.proceed();
			
			long end = System.currentTimeMillis();
			System.out.println("end around " + (end - start));
		}
		catch (Throwable t) {
			System.out.println("around throwing");
		}
	}
}