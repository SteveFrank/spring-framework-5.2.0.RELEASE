package com.spring.dc.demo.test.hm.demo.chain;

/**
 * @author frankq
 * @date 2021/11/16
 */
public interface MethodInterceptor {

	Object invoke(MethodInvocation mi) throws Throwable;

}
