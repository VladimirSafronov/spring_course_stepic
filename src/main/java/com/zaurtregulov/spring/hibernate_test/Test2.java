package com.zaurtregulov.spring.hibernate_test;

import com.zaurtregulov.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
  public static void main(String[] args) {

    try (SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .buildSessionFactory()) {

      Session session = factory.getCurrentSession(); // открытие транзакции
      Employee emp = new Employee("Elena", "Bukina", "dussh", 100);
      session.beginTransaction();
      session.save(emp);
      session.getTransaction().commit(); // закрытие транзакции

      int myId = emp.getId();
      session = factory.getCurrentSession();
      session.beginTransaction();
      Employee employee = session.get(Employee.class, myId); // получение объекта из базы данных
      session.getTransaction().commit();

      System.out.println(employee);
      System.out.println("Done!");
    }
  }
}
