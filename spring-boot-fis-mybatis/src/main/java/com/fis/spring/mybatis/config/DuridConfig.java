package com.fis.spring.mybatis.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;


/**
 * DuridConfig
 * 
 * @author XiaoLu.Su
 * @Date Sep 20, 2019
 */
@Configuration
public class DuridConfig {

	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DataSource druidDataSource() {
		return new DruidDataSource();
	}

	/**
	 * 配置 Druid 监控 之 管理后台的 Servlet 内置 Servler 容器时没有web.xml 文件，所以使用 Spring Boot
	 * 的注册 Servlet 方式
	 */
	@Bean
	public ServletRegistrationBean statViewServlet() {
		ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

		/**
		 * loginUsername：Druid 后台管理界面的登录账号 loginPassword：Druid 后台管理界面的登录密码
		 * allow：Druid 后台允许谁可以访问 initParams.put("allow", "localhost")：表示只有本机可以访问
		 * initParams.put("allow", "")：为空或者为null时，表示允许所有访问 deny：Druid 后台拒绝谁访问
		 * initParams.put("deny", "192.168.1.20");表示禁止此ip访问
		 * 访问地址：
		 * http://localhost:9527/druid/
		 * 
		 */
		Map<String, String> initParams = new HashMap<>();
		initParams.put("loginUsername", "admin");
		initParams.put("loginPassword", "123456");
		initParams.put("allow", "localhost");
		/* initParams.put("deny", "192.168.1.20"); */

		/** 设置初始化参数 */
		bean.setInitParameters(initParams);
		return bean;
	}

}
