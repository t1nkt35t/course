package ru.my3tahk.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.my3tahk.spring.spring_introduction.Dog;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
        System.out.println(myDog == yourDog);
        System.out.println(myDog);
        System.out.println(yourDog);
//        myDog.setName("belka");
//        yourDog.setName("strelka");
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
        context.close();
    }
}
