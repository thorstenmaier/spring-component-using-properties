package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComponentUsingProperties {

	@Value("${app.name}")
	private String appName;
	
	@PostConstruct
	public void init() {
		System.out.println("AppName: " + appName);
	}
}
