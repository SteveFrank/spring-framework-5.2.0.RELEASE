package com.demo.service.impl;

import com.demo.service.WelcomeService;
import org.springframework.stereotype.Service;

/**
 * @author yangqian
 * @date 2020/12/31
 */
@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		return "welcome : " + name;
	}
}
