package com.fis.spring.common.biz.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.fis.spring.common.application.action.ActionContent;
import com.fis.spring.common.framework.util.JsonUtil;

/**
 * common service层
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
@Service
public class CommonService {

	/**
	 * 获取结果
	 *
	 * @param ac
	 * @return 
	 */
	public String getResult(ActionContent ac) {
		JSONObject args = ac.getParameters();
		String rst = JsonUtil.getString(args,"fis","-1");
		return rst;
	}

}
