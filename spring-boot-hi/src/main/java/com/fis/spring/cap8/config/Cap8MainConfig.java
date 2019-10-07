package com.fis.spring.cap8.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.fis.spring.cap8.entity.Bird;

@Configuration
@PropertySource(value="classpath:/test.properties")
public class Cap8MainConfig {

	@Bean
	public Bird bird() {
		return new Bird();
	}
	
	
}
