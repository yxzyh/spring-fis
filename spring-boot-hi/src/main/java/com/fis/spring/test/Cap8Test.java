package com.fis.spring.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.fis.spring.cap8.config.Cap8MainConfig;
import com.fis.spring.cap8.entity.Bird;

public class Cap8Test {

	@Autowired
	@Test
	public void test01() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
		System.out.println("IOC 容器创建完成...");
		String[] names = app.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println(name);
		}
		
		Bird bird = app.getBean(Bird.class);
		System.out.println(bird.toString());
		
		ConfigurableEnvironment env = app.getEnvironment();
		String color = env.getProperty("bird.color");
		System.out.println(color);
		
		app.close();
		System.out.println("IOC 容器关闭...");
	}
}
