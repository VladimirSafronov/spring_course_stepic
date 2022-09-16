package com.zaurtregulov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("com.zaurtregulov.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение издания");
        System.out.println("------------------------------------");
    }
}
