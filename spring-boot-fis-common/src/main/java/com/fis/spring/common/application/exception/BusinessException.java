package com.fis.spring.common.application.exception;

import com.fis.spring.common.application.code.ResponseCode;

/**
 * 自定义异常处理
 * @author XiaoLu.Su 
 * @Date Sep 30, 2019
 */
public class BusinessException extends RuntimeException {

	/**   
	* serialVersionUID:TODO(用一句话描述这个变量表示什么).
	* @since JDK 1.8
	*/
	private static final long serialVersionUID = 1L;
	
	private String message;
	private int code = ResponseCode.OTHER.getCode();
	
	
	
	/**   
	* Creates a new instance of BusinessException.   
	*   
	* @param message
	* @param code   
	*/  
	public BusinessException(String message, int code) {
		super();
		this.message = message;
		this.code = code;
	}
	
	
	
	/**   
	* Creates a new instance of BusinessException.   
	*   
	* @param message   
	*/  
	public BusinessException(String message) {
		super();
		this.message = message;
	}



	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	


}
