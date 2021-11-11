package com.spring.dc.demo.test.hm.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.stereotype.Component;

/**
 * @author frankq
 * @date 2021/11/11
 */
@Component
public class TestBean implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

	private String name;
	private BeanFactory beanFactory;
	private String beanName;

	public TestBean() {
		System.out.println("【构造器】TestBean");
	}

	public void testBeanInit() {
		System.out.println("【init-method 方法】");
	}

	public void print() {
		System.out.println("【print 方法】");
		System.out.println("Spring 源码环境构建完成 ... ...");
	}

	public void setName(String name) {
		System.err.println("【注入属性】 注入属性name");
		this.name = name;
	}

	/**
	 * 通过<bean>的init-method属性指定的初始化方法
	 */
	public void myInit() {
		System.err.println("[init-method] 调用<bean>的init-method属性指定的初始化方法");
	}

	/**
	 * 这是BeanFactoryAware接口方法
	 * @param beanFactory owning BeanFactory (never {@code null}).
	 * The bean can immediately call methods on the factory.
	 * @throws BeansException
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.err.println("[BeanFactoryAware接口] 调用BeanFactoryAware.setBeanFactory()");
		this.beanFactory = beanFactory;
	}

	/**
	 * 这是BeanNameAware接口方法
	 * @param name the name of the bean in the factory.
	 * Note that this name is the actual bean name used in the factory, which may
	 * differ from the originally specified name: in particular for inner bean
	 * names, the actual bean name might have been made unique through appending
	 * "#..." suffixes. Use the {@link BeanFactoryUtils#originalBeanName(String)}
	 */
	@Override
	public void setBeanName(String name) {
		System.err.println("[BeanNameAware接口] 调用BeanNameAware.setBeanName()");
		this.beanName = name;

	}

	/**
	 * 通过<bean>的destroy-method属性指定的初始化方法
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.err.println("[destroy-method] 调用<bean>的destroy-method属性指定的初始化方法");
	}

	/**
	 * 通过<bean>的destroy-method属性指定的初始化方法
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("[InitializingBean接口] 调用InitializingBean.afterPropertiesSet()");

	}

}
