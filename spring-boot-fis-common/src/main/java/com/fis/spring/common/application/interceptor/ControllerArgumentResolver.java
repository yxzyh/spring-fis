package com.fis.spring.common.application.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.fis.spring.common.application.action.ActionContent;

/**
 * 入参拦截处理
 * @author XiaoLu.Su 
 * @Date Sep 30, 2019
 */
@Service
public class ControllerArgumentResolver implements HandlerMethodArgumentResolver{

	/* 
	 */
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return parameter.getParameterType()==ActionContent.class?true:false;
	}

	/* ActionContent(request)
	 * 获取值
	 */
	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
		if(request == null){
			return null;
		}
		
		return new ActionContent(request);
	}

}
