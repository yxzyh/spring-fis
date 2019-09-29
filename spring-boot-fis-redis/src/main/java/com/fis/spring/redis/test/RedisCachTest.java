package com.fis.spring.redis.test;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用一句话描述这个类的作用
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
@RestController
@RequestMapping("/caching")
public class RedisCachTest {
	
	
	@RequestMapping(value="/getValue")
	@Cacheable(cacheNames="fis", key="#id")
	public String getValue(@RequestParam("id") String id){
		return "123123sdfsdsdfdsadf";
	}
	
	@RequestMapping(value="/updateValue")
	@CachePut(cacheNames="fis",key="123456")
	public String updateValue(){
		return "updatefis...";
	}
	
	
	@RequestMapping(value="/deleteValue")
	@CacheEvict(cacheNames="fis",key="123456")
	public String deleteValue(){
		return "deletefis...";
	}
	
	
	@RequestMapping(value="/getTomcat")
	@Cacheable(value="tomcat",key="222222222")
	public String getTomcat(){
		return "tomcat123";
	}

}
