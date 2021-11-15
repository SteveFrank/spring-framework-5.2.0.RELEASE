package com.spring.dc.demo.test.hm.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	public void findAll(){
		System.out.println("findAll...");
	}

}
