package com.zaurtregulov.spring.hibernate_one_to_one;


import com.zaurtregulov.spring.hibernate_one_to_one.entity.Detail;
import com.zaurtregulov.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

  public static void main(String[] args) {

    try (SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .addAnnotatedClass(Detail.class)
        .buildSessionFactory();
        Session session = factory.getCurrentSession()) {

//      Employee employee = new Employee("Oleg", "Smirnov", "sales", 700);
//      Detail detail = new Detail("Moscow", "4321", "olegs@mail.ru");

      session.beginTransaction();

      Employee emp = session.get(Employee.class, 2);
      session.delete(emp);

      session.getTransaction().commit(); // закрытие транзакции
      System.out.println("Done!");
    }
  }
}
