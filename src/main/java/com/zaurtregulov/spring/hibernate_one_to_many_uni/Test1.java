package com.zaurtregulov.spring.hibernate_one_to_many_uni;

import com.zaurtregulov.spring.hibernate_one_to_many_uni.entity.Department;
import com.zaurtregulov.spring.hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Department.class)
        .addAnnotatedClass(Employee.class)
        .buildSessionFactory();

    Session session = null;

    try {
      session = factory.getCurrentSession();
      session.beginTransaction();

      // запись значений в БД
//      Department dep = new Department("HR", 500, 1500);
//      Employee emp1 = new Employee("Andrey", "Kozlov", 800);
//      Employee emp2 = new Employee("Anna", "Sidorova", 1000);
//      dep.addEmployeeToDepartment(emp1);
//      dep.addEmployeeToDepartment(emp2);
//      session.save(dep);

      // получение значений из БД
//      Department department = session.get(Department.class, 2);
//      System.out.println(department);
//      System.out.println(department.getEmps());

      // удаление значений из БД
      Department dep = session.get(Department.class, 2);
      session.delete(dep);

      session.getTransaction().commit();
      System.out.println("Done!");
    }
    finally {
      session.close();
      factory.close();
    }
  }

}
