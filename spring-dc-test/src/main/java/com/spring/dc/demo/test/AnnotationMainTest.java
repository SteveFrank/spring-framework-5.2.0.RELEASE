package com.spring.dc.demo.test;

import com.spring.dc.demo.test.bean.Cat;
import com.spring.dc.demo.test.bean.Person;
import com.spring.dc.demo.test.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author frankq
 * @date 2021/11/3
 */
public class AnnotationMainTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(MainConfig.class);
//		Person bean = applicationContext.getBean(Person.class);
//		System.out.println(bean);

//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String name : beanDefinitionNames) {
//			System.out.println(name);
//		}

//		Cat bean1 = applicationContext.getBean(Cat.class);
//
//		Cat bean2 = applicationContext.getBean(Cat.class);
//		// 原型模式每创建一个都是新对象
//		System.out.println(bean1 == bean2);

		// Person 就是单实例，导致获取Cat就是第一次创建Person对象的时候，容器初始化的时候的cat
		Person bean1 = applicationContext.getBean(Person.class);
		Cat cat1 = bean1.getCat();

		Person bean2 = applicationContext.getBean(Person.class);
		Cat cat2 = bean2.getCat();

		// 在不适用 @Lookup注解的时候 结果为true
		System.out.println(cat1 == cat2);

		System.out.println();

	}

}
