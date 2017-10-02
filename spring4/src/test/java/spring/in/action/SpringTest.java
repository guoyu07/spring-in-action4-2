package spring.in.action;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.in.action.soundsystem.CDPlayerConfig;
import spring.in.action.soundsystem.CompactDisc;
import spring.in.action.soundsystem.MediaPlayer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring.xml" })
public class SpringTest {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(compactDisc);
        compactDisc.play();
    }
}