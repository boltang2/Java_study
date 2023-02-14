package ex1_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_ButtonTest {
	public static void main(String[] args) {
		Frame f = new Frame();

		f.setBounds(100, 100, 1200, 800);
		f.setVisible(true);
		// frame 클래스는 추가된 컴포넌트를 화면에 가득 채우려고 하는 속성을 가지고 있다.
		f.setLayout(null); // 자동배치 종료

		// 버튼생성
		// 자동배치가 꺼져있는 Frame에 들어가게 될 자식 컴포넌트들은
		// 반드시 위치와 크기값이 설정되어 있어야 한다.
		Button btnOk = new Button("확인");
		btnOk.setBounds(70, 70, 100, 50);
		Button btnClose = new Button("닫기");
		btnClose.setBounds(230, 70, 100, 50);

		// 만들어둔 버튼들에 대해서 이벤트 감지자 추가
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("확인 버튼 클릭");
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("닫기 버튼 클릭");
			}
		});

		f.add(btnOk);
		f.add(btnClose);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}
