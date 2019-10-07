package com.fis.spring.cap8.entity;

import org.springframework.beans.factory.annotation.Value;

public class Bird {

	/**
	 * @value赋值 1.基本字符，2.spring EL表达式
	 * 
	 */
	@Value("Fis")
	private String name;
	@Value("#{20-2}")
	private Integer age;
	@Value("${bird.color}")
	private String color;
	

	public Bird(String name, Integer age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}


	@Override
	public String toString() {
		return "Bird [name=" + name + ", age=" + age + ", color=" + color + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Bird() {
		super();
	}
	
	
}
