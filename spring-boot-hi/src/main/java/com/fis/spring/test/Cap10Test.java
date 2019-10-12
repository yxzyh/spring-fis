package com.fis.spring.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fis.spring.cap10.aop.Calculator;
import com.fis.spring.cap10.config.Cap10MainConfig;

public class Cap10Test {

	@Test
	public void test01() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
		System.out.println(app);
		
		Calculator cal = app.getBean(Calculator.class);
		int result = cal.div(3, 2);
		System.out.println(result);
		app.close();
	}
}
