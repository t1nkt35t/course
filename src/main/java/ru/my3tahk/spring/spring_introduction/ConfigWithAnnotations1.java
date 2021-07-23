package ru.my3tahk.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("persBean", Person.class);
        person.callyourPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();
        context.close();
    }
}
