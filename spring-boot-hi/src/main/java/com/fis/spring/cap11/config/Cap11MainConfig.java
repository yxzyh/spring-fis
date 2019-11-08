package com.fis.spring.cap11.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年10月28日下午5:12:38 
 */
@Configuration
@ComponentScan("com.fis.spring.cap11")
@EnableTransactionManagement
public class Cap11MainConfig {

	//创建数据源
	@Bean
	public DataSource dataSource() throws PropertyVetoException {
		//c3po封装了jdbc，dataSource的接口实现。
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		//dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
		return dataSource;
	}
	
	//能简化增删改查操作
	@Bean
	public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}
	
	//注册事务管理管理器
	@Bean
	public PlatformTransactionManager platformTransactionManager() throws PropertyVetoException {
		return new DataSourceTransactionManager(dataSource());
	}
	
}
