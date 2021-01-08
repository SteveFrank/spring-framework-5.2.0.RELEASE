package com.demo.service.impl;

import com.demo.service.WelcomeService;

/**
 * @author yangqian
 * @date 2020/12/31
 */
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String sayHello(String name) {
		return "welcome : " + name;
	}
}
