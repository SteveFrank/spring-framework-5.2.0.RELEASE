package com.demo.entity.factory;

import com.demo.entity.User;

/**
 * @author yangqian
 * @date 2021/1/11
 */
public class UserFactory {

	public User getUser() {
		return new User();
	}

}
