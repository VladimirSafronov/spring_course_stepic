package com.zaurtregulov.spring.hibernate_test_2;

import com.zaurtregulov.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

  public static void main(String[] args) {

    try (SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .buildSessionFactory()) {

      Session session = factory.getCurrentSession(); // открытие транзакции
      Employee emp = new Employee("Vasiliy", "Terkin", "sales", 400);
      session.beginTransaction();
      session.save(emp);
      session.getTransaction().commit(); // закрытие транзакции

      System.out.println("Done!");
    }
  }
}
