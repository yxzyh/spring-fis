package com.fis.spring.redis.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * 消息发布
 * @author XiaoLu.Su 
 * @Date Oct 10, 2019
 */
public class PublishTest {

	@Test
	public void testPublish() throws InterruptedException{
		Jedis jedis = new Jedis("localhost");
        jedis.publish("redisChatTest", "Java架构技术交流");
        Thread.sleep(5000);
        jedis.publish("redisChatTest", "加入");
        Thread.sleep(5000);
        jedis.publish("redisChatTest", "747981058");
        jedis.close();
		
	}
}
