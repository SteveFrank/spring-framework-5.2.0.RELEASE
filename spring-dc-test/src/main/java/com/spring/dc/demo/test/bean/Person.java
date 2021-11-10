package com.spring.dc.demo.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

/**
 * aware 装配
 * 实现了 XXXAware 就可以拿到对应的对象
 *
 * Aware 接口：帮助我们装配Spring底层的一些组件儿
 *
 * 1、Bean 的功能增强全部都是有 BeanPostProcessor + InitializingBean 合起来完成的
 * 2、骚操作 BeanPostProcessor + InitializingBean （事务、通知、web 等等）
 *
 */
@Component
public class Person implements ApplicationContextAware, MessageSourceAware {

	public Person(){
		System.out.println("person创建....");
	}

	private String name;

	// 可以拿到ioc容器
//	@Autowired
//	private ApplicationContext context;
//
//	public ApplicationContext getContext() {
//		return context;
//	}

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
				", cat=" + cat +
				'}';
	}

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// 利用回调机制，将ioc容器传入
		this.applicationContext = applicationContext;
	}

	private MessageSource messageSource;

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}
}

