package com.fis.spring.common.application.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fis.spring.common.application.action.ActionResult;
import com.fis.spring.common.application.exception.BusinessException;

/**
 * 出参拦截处理
 * @author XiaoLu.Su 
 * @Date Sep 30, 2019
 */
@Service
public class ControllerReturnValueHandler implements HandlerMethodReturnValueHandler{

	/* 
	 */
	@Override
	public boolean supportsReturnType(MethodParameter returnType) {
		return returnType.getParameterType()==ActionResult.class?true:false;
	}

	/* 
	 */
	@Override
	public void handleReturnValue(Object returnValue, MethodParameter returnType, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest) throws Exception {
		
		mavContainer.setRequestHandled(true);
		HttpServletResponse response = webRequest.getNativeResponse(HttpServletResponse.class);
		if(response == null){
			throw new BusinessException("获取数据异常");
		}
		response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
		PrintWriter print = null;
	
		try {
			print = response.getWriter();
			
			ActionResult ar;
			if(returnValue == null){
				ar =  new ActionResult();
			}else{
				ar = (ActionResult) returnValue;
			}
			print.write(JSONObject.toJSONString(ar.toResultJson(), SerializerFeature.WriteMapNullValue));
			print.close();
		} catch (Exception e) {
			throw new BusinessException("IO错误！");
		}
	}

}
