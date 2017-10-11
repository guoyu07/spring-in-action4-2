package spring.in.action.ch4.aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by private on 11.10.17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class AudienceTest {

    @Autowired
    private Performance performance;

    @Autowired
    private Performance performanceCrash;

    @Test
    public void testPerformance() {
        performance.perform();
    }

    @Test
    public void testPerformanceCrash() {
        performanceCrash.perform();
    }

}
