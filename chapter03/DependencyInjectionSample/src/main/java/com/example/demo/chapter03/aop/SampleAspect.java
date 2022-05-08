/**
 * Practice on AOP programming.
 */


package com.example.demo.chapter03.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {
//	@Before("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
//	public void beforeAdvice(JoinPoint joinPoint) {
//		// For simple display
//		System.out.println("===== Before Advice =====");
//		// Show the date
//		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.
//	Date()));
//		// Show the method
//		System.out.println(String.format("メソッド:%s", joinPoint.getSignature().
//	getName()));
//	}
	
//	@After("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
//	public void afterAdvice(JoinPoint joinPoint) {
//		// For simple display
//		System.out.println("===== After Advice =====");
//		// Show the date
//		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.
//	Date()));
//		// Show the method
//		System.out.println(String.format("メソッド名:%s", joinPoint.getSignature().
//	getName()));
//	}
	
	@Around("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		// For simple display
		System.out.println("===== Around Advice =====");
		System.out.println("↓↓↓ 処理前 ↓↓↓");
		// Proceed the specific method of the specific class
		Object result = joinPoint.proceed();
		System.out.println("↑↑↑ 処理後 ↑↑↑");
		// Return the value of the object type if the return value is required.
		return result;
	}
}
