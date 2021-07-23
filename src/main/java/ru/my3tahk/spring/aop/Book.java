package ru.my3tahk.spring.aop;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("BOOKNAME")
    @Getter
    private String name;

    @Value("AUTHOR")
    @Getter
    private String author;

    @Value("1982")
    @Getter
    private String year;
}

