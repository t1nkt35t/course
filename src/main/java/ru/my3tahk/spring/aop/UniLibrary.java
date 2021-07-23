package ru.my3tahk.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("we take book from UniLibrary ");
        System.out.println("------------------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("we return book to uni");
        return "War&Peace";
    }

    public void addBook(String personName, Book book) {
        System.out.println("we add book to uni");
        System.out.println("------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("we take magazine");
        System.out.println("------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("we return magazine");
        System.out.println("------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("we add magazine");
        System.out.println("------------------------------------------------");
    }
}
