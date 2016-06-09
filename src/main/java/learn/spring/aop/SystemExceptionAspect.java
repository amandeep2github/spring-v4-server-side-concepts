package learn.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SystemExceptionAspect {
	
	@AfterThrowing(value="execution(* register(..))", throwing="ex")
	public void logException(JoinPoint joinPoint, Throwable ex){
		System.out.println(String.format("***** stacktrace - %s", ex.toString()));
		
	}
}
