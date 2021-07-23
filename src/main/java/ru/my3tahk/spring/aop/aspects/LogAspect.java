package ru.my3tahk.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MemberSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.my3tahk.spring.aop.Book;

@Component
@Aspect
@Order(1)
public class LogAspect {

//    @Pointcut("execution(* ru.my3tahk.spring.aop.UniLibrary.*(..))")
//    private void allUni() {
//
//    }
//
//    @Pointcut("execution(public void ru.my3tahk.spring.aop.UniLibrary.returnMagazine())")
//    private void exceptRetMag() {
//
//    }
//
//    @Pointcut("allUni() && !exceptRetMag()")
//    private void allExceptRetMag() {
//
//    }
//
//    @Before("allExceptRetMag()")
//    public void beforeAllExcRetMgAdvice(){
//        System.out.println("excep returm magazine : log 10");
//    }



    @Before("ru.my3tahk.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLogAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("method = " + methodSignature.getMethod());
        System.out.println("method return type = " + methodSignature.getReturnType());
        System.out.println("method name = " + methodSignature.getName());


        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Book info: name: " + myBook.getName() +
                                        ", author: " + myBook.getAuthor() +
                                        ", year: " + myBook.getYear());
                }
                else if (obj instanceof String){
                    System.out.println("book adding by " + obj);
                }
            }
        }
        System.out.println("beforeAddBookAdvice: trying to add smth");
        System.out.println("------------------------------------------------");
    }

    @Before("execution(* return*())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: trying to return smth");
        System.out.println("------------------------------------------------");
    }
}
