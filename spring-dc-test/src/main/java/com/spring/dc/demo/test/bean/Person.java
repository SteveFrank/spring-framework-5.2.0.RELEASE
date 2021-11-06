package com.spring.dc.demo.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class Person {

	public Person(){
		System.out.println("person创建....");
	}

	private String name;

	@Autowired
	private Cat cat;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Lookup // 容器中去找，@Bean的方式是不生效的
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}

