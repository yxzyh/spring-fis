package com.fis.xiaolu.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MongoApplication!
 *
 */
@SpringBootApplication
public class MongoApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "MongoApplication start ..." );
        SpringApplication.run(MongoApplication.class, args);
        System.out.println( "MongoApplication success ..." );
    }
}
