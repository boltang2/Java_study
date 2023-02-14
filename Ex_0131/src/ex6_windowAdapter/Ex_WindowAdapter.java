package ex6_windowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_WindowAdapter {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 300, 200, 200);
		
		// x��ư Ŭ�� ������ ���� adpaterŬ����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0); // �����ִ� ��� �������� ����
			}
		});
		
		f.setVisible(true);
		
		Frame f2 = new Frame();
		f2.setBounds(400, 400, 300, 200);
		f2.setVisible(true);
		
		f2.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				f2.dispose(); // f2��ü�� ����
			}
		});
	}
}
