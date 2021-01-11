package com.demo.entity.factory;

import com.demo.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author yangqian
 * @date 2021/1/11
 */
public class UserFactoryBean implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
