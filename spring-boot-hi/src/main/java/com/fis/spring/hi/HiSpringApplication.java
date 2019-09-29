package com.fis.spring.hi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class HiSpringApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "start..." );
        SpringApplication.run(HiSpringApplication.class, args);
        System.out.println( "success..." );
    }
}
