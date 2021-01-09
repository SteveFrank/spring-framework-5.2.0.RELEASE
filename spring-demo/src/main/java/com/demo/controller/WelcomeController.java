package com.demo.controller;

import com.demo.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author yangqian
 * @date 2021/1/9
 */
@Controller
public class WelcomeController {
	@Autowired
	private WelcomeService welcomeService;
	public void handleRequest() {
		welcomeService.sayHello("From Controller Say Hello .");
	}
}
