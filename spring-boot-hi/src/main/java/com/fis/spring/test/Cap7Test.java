package com.fis.spring.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fis.spring.cap7.config.Cap7MainConfigOfLifeCycle;

public class Cap7Test {

	@Autowired
	@Test
	public void test01() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfigOfLifeCycle.class);
		System.out.println("IOC 容器创建完成...");
		app.close();
		System.out.println("IOC 容器关闭...");
	}
}
