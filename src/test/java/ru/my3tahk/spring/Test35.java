package ru.my3tahk.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.my3tahk.spring.aop.MyConfig;
import ru.my3tahk.spring.aop.Student;
import ru.my3tahk.spring.aop.UniLibrary;
import ru.my3tahk.spring.aop.University;

import java.util.List;

public class Test35 {
    public static void main(String[] args) {
        System.out.println("main start");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("returning book: " + bookName);
        context.close();
        System.out.println("main end");
    }
}
