package ru.my3tahk.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.my3tahk.spring.aop.MyConfig;
import ru.my3tahk.spring.aop.Student;
import ru.my3tahk.spring.aop.University;

import java.util.List;

public class UniTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        try{
            List<Student> students = university.getStudents();
            System.out.println(students);}
        catch (Exception e){
            System.out.println("catched " + e);
        }
        context.close();
    }
}
