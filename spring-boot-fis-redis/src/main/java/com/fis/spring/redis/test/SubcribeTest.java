package com.fis.spring.redis.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

import com.fis.spring.redis.message.RedisMsgPubSubListener;

/**
 * 消息订阅
 * @author XiaoLu.Su 
 * @Date Oct 10, 2019
 */
public class SubcribeTest {

	@Test
	public void testSubscribe(){
		String host = "localhost";
		int port = 6379;
		Jedis jedis = new Jedis(host,port);
		RedisMsgPubSubListener redisMsgPubSubListener = new RedisMsgPubSubListener(); 
		jedis.subscribe(redisMsgPubSubListener, "redisChatTest");
	}
}
