package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы получили книгу из UniLibrary");
        System.out.println("------------------------------------");
    }

    public void returnBook() {
        System.out.println("Мы вернули книгу в UniLibrary");
        System.out.println("------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Мы получили журнал из UniLibrary");
        System.out.println("------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы вернули журнал в UniLibrary");
        System.out.println("------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавили книгу в UniLibrary");
        System.out.println("------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавили журнал в UniLibrary");
        System.out.println("------------------------------------");
    }
}
