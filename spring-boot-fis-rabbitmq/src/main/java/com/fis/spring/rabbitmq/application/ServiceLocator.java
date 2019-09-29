package com.fis.spring.rabbitmq.application;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 获取注册新的bean
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
@Service
public class ServiceLocator implements ApplicationContextAware {
	
	private static ApplicationContext applicationContext; 
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ServiceLocator.applicationContext = applicationContext;
	}
	
	public static <T> T getBean(Class<T> requiredType){
		return applicationContext.getBean(requiredType);
	}
	
	public static Object getBean(String name){
		return applicationContext.getBean(name);
	}

	
}
