package com.demo;

import com.demo.controller.WelcomeController;
import com.demo.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author yangqian
 * @date 2020/12/31
 */
@Configuration
@ComponentScan("com.demo")
public class Entrance {

	public static void xmlLoadClass(String[] args) {
		String springConfigXml = "classpath:/spring/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(springConfigXml);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeServiceImpl");
		System.out.println(welcomeService.sayHello("Hello"));
	}

	public static void annotationLoadClass(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		long count = applicationContext.getBeanDefinitionCount();
		System.out.println("bean count : " + count);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeServiceImpl");
		System.out.println(welcomeService.sayHello("Hello Spring Framework !!!"));

		WelcomeController welcomeController = (WelcomeController) applicationContext.getBean("welcomeController");
		welcomeController.handleRequest();
	}

	public static void main(String[] args) {
		annotationLoadClass(args);
	}


}
