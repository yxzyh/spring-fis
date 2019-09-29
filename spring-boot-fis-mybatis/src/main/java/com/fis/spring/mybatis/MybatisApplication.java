package com.fis.spring.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MybatisApplication
 *
 */
@SpringBootApplication
@MapperScan({"com.fis.spring.mybatis.system.dao"})
public class MybatisApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "start..." );
        SpringApplication.run(MybatisApplication.class, args);
        System.out.println( "success..." );
    }
}
