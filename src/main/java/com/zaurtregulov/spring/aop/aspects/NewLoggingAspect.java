package com.zaurtregulov.spring.aop.aspects;

import java.util.Date;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

  @Around("execution(public String returnBook())")
  public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("aroundReturnBookAdvice: в библиотеку пытаются вернуть книгу");

    long begin = System.currentTimeMillis();
    Object resultTargetMethod = proceedingJoinPoint.proceed();
    long finish = System.currentTimeMillis();
    System.out.println("Время работы метода " + (finish-begin) + "мс");

    System.out.println("aroundReturnBookAdvice: в библиотеку успешно вернули книгу");
    return resultTargetMethod;
  }
}
