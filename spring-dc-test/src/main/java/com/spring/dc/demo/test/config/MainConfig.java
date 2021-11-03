package com.spring.dc.demo.test.config;

import com.spring.dc.demo.test.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author frankq
 * @date 2021/11/3
 */
@Configuration
public class MainConfig {

	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("李四");
		return person;
	}

}
