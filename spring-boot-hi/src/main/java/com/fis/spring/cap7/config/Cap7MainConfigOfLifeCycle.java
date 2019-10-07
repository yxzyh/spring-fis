package com.fis.spring.cap7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.fis.spring.cap7.entity.Bike;
import com.fis.spring.cap7.entity.Person;

@ComponentScan("com.fis.spring.cap7.entity")
@Configuration
public class Cap7MainConfigOfLifeCycle {

	@Bean("person")
	public Person person() {
		System.out.println("给容器中添加person....");
		return new Person("person",20);
	}
	
	//@Scope("prototype")
	@Bean(initMethod = "init", destroyMethod = "destory")
	public Bike bike() {
		return new Bike();
	}
}
