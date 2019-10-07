package com.fis.spring.cap9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fis.spring.cap9.dao.TestDao;

@Configuration
@ComponentScan({"com.fis.spring.cap9.controller","com.fis.spring.cap9.service","com.fis.spring.cap9.dao"})
public class Cap9MainConfig {

	//@Primary
	@Bean("testDao")
	public TestDao testDao() {
		TestDao testDao2 = new TestDao();
		testDao2.setFlag("2");
		return testDao2;
	}
	
}
