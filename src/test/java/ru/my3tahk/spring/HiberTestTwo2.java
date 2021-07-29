package ru.my3tahk.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.my3tahk.spring.hibernate2.entity.Detail;
import ru.my3tahk.spring.hibernate2.entity.Employee;

public class HiberTestTwo2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {

//            session = factory.getCurrentSession();
//            Employee employee = new Employee("ROFL", "Ivanov", "HR", 900);
//            Detail detail = new Detail("NY", "5555555", "roflik@lol.kek");
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//            session.save(detail);
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Detail detail = session.get(Detail.class, 3);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();

            System.out.println("DONE");
        } finally {
            session.close();
            factory.close();
        }
    }
}
