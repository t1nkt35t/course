package ru.my3tahk.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.my3tahk.spring.spring_introduction.Dog;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();
//        Dog yourDog = context.getBean("dog", Dog.class);
//        System.out.println(myDog==yourDog);
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();
    }
}
