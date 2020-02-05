package attendance.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;



public class Aspect {

    @Before("execution(* *..*.add*(..))")
    public void printBefore(JoinPoint joinPoint){

    }

    @After("execution(* *..*.*(..))")
    public void printAfter(JoinPoint joinPoint){
        Object[] group  = joinPoint.getArgs();
        String name = (String)group[0];
        String className= joinPoint.getClass().getName();
        System.out.println(name+ " has just added as "+className);


    }
    @After("execution(* *..*.*(..))")
    public void afterLogin(JoinPoint joinPoint){
        Object[] group  = joinPoint.getArgs();
        String name = (String)group[0];
        String className= joinPoint.getClass().getName();
        System.out.println(name+ " has just added as "+className);


    }
}
