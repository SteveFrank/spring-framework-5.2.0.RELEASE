package com.spring.dc.demo.test.hm.demo.chain.impl;

import com.spring.dc.demo.test.hm.demo.chain.MethodInterceptor;
import com.spring.dc.demo.test.hm.demo.chain.MethodInvocation;

/**
 * @author frankq
 * @date 2021/11/16
 */
public class BeforeMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("前置方法");
		return mi.proceed();
	}
}
