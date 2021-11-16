package com.spring.dc.demo.test.hm.demo.chain.impl;

import com.spring.dc.demo.test.hm.demo.chain.MethodInterceptor;
import com.spring.dc.demo.test.hm.demo.chain.MethodInvocation;

import java.util.List;

/**
 * @author frankq
 * @date 2021/11/16
 */
public class ReflectiveMethodInvocation implements MethodInvocation {

	List<MethodInterceptor> methodInterceptors;

	public ReflectiveMethodInvocation(List<MethodInterceptor> methodInterceptors) {
		this.methodInterceptors = methodInterceptors;
	}

	private int index = -1;

	@Override
	public Object proceed() throws Throwable {
		Object var = null;
		if (index == this.methodInterceptors.size() - 1) {
			System.out.println("调用被代理的原本方法");
		} else {
			methodInterceptors.get(++index).invoke(this);
		}
		return var;
	}
}
