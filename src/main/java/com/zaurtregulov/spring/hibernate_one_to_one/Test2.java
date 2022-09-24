package com.zaurtregulov.spring.hibernate_one_to_one;

import com.zaurtregulov.spring.hibernate_one_to_one.entity.Detail;
import com.zaurtregulov.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

  public static void main(String[] args) {

    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .addAnnotatedClass(Detail.class)
        .buildSessionFactory();

    Session session = null; // специально написал не через try-with-resources

    try {
      session = factory.getCurrentSession();
//      Employee employee = new Employee("Nikolay", "Kylakov", "hr", 850);
//      Detail detail = new Detail("New-York", "43233561", "mikola@mail.ru");

      session.beginTransaction();

      Detail detail = session.get(Detail.class, 5);
      detail.getEmployee().setEmpDetail(null);
      session.delete(detail);

      session.getTransaction().commit();
      System.out.println("Done!");
    }
    finally {
      session.close();
      factory.close();
    }
  }

}
