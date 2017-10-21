package spittr.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class MockSpittleRepository implements SpittleRepository{

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<>();
        for (int i=0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;

    }
}
