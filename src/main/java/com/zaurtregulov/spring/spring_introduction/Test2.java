package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml"); //create Spring Container

        Pet pet = context.getBean("myPet", Pet.class); //get bean
        pet.say();

        context.close();

    }
}
