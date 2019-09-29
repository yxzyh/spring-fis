package com.fis.spring.mybatis.biz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.spring.mybatis.biz.service.MybatisService;
import com.fis.spring.mybatis.system.entity.UserGroup;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * mybatis调用数据库
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
@RestController
@RequestMapping("mybatis")
public class MyBatisController {
	
	@Autowired
	MybatisService mybatisService;
	
	@RequestMapping("list")
	public PageInfo getValue(){
		PageHelper.startPage(1, 10);
		List<UserGroup> list = mybatisService.getAll();
		PageInfo<UserGroup> info = new PageInfo<UserGroup>(list);
		return info;
	}

}
