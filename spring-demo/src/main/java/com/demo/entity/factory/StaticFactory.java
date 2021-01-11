package com.demo.entity.factory;

import com.demo.entity.User;

/**
 * @author yangqian
 * @date 2021/1/11
 */
public class StaticFactory {

	// 静态方法，返回user对象
	public static User getUser() {
		return new User();
	}

}
