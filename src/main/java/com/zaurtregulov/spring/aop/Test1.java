package com.zaurtregulov.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Book book = context.getBean("book", Book.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

        uniLibrary.getBook(book);
//        uniLibrary.returnBook();
        uniLibrary.getMagazine();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
