package com.fis.spring.common.application.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.fis.spring.common.application.exception.BusinessException;

/**
 * 入参封装
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
public class ActionContent {

	private HttpServletRequest request;
	private JSONObject data;
	
	
	
	/**   
	*   
	* @param request   
	*/  
	public ActionContent(HttpServletRequest request) {
		this.request = request;
		
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()){
			if(this.data == null){
				this.data = new JSONObject();
			}
			
			String name = parameterNames.nextElement();
			this.data.put(name, request.getParameter(name));
		}
		
		if(this.data == null){
			StringBuffer sb = new StringBuffer();
			try {
				BufferedReader br  = request.getReader();
				char[] c = new char[1024];
				int len; 
				if((len = br.read(c)) != -1){
					sb.append(c, 0, len);
				};
				br.close();
			} catch (IOException e) {
				throw new BusinessException("IO异常！");
			}
			this.data = JSONObject.parseObject(sb.toString());
		}
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public JSONObject getParameters(){
		return this.data==null?new JSONObject():this.data;
	}
	
	public JSONObject getData() {
		return data;
	}
	public void setData(JSONObject data) {
		this.data = data;
	}
	
	
}
