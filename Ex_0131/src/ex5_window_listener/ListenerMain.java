package ex5_window_listener;

import java.awt.Frame;

public class ListenerMain {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 200, 300, 500);

		// 프레임의 우상단 x버튼 클릭만을 위한 감지자
		f.addWindowListener(new ClosingListener());
		
		f.setVisible(true);
	}
}
