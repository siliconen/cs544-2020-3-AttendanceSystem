package attendance.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

	@After("execution(* attendance.demo.controller.*.*(..))")
	public void printBefore(JoinPoint joinPoint) {
		System.out.println("Something logged");
	}
}
