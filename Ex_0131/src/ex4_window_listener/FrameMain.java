package ex4_window_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		Frame f = new Frame();

		f.setBounds(500, 200, 300, 300);

		// �����ӿ��� �� ��� ��ưŬ���� �����ϴ� �̺�Ʈ �����ڸ� ����
		// �͸�Ŭ����
		f.addWindowListener(new MyListener());
		f.setVisible(true);
	}
}
