package ru.my3tahk.spring.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:props.properties")
//@ComponentScan("ru.my3tahk.spring.spring_introduction")
public class MyConfig {
    @Bean
    @Scope("prototype")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person persBean(){
        return new Person(catBean());
    }
}
