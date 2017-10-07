package spring.in.action.addressing.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by private on 07.10.17.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DessertClient {
    @Autowired
    private Dessert dessert;

    public Dessert getDessert() {
        return dessert;
    }
}
