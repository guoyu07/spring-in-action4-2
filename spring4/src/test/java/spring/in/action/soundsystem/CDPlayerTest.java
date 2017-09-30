package spring.in.action.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private SgtPeppers cd;

    @Autowired
    @Qualifier("lonelyHeartsClub")
    private SgtPeppers2 cd2;

    @Autowired
    @Qualifier("lonelyHeartsClub2")
    private SgtPeppers3 cd3;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void cd2ShouldNotBeNull() {
        assertNotNull(cd2);
    }

    @Test
    public void cd3ShouldNotBeNull() {
        assertNotNull(cd3);
    }
}