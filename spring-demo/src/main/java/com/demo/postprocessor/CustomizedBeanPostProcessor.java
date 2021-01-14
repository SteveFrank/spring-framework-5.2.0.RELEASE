package com.demo.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 对Bean的包装，对Bean的统一逻辑处理
 *
 * AOP的范畴可以适用
 *
 * @author yangqian
 * @date 2021/1/14
 */
@Configuration
public class CustomizedBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "调用了 postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "调用了 postProcessAfterInitialization");
		return bean;
	}
}
