package chapter2.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	
	private String title = "Lonely Heart";
	private String artist = "The Beatles";

	@Override
	public void play() {
		System.out.println("Play " + title + " by " + artist);
	}

}
