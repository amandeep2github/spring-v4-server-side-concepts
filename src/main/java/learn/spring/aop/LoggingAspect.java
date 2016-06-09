package learn.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	@Before("execution(* register(..))")
	public void beforeMethod(JoinPoint joinPoint){
		System.out.println(String.format("%s",joinPoint.getTarget().getClass()));
		System.out.println(String.format("%s",joinPoint.getArgs()[0]));
		
	}
}
