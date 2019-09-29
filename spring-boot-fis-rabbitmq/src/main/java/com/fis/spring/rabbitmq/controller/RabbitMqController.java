package com.fis.spring.rabbitmq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.spring.rabbitmq.application.ServiceLocator;

/**
 * 发送消息测试
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
@RestController
@RequestMapping("rabbitMq")
public class RabbitMqController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private MsgProducer msgProducer = ServiceLocator.getBean(MsgProducer.class);
	
	@RequestMapping("send")
	public void sendMsg(){
		logger.info("开始发送信息：");
		msgProducer.sendMsg("xiaolu send a message to RabbitMq...");
	}

}
