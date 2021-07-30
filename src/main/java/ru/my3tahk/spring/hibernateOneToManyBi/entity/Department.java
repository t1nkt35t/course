package ru.my3tahk.spring.hibernateOneToManyBi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "departments")
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String departmentName;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSal;

    @OneToMany (cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE}, mappedBy = "department")
    @Getter
    @Setter
    private List<Employee> emps;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSal=" + minSal +
                '}';
    }

    public Department(String departmentName, int maxSalary, int minSal) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSal = minSal;
    }

    public void addEmployeeToDepartment(Employee employee){
        if(emps == null){
            emps = new ArrayList<>();
        }
        emps.add(employee);
        employee.setDepartment(this);
    }
}
