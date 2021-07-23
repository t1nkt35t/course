package ru.my3tahk.spring.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.my3tahk.spring.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLogAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLogAdvice() {
//        System.out.println("beforeGetStudentsLogAdvice: ");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturnGetStudentsLogAdvice(List<Student> students) {
//        Student first = students.get(0);
//        String nameSurname = first.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        first.setNameSurname(nameSurname);
//        Double avgGrade = first.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        first.setAvgGrade(avgGrade);
//        Sy
//        stem.out.println("afterReturnGetStudentsLogAdvice: ");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowStudentLogAdvice(Throwable exception) {
//
//        System.out.println("afterThrowStudentLogAdvice" + exception);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLogAdvice(){
        System.out.println("afterGetStudentsLogAdvice anyway");
    }
}
