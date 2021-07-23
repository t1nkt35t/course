package ru.my3tahk.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.my3tahk.spring.hibernate.entity.Employee;

public class HiberTest4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("delete Employee where name='Alex'").executeUpdate();
            session.getTransaction().commit();
            System.out.println("DONE");
        }
        finally {
            factory.close();
        }
    }
}
