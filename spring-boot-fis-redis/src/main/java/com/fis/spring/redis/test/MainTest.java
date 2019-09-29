package com.fis.spring.redis.test;

import org.junit.Test;
import org.springframework.stereotype.Controller;

import redis.clients.jedis.Jedis;

/**
 * 用一句话描述这个类的作用
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
@Controller
public class MainTest {

	
	@Test
	public void testConnection() throws InterruptedException{
		String host = "localhost";
		int port = 6379;
		Jedis jedis = new Jedis(host,port);
		
		jedis.set("fis", "fisValue...");
		jedis.expire("fis", 2);
		
		String rst = jedis.get("fis");
		System.out.println(rst);
		Thread.sleep(3000);
		String rst2 = jedis.get("fis");
		System.out.println(rst2);
		jedis.close();
		
	}
	

}
