package ru.my3tahk.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLogicAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLogAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("trying to return book");
        Object targetMethodResut = null;
        try {
            targetMethodResut = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("catched e "+ e);
            throw e;
        }
        System.out.println("book succesfully returned");
        return targetMethodResut;
    }
}
