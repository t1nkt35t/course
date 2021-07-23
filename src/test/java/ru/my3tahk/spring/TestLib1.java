package ru.my3tahk.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.my3tahk.spring.aop.Book;
import ru.my3tahk.spring.aop.MyConfig;
import ru.my3tahk.spring.aop.SchoolLibrary;
import ru.my3tahk.spring.aop.UniLibrary;

public class TestLib1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
//        SchoolLibrary library2 = context.getBean("schoolLibrary", SchoolLibrary.class);
        library.getBook();
//        library.returnBook();
//        library.returnMagazine();
        library.addBook("i", book);
        library.addMagazine();
//        library2.getBook();
        context.close();
    }
}
