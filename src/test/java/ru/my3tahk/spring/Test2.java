package ru.my3tahk.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.my3tahk.spring.spring_introduction.Pet;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
