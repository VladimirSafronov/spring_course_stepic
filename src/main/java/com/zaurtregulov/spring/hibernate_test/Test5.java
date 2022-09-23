package com.zaurtregulov.spring.hibernate_test;

import com.zaurtregulov.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {

  public static void main(String[] args) {
    try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class).buildSessionFactory()) {

      Session session = factory.getCurrentSession();
      session.beginTransaction();

//      Employee emp = session.get(Employee.class, 8);
//      session.delete(emp);
      session.createQuery("DELETE Employee WHERE department = 'sales'").executeUpdate();

      session.getTransaction().commit();
      System.out.println("Done!");
    }
  }
}
