package com.spring.dc.demo.test.config;

import com.spring.dc.demo.test.bean.Cat;
import com.spring.dc.demo.test.bean.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author frankq
 * @date 2021/11/3
 */
//@Import({MainConfig.MyImportRegistrar.class})
@Configuration
@ComponentScan("com.spring.dc.demo.test")
public class MainConfig {

//	@Bean
//	public Person person() {
//		Person person = new Person();
//		person.setName("李四");
//		return person;
//	}

	static class MyImportRegistrar implements ImportBeanDefinitionRegistrar {
		/**
		 * BeanDefinitionRegistry registry
		 * 	bean定义信息的的注册中心（特别重要） 图纸，定义中心
		 * 		它这个里面都是 BeanDefinition
		 */
		@Override
		public void registerBeanDefinitions(
				AnnotationMetadata importingClassMetadata,
				BeanDefinitionRegistry registry,
				BeanNameGenerator importBeanNameGenerator) {
			// BeanDefinition
			RootBeanDefinition catDefinition = new RootBeanDefinition();
			catDefinition.setBeanClass(Cat.class);
			// 可以声明定义信息，包括需要自动装配什么?

			registry.registerBeanDefinition("tomCat", catDefinition);
		}
	}

}
