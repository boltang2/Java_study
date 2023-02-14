package ex6_windowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_WindowAdapter {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 300, 200, 200);
		
		// x버튼 클릭 감지를 위한 adpater클래스
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0); // 열려있는 모든 프레임을 종료
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
				f2.dispose(); // f2객체만 종료
			}
		});
	}
}
