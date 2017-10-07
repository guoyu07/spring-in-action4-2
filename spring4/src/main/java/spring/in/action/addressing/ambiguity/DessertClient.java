package spring.in.action.addressing.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.security.krb5.internal.crypto.Des;

/**
 * Created by private on 07.10.17.
 */
@Component
public class DessertClient {
    @Autowired
    private Dessert dessert;

    public Dessert getDessert() {
        return dessert;
    }
}
