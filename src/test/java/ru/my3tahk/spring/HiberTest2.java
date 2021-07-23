package ru.my3tahk.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.my3tahk.spring.hibernate.entity.Employee;

import java.util.List;

public class HiberTest2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();

//            Employee emp = new Employee("Oleg", "Golovach", "HR", 700);
            session.beginTransaction();
            List<Employee> emps = session.createQuery("from Employee where name = 'Alex' AND salary>650")
                    .getResultList();
            for (Employee e : emps) {
                System.out.println(e);
            }
//            session.save(emp);
//            session.getTransaction().commit();

//            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();
//            System.out.println(employee);
            System.out.println("DONE");
        }
        finally {
            factory.close();
        }
    }
}
