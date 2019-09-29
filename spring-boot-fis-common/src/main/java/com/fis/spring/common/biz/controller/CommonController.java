package com.fis.spring.common.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fis.spring.common.application.action.ActionContent;
import com.fis.spring.common.application.action.ActionResult;
import com.fis.spring.common.biz.service.CommonService;

/**
 * common控制层
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
@Controller
@RequestMapping("common")
public class CommonController {
	
	@Autowired
	CommonService commonService;
	
	@RequestMapping("getResult")
	public ActionResult getResult(ActionContent ac){
		ActionResult ar = new ActionResult();
		String str = commonService.getResult(ac);
		ar.setData(str);
		return ar;
	}

}
