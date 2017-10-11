package spring.in.action.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import spring.in.action.soundsystem.BlankDisc;

/**
 * Created by private on 09.10.17.
 */
@Configuration
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    private Environment env;

    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    @Bean
    public BlankDisc disc() {
        return new BlankDisc(
                env.getProperty("disc.title"),
                env.getProperty("disc.artist"));
    }

    @Bean
    public BlankDisc disc2 (
            @Value("#{systemProperties['disc.title']}") String title,
            @Value("#{systemProperties['disc.artist']}") String artist) {
        return new BlankDisc(title, artist);
    }


}
