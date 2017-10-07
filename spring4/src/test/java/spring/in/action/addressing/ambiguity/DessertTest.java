package spring.in.action.addressing.ambiguity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by private on 07.10.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfing.class)
public class DessertTest {
    @Autowired
    private DessertClient dessertClient;

    @Autowired
    @Fruity
    @Cold
    private Dessert fruityColdDesert;

    @Test
    public void dessertClientNotNull() {
        Assert.assertNotNull(dessertClient);
        Assert.assertTrue(dessertClient.getDessert() instanceof  IceCream);
    }

    @Test
    public void fruityColdDesertNotNull() {
        Assert.assertNotNull(fruityColdDesert);
    }
}
