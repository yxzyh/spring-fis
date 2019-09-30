package com.fis.spring.common.application.interceptor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器
 * @author XiaoLu.Su 
 * @Date Sep 30, 2019
 */
@Configuration
public class SessionInterceptor implements WebMvcConfigurer{

	@Autowired
	ControllerArgumentResolver controllerArgumentResolver;
	
	@Autowired
	ControllerReturnValueHandler controllerReturnValueHandler;
	
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers){
		resolvers.add(controllerArgumentResolver);
	}
	
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers){
		handlers.add(controllerReturnValueHandler);
	}
	
	
}
