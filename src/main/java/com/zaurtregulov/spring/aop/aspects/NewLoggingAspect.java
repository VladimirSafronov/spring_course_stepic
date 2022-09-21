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

    Object resultTargetMethod = null;
    try {
      resultTargetMethod = proceedingJoinPoint.proceed();
    } catch (Exception e) {
      System.out.println("aroundReturnBookAdvice: залогировано исключение " + e);
      throw e;
    }


    System.out.println("aroundReturnBookAdvice: в библиотеку успешно вернули книгу");
    return resultTargetMethod;
  }
}
