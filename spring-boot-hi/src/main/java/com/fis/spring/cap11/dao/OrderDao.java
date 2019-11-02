package com.fis.spring.cap11.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年10月28日下午5:42:19 
 */
@Repository
public class OrderDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void insert() {
		String sql = "insert into `order`(ordertime,ordermoney,orderstatus) values(?,?,?) ";
		jdbcTemplate.update(sql, new Date(),20,0);
		System.out.println("插入操作完成！");
	}
}
