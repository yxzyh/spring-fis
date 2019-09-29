package com.fis.spring.common.application.action;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;

/**
 * 入参封装
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
public class ActionContent {

	private HttpServletRequest request;
	private JSONObject data;
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public JSONObject getData() {
		return data;
	}
	public void setData(JSONObject data) {
		this.data = data;
	}
	
	
}
