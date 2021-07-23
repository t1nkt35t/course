package ru.my3tahk.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.my3tahk.spring.hibernate.entity.Employee;

import java.util.List;

public class HiberTest3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("update Employee set salary=5000 where name='Alex'").executeUpdate();
//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(20000);
            session.getTransaction().commit();
            System.out.println("DONE");
        }
        finally {
            factory.close();
        }
    }
}
