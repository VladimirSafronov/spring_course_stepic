package com.zaurtregulov.spring.hibernate_many_to_many;

import com.zaurtregulov.spring.hibernate_many_to_many.entity.Child;
import com.zaurtregulov.spring.hibernate_many_to_many.entity.Section;
import javax.persistence.Column;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

  public static void main(String[] args) {

    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Child.class)
        .addAnnotatedClass(Section.class)
        .buildSessionFactory();

    Session session = null;

    try {
      session = factory.getCurrentSession();
      session.beginTransaction();

//      Section section1 = new Section("Football");
//      Child child1 = new Child("Misha", 6);
//      Child child2 = new Child("Katia", 8);
//      Child child3 = new Child("Natasha", 7);
//      section1.addChildToSection(child1);
//      section1.addChildToSection(child2);
//      section1.addChildToSection(child3);
//
//      session.save(section1);
      //****************
//      Child child = new Child("Makar", 10);
//      Section section1 = new Section("Chess");
//      Section section2 = new Section("Math");
//      Section section3 = new Section("Volleyball");
//      child.addSectionToChild(section1);
//      child.addSectionToChild(section3);
//      child.addSectionToChild(section2);
//
//      session.save(child);
//      ****************
//      session.beginTransaction();
//      Section section = session.get(Section.class, 1);
//      System.out.println(section);
//      System.out.println(section.getChildren());
//      ****************
//      Child child = session.get(Child.class, 4);
//      System.out.println(child);
//      System.out.println(child.getSections());
//      ****************
//      Section section = session.get(Section.class, 1);
//      session.delete(section);
//      ****************
//      Section section1 = new Section("Dance");
//      Child child1 = new Child("Misha", 6);
//      Child child2 = new Child("Katia", 8);
//      Child child3 = new Child("Natasha", 7);
//      section1.addChildToSection(child1);
//      section1.addChildToSection(child2);
//      section1.addChildToSection(child3);
//      session.persist(section1);
//      ****************
//      Section section = session.get(Section.class, 5);
//      session.delete(section);
//      ****************
      Child child = session.get(Child.class, 4);
      session.delete(child);

      session.getTransaction().commit();
      System.out.println("Done!");
    } finally {
      session.close();
      factory.close();
    }
  }
}
