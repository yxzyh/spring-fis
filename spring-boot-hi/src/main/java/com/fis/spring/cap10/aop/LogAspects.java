package com.fis.spring.cap10.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/**
 * 日志切面类的方法需要动态感知div()方法运行，
 * 通知方法：
 * 		前置通知： logStart();在我们执行div（）之前@Before
 * 		后置通知： logEnd（）；在我们目标方法运行结束后，不管有没有异常。@After
 * 		返回通知： logReturn（）；在我们目标方法正常运行返回值后运行@AfterReturning
 * 		异常通知： logException（）；在我们目标方法异常运行返回值后运行。@AfterThrowing
 *   	环绕通知： 动态代理，需要手动执行joinPoint.procced(); @Around,执行之前div之前，
 *   相当于前置通知，执行后相对于后置通知。
 * @author DELL
 *
 */
@Aspect
public class LogAspects {
	
	@Pointcut("execution(public int com.fis.spring.cap10.aop.Calculator.*(..))")
	public void pointCut() {
		
	}

	@Before("pointCut()")
	public void logStart() {
		System.out.println("除法运行前：{}");
	}
	
	@After("pointCut()")
	public void logEnd() {
		System.out.println("除法运行结束：{}");
	}
	
	@AfterReturning("pointCut()")
	public void logReturn() {
		System.out.println("除法运行正常返回，运行结果是：{}");
	}
	
	@AfterThrowing("pointCut()")
	public void logException() {
		System.out.println("除法运行异常，异常：{}");
	}
	
	@Around("pointCut()")
	public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("@Around执行目标方法之前");
		Object proceed = proceedingJoinPoint.proceed();
		System.out.println("@Around执行目标方法之后");
		return proceed;
	}
	
}
