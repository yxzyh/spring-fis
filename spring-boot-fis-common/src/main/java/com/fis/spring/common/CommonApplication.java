package com.fis.spring.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CommonApplication
 *
 */
@SpringBootApplication
public class CommonApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "start..." );
        SpringApplication.run(CommonApplication.class, args);
        System.out.println( "success..." );
    }
}
