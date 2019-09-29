package com.fis.spring.common.application.action;

import com.alibaba.fastjson.JSONObject;

/**
 * 返回值封装
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
public class ActionResult {

	private Object data;
	private int code;
	private String message;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
