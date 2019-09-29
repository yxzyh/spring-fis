package com.fis.spring.rabbitmq.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fis.spring.rabbitmq.config.RabbitConfig;

/**
 * rabbitmq消费者
 * @author XiaoLu.Su 
 * @Date Sep 29, 2019
 */
@Component
@RabbitListener(queues = RabbitConfig.QUEUE_A)
public class MsgReceiver_C {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RabbitHandler
	public void process(String message){
		logger.info("接受队列A消息：" + message);
	}

}
