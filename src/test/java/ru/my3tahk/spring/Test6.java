package ru.my3tahk.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.my3tahk.spring.spring_introduction.MyConfig;
import ru.my3tahk.spring.spring_introduction.Person;
import ru.my3tahk.spring.spring_introduction.Pet;

public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();
        Person person = context.getBean("persBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
//        person.callyourPet();
        context.close();
    }


}
