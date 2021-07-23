package ru.my3tahk.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.my3tahk.spring.aop")
@EnableAspectJAutoProxy
@PropertySource("classpath:props.properties")
public class MyConfig {
}
