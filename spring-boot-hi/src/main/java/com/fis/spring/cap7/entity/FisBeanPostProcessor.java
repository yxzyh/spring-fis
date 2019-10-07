package com.fis.spring.cap7.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class FisBeanPostProcessor implements BeanPostProcessor{

	//return a post bean
	//在初始化方法调用之前进行后置处理工作
	//什么时候调用它，init-method=init之前调用
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization..." + beanName + "..." + bean);
		return bean;
	}
	
	/**
	 * 
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization..." + beanName + "..." + bean);
		return bean;
	}
}
