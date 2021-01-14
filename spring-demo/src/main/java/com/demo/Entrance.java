package com.demo;

import com.demo.controller.WelcomeController;
import com.demo.entity.User;
import com.demo.entity.factory.UserFactoryBean;
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

	/**
	 * XML 配置信息
	 *
	 * @param args
	 */
	public static void xmlLoadClass(String[] args) {
		String springConfigXml = "classpath:/spring/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(springConfigXml);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		System.out.println(welcomeService.sayHello("Hello"));

		User user1a = (User) applicationContext.getBean("user1");
		User user1b = (User) applicationContext.getBean("user1");

		User user2a = (User) applicationContext.getBean("user2");
		User user2b = (User) applicationContext.getBean("user2");

		User user3a = (User) applicationContext.getBean("user3");
		User user3b = (User) applicationContext.getBean("user3");

		UserFactoryBean userFactoryBean4a = (UserFactoryBean) applicationContext.getBean("&userFactoryBean");
		UserFactoryBean userFactoryBean4b = (UserFactoryBean) applicationContext.getBean("&userFactoryBean");

		System.out.println(user1a);
		System.out.println(user1b);
		System.out.println("========");
		System.out.println(user2a);
		System.out.println(user2b);
		System.out.println("========");
		System.out.println(user3a);
		System.out.println(user3b);
		System.out.println("========");
		System.out.println(userFactoryBean4a);
		System.out.println(userFactoryBean4b);
		System.out.println("========");



	}

	/**
	 * 注解配置信息
	 *
	 * @param args
	 */
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

		// MyBatis 框架通过这样的方式整合数据
		User user5 = (User) applicationContext.getBean("user5");
		System.out.println("CustomizedBeanDefinitionRegistryPostProcessor 创建对象:" + user5);

	}

	public static void main(String[] args) {

//		xmlLoadClass(args);

		annotationLoadClass(args);
	}


}
