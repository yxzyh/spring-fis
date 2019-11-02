package com.fis.spring.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fis.spring.cap11.config.Cap11MainConfig;
import com.fis.spring.cap11.service.OrderService;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年10月28日下午5:50:40 
 */
public class Cap11Test {

	@Test
	public void test01() {
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(Cap11MainConfig.class);
		OrderService orderService = anno.getBean(OrderService.class);
		orderService.addOrder();
		anno.close();
		
	}
}
