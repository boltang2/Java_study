package ex5_window_listener;

import java.awt.Frame;

public class ListenerMain {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 200, 300, 500);

		// �������� ���� x��ư Ŭ������ ���� ������
		f.addWindowListener(new ClosingListener());
		
		f.setVisible(true);
	}
}
