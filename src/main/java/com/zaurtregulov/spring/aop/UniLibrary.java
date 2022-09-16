package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы получили книгу из UniLibrary");
    }

    public void returnBook() {
        System.out.println("Мы вернули книгу в UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы получили журнал из UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Мы вернули журнал в UniLibrary");
    }

    public void addBook() {
        System.out.println("Мы добавили книгу в UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Мы добавили журнал в UniLibrary");
    }
}
