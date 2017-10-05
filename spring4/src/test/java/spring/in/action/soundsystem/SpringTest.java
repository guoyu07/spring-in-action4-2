package spring.in.action.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-conf.xml" })
public class SpringTest {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private CompactDisc compactDisc2;

    @Autowired
    private CompactDisc compactDisc3;

    @Autowired
    private CompactDisc compactDisc4;

    @Test
    public void compactDiscShouldNotBeNull() {
        assertNotNull(compactDisc);
        compactDisc.play();
    }

    @Test
    public void compactDisc2ShouldNotBeNull() {
        assertNotNull(compactDisc2);
        compactDisc2.play();
    }

    @Test
    public void compactDisc3ShouldNotBeNull() {
        assertNotNull(compactDisc3);
        compactDisc3.play();
    }

    @Test
    public void compactDisc4ShouldNotBeNull() {
        assertNotNull(compactDisc4);
        compactDisc4.play();
    }
}