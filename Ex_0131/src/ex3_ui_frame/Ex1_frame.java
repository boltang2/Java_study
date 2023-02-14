package ex3_ui_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_frame {
	public static void main(String[] args) {
		Frame frame = new Frame("나의 첫 프레임");
		frame.setSize(400, 300);
		frame.setLocation(500, 200);
		
		frame.setBackground(Color.darkGray);
		frame.setVisible(true);
	}
}
