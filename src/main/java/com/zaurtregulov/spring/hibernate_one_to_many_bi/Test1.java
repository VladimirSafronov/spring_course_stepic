package com.zaurtregulov.spring.hibernate_one_to_many_bi;

import com.zaurtregulov.spring.hibernate_one_to_many_bi.entity.Department;
import com.zaurtregulov.spring.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

  public static void main(String[] args) {

    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .addAnnotatedClass(Department.class)
        .buildSessionFactory();

    Session session = null;

    try {
      session = factory.getCurrentSession();
      session.beginTransaction();

      // запись значений в БД
      Department dep = new Department("sales", 800, 1500);
      Employee emp1 = new Employee("Zaur", "Tregulov", 800);
      Employee emp2 = new Employee("Elena", "Popova", 1000);
      Employee emp3 = new Employee("Ivan", "Sysanin", 1500);
      dep.addEmployeeToDepartment(emp1);
      dep.addEmployeeToDepartment(emp2);
      dep.addEmployeeToDepartment(emp3);
      session.save(dep);

      // получение значений из БД
//      Department department = session.get(Department.class, 1);
//      System.out.println(department);
//      System.out.println(department.getEmps());
//      Employee employee = session.get(Employee.class, 1);
//      System.out.println(employee);
//      System.out.println(employee.getDepartment());

      // удаление значений из БД (Учитывай каскадные данные!)
//      Employee employee = session.get(Employee.class, 2);
//      session.delete(employee);

      session.getTransaction().commit();
      System.out.println("Done!");
    }
    finally {
      session.close();
      factory.close();
    }
  }

}
