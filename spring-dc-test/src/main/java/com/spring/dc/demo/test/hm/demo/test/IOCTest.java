package com.spring.dc.demo.test.hm.demo.test;

import com.spring.dc.demo.test.hm.demo.cyclic.TestService1;
import com.spring.dc.demo.test.hm.demo.cyclic.TestService2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author frankq
 * @date 2021/11/15
 */
public class IOCTest {


	/* 	   问题1：如何创建的BeanFactory(真实类型是什么)？
		   问题2：如何解析的配置文件，封装的BeanDefation

		   ---
		   问题3：验证IOC流程
		   问题4：Bean的生命周期
		   问题5：什么是循环依赖？怎么解决循环依赖【重点分析】
		 */
/*	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		TestBean testBean = (TestBean) applicationContext.getBean("testBean");
		testBean.print();
		applicationContext.close();
	}*/



	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("classpath:spring/spring-cyclic.xml");

		TestService1 testService1 = (TestService1) applicationContext.getBean("testService1");
		TestService2 testService2 = (TestService2) applicationContext.getBean("testService2");
		testService1.aTest();
		testService2.aTest();
	}

}
