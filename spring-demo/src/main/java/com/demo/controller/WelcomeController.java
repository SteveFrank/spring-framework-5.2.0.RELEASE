package com.demo.controller;

import com.demo.service.WelcomeService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

/**
 * @author yangqian
 * @date 2021/1/9
 */
@Controller
public class WelcomeController implements ApplicationContextAware, BeanNameAware {

	private String myName;

	private ApplicationContext myContainer;

	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest() {
		welcomeService.sayHello("From Controller Say Hello .");
		System.out.println("Who is my : " + myName);
		String[] beanDefinitionNames = myContainer.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println("通过容器获得的bean : " + beanDefinitionName);
		}
	}

	@Override
	public void setBeanName(String name) {
		this.myName = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.myContainer = applicationContext;
	}
}
