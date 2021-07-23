package ru.my3tahk.spring.spring_introduction;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("persBean")
public class Person {

//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("person any pet set");
        this.pet = pet;
    }

    @Setter
    @Getter
    @Value("${surname}")
    private String surname;

    @Setter
    @Getter
    @Value("${age}")
    private int age;


//    @Autowired
//    public Person(@Qualifier("dog") Pet pet) {
//        System.out.println("Person is created");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }
//    public Person() {
//        System.out.println("Person is created");
//        this.pet = pet;
//    }

//    public void setPet(Pet pet) {
//        System.out.println("Class person pet set");
//        this.pet = pet;
//    }
    public void callyourPet(){
        System.out.println("Yo, Pet");
        pet.say();
    }
}


