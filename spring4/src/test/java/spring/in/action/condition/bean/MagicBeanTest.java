package spring.in.action.condition.bean;

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
@ContextConfiguration(classes = ConfigurationCondition.class)
public class MagicBeanTest {

    @Autowired
    private MagicBean magicBean;

    @Test
    public void magicBeanShouldBeNotNull() {
        Assert.assertNotNull(magicBean);
    }
}
