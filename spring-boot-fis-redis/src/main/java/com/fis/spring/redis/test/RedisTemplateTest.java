package com.fis.spring.redis.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用一句话描述这个类的作用
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
@RestController
@RequestMapping("template")
public class RedisTemplateTest {
	@Autowired
	private RedisTemplate<String,Object> redisTemplate; 
	
	@RequestMapping("getValue")
	public String testRedisTemplate(){
		redisTemplate.opsForValue().set("fis", 12306);
		String value = redisTemplate.opsForValue().get("fis")==null?null:redisTemplate.opsForValue().get("fis").toString();
		redisTemplate.opsForValue().set("xiaolu", "12306xiaolu");
		return value;
	}
}
