package ru.my3tahk.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.my3tahk.spring.spring_introduction.Cat;
import ru.my3tahk.spring.spring_introduction.Dog;
import ru.my3tahk.spring.spring_introduction.Person;
import ru.my3tahk.spring.spring_introduction.Pet;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callyourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
