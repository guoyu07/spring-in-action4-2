package spring.in.action.ch4.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig2 {
    @Bean
    public AudienceAroundAspect audience() {
        return new AudienceAroundAspect();
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