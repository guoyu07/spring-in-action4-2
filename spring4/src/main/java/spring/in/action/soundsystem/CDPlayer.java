package spring.in.action.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    @Autowired(required = false)
    @Qualifier("lonelyHeartsClub")
    private CompactDisc cd;

    public void play() {
        cd.play();
    }
}