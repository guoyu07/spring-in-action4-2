package spring.in.action.ch4.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public Performance performance() {
        return () -> {
            System.out.println("trala lala");
        };
    }

    @Bean
    public Performance performanceCrash() {
        return () -> {
            System.out.println("buum bumm");
            throw  new IllegalStateException("crash");
        };
    }

}