package com.nubiform.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/properties/config.properties")
public class CommonProperty {
	@Autowired
	public Environment environment;
	
	public String getProperty(String key) {
		return environment.getProperty(key);
	}
	
}