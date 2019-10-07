package com.fis.spring.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.fis.spring.cap8.entity.Bird;
import com.fis.spring.cap9.config.Cap9MainConfig;
import com.fis.spring.cap9.dao.TestDao;
import com.fis.spring.cap9.service.TestService;

public class Cap9Test {

	@Autowired
	@Test
	public void test01() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
		System.out.println("IOC 容器创建完成...");

		TestService testService = app.getBean(TestService.class);
		testService.println();
		
		TestDao testDao = app.getBean(TestDao.class);
		System.out.println(testDao);
		
		//TestDao testDao2 = app.getBean("testDao2");
		
		
		
		
//		Bird bird = app.getBean(Bird.class);
//		System.out.println(bird.toString());
//		
//		ConfigurableEnvironment env = app.getEnvironment();
//		String color = env.getProperty("bird.color");
//		System.out.println(color);
		
		app.close();
		System.out.println("IOC 容器关闭...");
	}
}
