package com.spring.dc.demo.test.hm.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author frankq
 * @date 2021/11/15
 */
@Component
@Aspect
public class AopAspect {

	@Pointcut("execution(* com.spring.dc.demo.test.hm.demo.service..*.*(..))")
	public void pointcut() {
	}

	@Before("pointcut()")
	public void before() {
		System.out.println("before");
	}

	@After("pointcut()")
	public void after() {
		System.out.println("after");
	}

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws InterruptedException {
		System.out.println("around advice start");
		try {
			Object result = proceedingJoinPoint.proceed();
			System.out.println("around advice end");
			return result;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return null;
		}
	}

}
