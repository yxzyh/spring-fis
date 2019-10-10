package com.fis.spring.cap9.bean;

import org.springframework.stereotype.Component;

@Component
public class Moon {

	public Moon() {
		System.out.println("moon...constructor...");
	}
	public void init() {
		System.out.println("moon ... init..");
	}
	
	public void destory() {
		System.out.println("moon...destory...");
	}
}
