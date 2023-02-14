package ex1_first;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Ex1_print {

	public static void main(String[] args) {
		while (true) {
			File a = new File("pacMan.wav");
			System.out.println(a);
			try {
				AudioInputStream b = AudioSystem.getAudioInputStream(a);
				try {
					Clip c = AudioSystem.getClip();
					c.open(b);
					c.start();
					try {
						Thread.sleep(c.getMicrosecondLength() / 1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (LineUnavailableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
