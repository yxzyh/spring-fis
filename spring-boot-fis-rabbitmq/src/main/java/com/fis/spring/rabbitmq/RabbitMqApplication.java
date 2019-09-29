package com.fis.spring.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  RabbitMqApplication!
 *
 */
@SpringBootApplication
public class RabbitMqApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "start..." );
        SpringApplication.run(RabbitMqApplication.class, args);
        System.out.println( "success..." );
    }
}
