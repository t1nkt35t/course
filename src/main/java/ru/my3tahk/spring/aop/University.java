package ru.my3tahk.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Ivan Gavrilenko", 4, 8.7);
        Student st2 = new Student("Shania Twain", 4, 8.0);
        Student st3 = new Student("Mister Twister", 4, 6.9);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("getstudent start");
//        System.out.println(students.get(3));
        System.out.println("getStudents info: ");
        System.out.println(students);
        return students;
    }
}
