package com.demo;

import com.demo.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author yangqian
 * @date 2020/12/31
 */
public class Entrance {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String springConfigXml = "classpath:/spring/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(springConfigXml);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		System.out.println(welcomeService.sayHello("Hello"));

	}
}
