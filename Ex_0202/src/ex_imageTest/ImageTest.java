package ex_imageTest;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.temporal.JulianFields;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 200, 500, 500);
		f.setLayout(null);

		// 이미지 준비
		ImageIcon img1 = new ImageIcon("개구리.png");
		ImageIcon img2 = new ImageIcon("개구리2.png");

		// ImageIcon을 추가할 수 있는 객체는 JLabel, JButton만 가능
		JLabel jl = new JLabel(img1);
		jl.setBounds(0, 0, 500, 500);

		// 버튼생성
		JButton btn = new JButton();
		btn.setIcon(img1);
		btn.setBounds(10, 50, 30, 30);

		// 버튼클릭 감지

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				jl.setIcon(img2);
				// 이미지가 안바뀌는 현상을 막기위해 프레임을 전체적으로 갱신
				jl.repaint();

			}
		});

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
			}
		});
		// 이미지를 가진 프레임끼리 영역이 겹칠경우 add한 순서대로 우선순위
		f.add(btn);
		f.add(jl);
		f.setVisible(true);
	}
}
