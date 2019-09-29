package com.fis.spring.mybatis.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.spring.mybatis.system.dao.UserGroupMapper;
import com.fis.spring.mybatis.system.entity.UserGroup;

/**
 * service接口
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
@Service
public class MybatisService {
	
	@Autowired
	UserGroupMapper userGroupMapper;

	/**
	 * 获取所有用户
	 *
	 * @return
	 */
	public List<UserGroup> getAll() {
		return userGroupMapper.selectAll();
	}

}
