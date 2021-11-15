package com.spring.dc.demo.test.hm.demo.test;

import com.spring.dc.demo.test.hm.demo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author frankq
 * @date 2021/11/15
 */
public class AOPTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("classpath:spring/spring-aop.xml");

		UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
		userService.findAll();
	}

}
