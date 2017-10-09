import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.in.action.property.ExpressiveConfig;
import spring.in.action.soundsystem.BlankDisc;

/**
 * Created by private on 09.10.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class ExpressiveConfigTest {

    @Autowired
    private BlankDisc disc;

    @Test
    public void testBlankDisc() {
        Assert.assertNotNull(disc);
        Assert.assertEquals("Sgt. Peppers Lonely Hearts Club Band", disc.getTitle());
    }

}
