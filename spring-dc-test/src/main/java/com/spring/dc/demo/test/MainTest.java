package com.spring.dc.demo.test;

import com.spring.dc.demo.test.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author frankq
 * @date 2021/11/6
 */
public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-config.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}

}

