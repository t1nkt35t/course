package ru.my3tahk.spring.hibernateOneToManyBi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@NoArgsConstructor
public class Employee {
    @Setter
    @Getter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Setter
    @Getter
    @Column(name = "name")
    private String name;
    @Setter
    @Getter
    @Column(name = "surName")
    private String surName;
    @Setter
    @Getter
    @Column(name = "salary")
    private int salary;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name = "department_id")
    @Setter
    @Getter
    private Department department;

    public Employee(String name, String surName, int salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }

}
