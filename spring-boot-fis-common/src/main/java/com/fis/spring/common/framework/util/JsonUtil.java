package com.fis.spring.common.framework.util;

import com.alibaba.fastjson.JSONObject;
import com.fis.spring.common.application.exception.BusinessException;

/**
 * Json工具类
 * @author XiaoLu.Su 
 * @Date Sep 30, 2019
 */
public class JsonUtil {

	/**
	 * 获取json的string值
	 *
	 * @param args
	 * @param string
	 * @param string2
	 */
	public static String getString(JSONObject args, String key, String defaultValue) {
		return getObject(args,key,String.class,defaultValue);
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T getObject(JSONObject args, String key,Class classType ){
		
		if(!args.containsKey(key)){
			throw new BusinessException("不存在参数为 " + key + "的值！");
		}
		
		T value = (T) args.getObject(key, classType);
		if(value == null || value.toString().trim() == ""){
			throw new BusinessException("参数" + key + "的值为空！");
		}
		
		return value;
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T getObject(JSONObject args, String key, Class classType, T defaultValue){
		
		if(args == null || !args.containsKey(key)){
			return defaultValue;
		}
		
		T value = (T) args.getObject(key, classType);
		if(value == null || value.toString().trim() == ""){
			return defaultValue;
		}
		
		return value;
		
	}

}
