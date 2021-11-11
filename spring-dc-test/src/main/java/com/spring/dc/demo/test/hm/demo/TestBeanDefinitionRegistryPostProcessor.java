package com.spring.dc.demo.test.hm.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author frankq
 * @date 2021/11/11
 */
@Component
public class TestBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition testBean = beanFactory.getBeanDefinition("testBean");
		System.out.println("【BeanFactoryPostProcessor...postProcessBeanFactory方法】" + testBean.getBeanClassName());
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		// 添加Bean定义
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
		rootBeanDefinition.setBeanClass(TestUser.class);
		registry.registerBeanDefinition("user", rootBeanDefinition);
		System.out.println("【BeanDefinitionRegistryPostProcessor...postProcessBeanDefinitionRegistry方法】");
	}
}
