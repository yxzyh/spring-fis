package com.fis.spring.mybatis.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MyBatisGeneratorApp {

	public static void main(String[] args) throws Exception {
		generator();
		System.out.print("执行完毕！");
	}
	
	public static void generator() throws Exception{

	    List<String> warnings = new ArrayList<String>();
	    boolean overwrite = true;
	    //指定 逆向工程配置文件
	    File configFile = new File("src/main/java/com/fis/spring/mybatis/generator/config/generatorConfig.xml"); 
	    ConfigurationParser cp = new ConfigurationParser(warnings);
	    Configuration config = cp.parseConfiguration(configFile);
	    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
	    myBatisGenerator.generate(null);
	}
}
