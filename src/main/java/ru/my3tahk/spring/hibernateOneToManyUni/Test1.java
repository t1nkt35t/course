package ru.my3tahk.spring.hibernateOneToManyUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.my3tahk.spring.hibernateOneToManyUni.entity.Department;
import ru.my3tahk.spring.hibernateOneToManyUni.entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {

//            session = factory.getCurrentSession();
//            Department department = new Department("HR", 500, 1500);
//            Employee employee1 = new Employee("Oleg", "Petrov", 800);
//            Employee employee2 = new Employee("Dron", "Trigonometron", 1000);
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
//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//            session.getTransaction().commit();
//
//            System.out.println("DONE");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 6);
//            System.out.println(employee);
//            session.getTransaction().commit();
//
//            System.out.println("DONE");

            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department = session.get(Department.class, 3);
            session.delete(department);
            session.getTransaction().commit();

            System.out.println("DONE");
        } finally {
            session.close();
            factory.close();
        }
    }
}
