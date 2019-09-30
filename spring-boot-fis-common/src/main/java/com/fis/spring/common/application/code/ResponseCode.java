package com.fis.spring.common.application.code;

/**
 * 返回码
 * @author XiaoLu.Su 
 * @Date Sep 30, 2019
 */
public enum ResponseCode {

	OTHER(-2,"其他错误"),
	ERROR(-1,"系统错误"),
	SUCCESS(200,"成功");
	
	/**   
	*   
	* @param code
	* @param message   
	*/  
	private ResponseCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	private 
	int code;
	String message;
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
