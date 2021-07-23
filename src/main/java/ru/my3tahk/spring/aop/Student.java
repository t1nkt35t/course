package ru.my3tahk.spring.aop;

import lombok.Getter;
import lombok.Setter;

public class Student {
    @Getter
    @Setter
    private String nameSurname;
    @Getter
    @Setter
    private int course;
    @Getter
    @Setter
    private double avgGrade;

    public Student(String nameSurname, int course, double avgGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
