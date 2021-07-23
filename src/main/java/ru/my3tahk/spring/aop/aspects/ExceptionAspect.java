package ru.my3tahk.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionAspect {
    @Before("ru.my3tahk.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionAdvice() {
        System.out.println("beforeGetExceptionAdvice: catch exception on getting smth");
        System.out.println("------------------------------------------------");
    }
}
