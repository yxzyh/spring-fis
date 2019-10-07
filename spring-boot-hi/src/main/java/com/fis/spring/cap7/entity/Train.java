package com.fis.spring.cap7.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Train implements InitializingBean, DisposableBean{

	public Train() {
		System.out.println("Train...constructor...");
	}
	
	//当bean销毁时，调用方法
	@Override
	public void destroy() throws Exception {
		System.out.println("Train...destory...");		
	}

   //bean赋值和初始化完成时，调用。
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Train...afterPropertiesSet...");		
	}

}
