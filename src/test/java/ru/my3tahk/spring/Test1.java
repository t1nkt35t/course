package ru.my3tahk.spring;

import ru.my3tahk.spring.spring_introduction.Cat;
import ru.my3tahk.spring.spring_introduction.Dog;
import ru.my3tahk.spring.spring_introduction.Pet;

public class Test1 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.say();
    }
}
