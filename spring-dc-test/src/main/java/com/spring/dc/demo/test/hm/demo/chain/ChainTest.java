package com.spring.dc.demo.test.hm.demo.chain;

import com.spring.dc.demo.test.hm.demo.chain.impl.AspectJAfterAdvice;
import com.spring.dc.demo.test.hm.demo.chain.impl.BeforeMethodInterceptor;
import com.spring.dc.demo.test.hm.demo.chain.impl.ReflectiveMethodInvocation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author frankq
 * @date 2021/11/16
 */
public class ChainTest {

	public static void main(String[] args) throws Throwable {
		// 执行器链
		List<MethodInterceptor> lists = new ArrayList<>();
		// 后置增强
		AspectJAfterAdvice aspectJAfterAdvice = new AspectJAfterAdvice();
		// 前置增强
		BeforeMethodInterceptor beforeMethodInterceptor = new BeforeMethodInterceptor();
		lists.add(beforeMethodInterceptor);
		lists.add(aspectJAfterAdvice);

		ReflectiveMethodInvocation reflectiveMethodInvocation = new ReflectiveMethodInvocation(lists);

		reflectiveMethodInvocation.proceed();
	}

}
