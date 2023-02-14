package ex4_window_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		Frame f = new Frame();

		f.setBounds(500, 200, 300, 300);

		// 프레임에게 우 상단 버튼클릭을 감지하는 이벤트 감지자를 부착
		// 익명클래스
		f.addWindowListener(new MyListener());
		f.setVisible(true);
	}
}
