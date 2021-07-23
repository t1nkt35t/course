package ru.my3tahk.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.my3tahk.spring.spring_introduction.Dog;

public class test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();
    }
}
