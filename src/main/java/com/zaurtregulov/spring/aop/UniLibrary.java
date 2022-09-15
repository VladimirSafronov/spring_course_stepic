package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Мы получили книгу из UniLibrary");
    }

    public void returnBook() {
        System.out.println("Мы вернули книгу");
    }

    public void getMagazine() {
        System.out.println("Мы получили журнал из UniLibrary");
    }
}
