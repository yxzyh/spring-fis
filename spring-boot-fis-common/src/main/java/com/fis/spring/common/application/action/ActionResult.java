package com.fis.spring.common.application.action;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fis.spring.common.application.code.ResponseCode;

/**
 * 返回值封装
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
public class ActionResult {

	private Object data;
	private int code;
	private String message;
    private int innerCode;
    private String innerMessage;
	
	
	
	/**   
	*      
	*/  
	public ActionResult() {
		this(new JSONObject());
	}

	/**   
	*   
	* @param jsonObject   
	*/  
	public ActionResult(JSONObject jsonObject) {
		this.code = ResponseCode.SUCCESS.getCode();
		this.message = ResponseCode.SUCCESS.getMessage();
		this.data = jsonObject;
	}

//	public JSONObject toResultJson(){
//		JSONObject json = new JSONObject();
//		json.put("code", this.code);
//		json.put("message", this.message);
//		json.put("data", this.data==null?new ActionResult():this.data);
//		return json;
//	}
	
	  public JSONObject toResultJson() {
	        JSONObject json = new JSONObject();
	        json.put("data", (this.data == null ? new JSONObject() : this.data));

	        if (!StringUtils.isEmpty(this.innerCode) && (ResponseCode.SUCCESS.getCode() == this.innerCode)) {
	            json.put("innerCode", this.innerCode);
	            json.put("innerMessage", this.innerMessage);
	        } else {
	            json.put("response_code", this.code);
	            json.put("response_message", this.message);
	        }

	        return json;
	    }
	
	public <T> void setData(String key, T object){
		if(this.data == null){
			this.data = new JSONObject();
		}
		this.getData().put(key,object);
	}
	
	public void setMap(Map map){
		this.data = new JSONObject(map);
	}
	

	public JSONObject getData() {
		return (JSONObject)data;
	}
	
	public void setData(JSONObject data) {
		this.data = data;
	}
	
	public void setData(JSONArray data) {
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

	public int getInnerCode() {
		return innerCode;
	}

	public void setInnerCode(int innerCode) {
		this.innerCode = innerCode;
	}

	public String getInnerMessage() {
		return innerMessage;
	}

	public void setInnerMessage(String innerMessage) {
		this.innerMessage = innerMessage;
	}
	
	
	
}
