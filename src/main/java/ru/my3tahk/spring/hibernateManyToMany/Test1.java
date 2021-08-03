package ru.my3tahk.spring.hibernateManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.my3tahk.spring.hibernateManyToMany.entity.Child;
import ru.my3tahk.spring.hibernateManyToMany.entity.Section;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Lol", 10);
//            Child child2 = new Child("Rofl", 12);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
            //**********************************************************

//            session.beginTransaction();
//            Section section = session.get(Section.class,1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//
//            session.getTransaction().commit();

            //**********************************************************
//            session.beginTransaction();
//            Child child = session.get(Child.class,4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//
//            session.getTransaction().commit();

            //**********************************************************
//            session.beginTransaction();
//            Section section = session.get(Section.class,9);
//            session.delete(section);
//            session.getTransaction().commit();

            //**********************************************************

             session.beginTransaction();
            Child child = session.get(Child.class,1);
            session.delete(child);
            session.getTransaction().commit();

            //**********************************************************

            System.out.println("Done");

        } finally {
            session.close();
            factory.close();
        }
    }
}
