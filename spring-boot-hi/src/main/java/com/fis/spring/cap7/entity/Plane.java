package com.fis.spring.cap7.entity;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class Plane implements ApplicationContextAware{

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		System.out.println("123");
		this.applicationContext = applicationContext;
	}
	
	public static void main(String[] args) {
		System.out.println("123123");
	}

}
