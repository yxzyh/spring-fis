package com.fis.spring.cap9.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fis.spring.cap9.dao.TestDao;

@Service
public class TestService {

	//@Qualifier("testDao")
	//@Autowired
	//@Resource 1.不支持Primary功能，2.不支持Autowired false功能。
	//@Resource(name="testDao")
	@Inject  //需要额外引用pom包，javax.inject,与autowired功能差不多，
	//支持@Primary，只是没有autowired required= false功能。不依赖spring，可以注入bean
	private TestDao testDao;
	
	public void println() {
		String daoStr = testDao.toString();
		System.out.println(daoStr);
	}
}
