package ru.my3tahk.spring.spring_introduction;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet{
//    @Getter
//    @Setter
//    private String name;
    public Dog() {
        System.out.println("Dog bean created");
    }
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("dog destroy");
    }
}
