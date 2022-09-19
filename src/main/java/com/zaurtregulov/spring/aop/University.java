package com.zaurtregulov.spring.aop;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Ivan Ivanov", 2, 7.5);
        Student st2 = new Student("Petr Petrov", 4, 8.3);
        Student st3 = new Student("Sergey Sorokin", 1, 9.1);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method students:");
        System.out.println(students);
        return students;
    }
}