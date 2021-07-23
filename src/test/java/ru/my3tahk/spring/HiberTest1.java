package ru.my3tahk.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.my3tahk.spring.hibernate.entity.Employee;

public class HiberTest1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();

            Employee emp = new Employee("Alex", "Ivanov", "IT", 800);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println("DONE");
            System.out.println(emp);
        }
        finally {
            factory.close();
        }
    }
}
