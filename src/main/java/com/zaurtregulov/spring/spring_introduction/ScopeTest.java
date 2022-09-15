package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Dog myDog = context.getBean("dog", Dog.class);
//        myDog.say();

        Cat cat = context.getBean("catBean", Cat.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
//        person.callYourPet();
//
//        Person person2 = context.getBean("personBean", Person.class);
//        person2.callYourPet();

        context.close();
    }
}
