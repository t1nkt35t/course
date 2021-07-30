package ru.my3tahk.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.my3tahk.spring.hibernateOneToOne.entity.Detail;
import ru.my3tahk.spring.hibernateOneToOne.entity.Employee;

public class HiberTestTwo1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Jora", "Ivanov", "SALES", 1000);
            Detail detail = new Detail("GOL", "7654321", "jorik@lol.kek");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//
//            System.out.println("DONE");
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emo = session.get(Employee.class, 1);
            session.delete(emo);
//            Detail det = emo.getEmpDetail();
//            det.setPhoneNumber("6666666");
//            session.save(emo);
//            System.out.println(emo.getEmpDetail());
            session.getTransaction().commit();

            System.out.println("DONE");
        } finally {
            session.close();
            factory.close();
        }
    }
}
