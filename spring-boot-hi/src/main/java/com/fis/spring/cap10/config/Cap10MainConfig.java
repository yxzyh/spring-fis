package com.fis.spring.cap10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author DELL
 *
 */
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.fis.spring.cap10.aop.Calculator;
import com.fis.spring.cap10.aop.LogAspects;
@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {
	
	@Bean
	public Calculator calculator() {
		return new Calculator();
	}
	
	@Bean
	public LogAspects logAspects() {
		return new LogAspects();
	}
}
