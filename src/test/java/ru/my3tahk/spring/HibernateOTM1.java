package ru.my3tahk.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.my3tahk.spring.hibernateOneToManyBi.entity.Department;
import ru.my3tahk.spring.hibernateOneToManyBi.entity.Employee;

public class HibernateOTM1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {

//            session = factory.getCurrentSession();
//            Department department = new Department("IT", 300, 1200);
//            Employee employee1 = new Employee("Jora", "Ivanov", 1000);
//            Employee employee2 = new Employee("Lola", "Kekova", 800);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//
//            System.out.println("DONE");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//
//            System.out.println("DONE");

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 3);
            session.delete(employee);
            session.getTransaction().commit();

            System.out.println("DONE");
        } finally {
            session.close();
            factory.close();
        }
    }
}
