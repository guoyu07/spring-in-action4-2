package spring.in.action.addressing.ambiguity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Cold
@Creamy
@Fruity
public class IceCream implements Dessert { }