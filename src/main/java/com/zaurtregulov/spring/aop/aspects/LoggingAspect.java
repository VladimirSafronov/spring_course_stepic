package com.zaurtregulov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*(com.zaurtregulov.spring.aop.Book))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить издание");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка вернуть издание");
    }
}
