package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Мы получили книгу из SchoolLibrary");
    }
}
