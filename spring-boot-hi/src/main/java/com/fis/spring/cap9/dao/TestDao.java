package com.fis.spring.cap9.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
	
	private String flag = "1";



	@Override
	public String toString() {
		return "TestDao [flag=" + flag + "]";
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	
	
}
