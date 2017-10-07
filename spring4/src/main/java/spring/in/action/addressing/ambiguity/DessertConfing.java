package spring.in.action.addressing.ambiguity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by private on 07.10.17.
 */
@Configuration
@ComponentScan(basePackages = "spring.in.action.addressing.ambiguity")
public class DessertConfing {

    @Bean
    public DessertClient dessertClient() {
        return new DessertClient();
    }
}
