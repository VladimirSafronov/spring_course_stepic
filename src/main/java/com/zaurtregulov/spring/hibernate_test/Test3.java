package com.zaurtregulov.spring.hibernate_test;

import com.zaurtregulov.spring.hibernate_test.entity.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {

  public static void main(String[] args) {

    try (SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .buildSessionFactory()) {

      Session session = factory.getCurrentSession();
      session.beginTransaction();

      List<Employee> emps = session.createQuery("FROM Employee WHERE department = 'sales'" +
          "AND salary > 500").getResultList();
      for(Employee e : emps) {
        System.out.println(e);
      }

      session.getTransaction().commit();
      System.out.println("Done!");
    }
  }
}
