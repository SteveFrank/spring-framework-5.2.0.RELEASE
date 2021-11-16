package com.spring.dc.demo.test.hm.demo.chain.impl;

import com.spring.dc.demo.test.hm.demo.chain.MethodInterceptor;
import com.spring.dc.demo.test.hm.demo.chain.MethodInvocation;

/**
 * @author frankq
 * @date 2021/11/16
 */
public class AspectJAfterAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object var = null;
		try{
			var = mi.proceed();
		} finally {
			System.out.println("后置方法....");
		}
		return var;
	}
}
