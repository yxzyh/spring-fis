package com.fis.spring.cap11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fis.spring.cap11.dao.OrderDao;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年10月28日下午5:49:03 
 */
@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Transactional
	public void addOrder() {
		orderDao.insert();
		System.out.println("service ,insert");
		
		int a = 1/0;
		
	}
}
