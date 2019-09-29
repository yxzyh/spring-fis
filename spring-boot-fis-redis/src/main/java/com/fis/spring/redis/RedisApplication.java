package com.fis.spring.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * RedisApplication
 */
@SpringBootApplication
@EnableCaching
public class RedisApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "start..." );
        SpringApplication.run(RedisApplication.class, args);
        System.out.println( "success..." );
    }
}
