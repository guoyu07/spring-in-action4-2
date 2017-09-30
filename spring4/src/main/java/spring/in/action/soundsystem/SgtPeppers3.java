package spring.in.action.soundsystem;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named("lonelyHeartsClub2")
public class SgtPeppers3 implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}