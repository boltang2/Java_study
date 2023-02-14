package ex3_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	static String ss = "A";

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 300, 500, 250);
		f.setLayout(null);

		// 선택상자 객체 생성
		Choice bt = new Choice();
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");
		// choice객체의 높이값은 안에 있는 요소의 사이즈로 결정되므로 0으로 두어도 무관
		bt.setBounds(10, 40, 100, 0);

		// 결과를 보여줄 label
		Label resultLabel = new Label(ss);
		Font font = new Font("", Font.BOLD, 20);
		resultLabel.setFont(font);
		resultLabel.setBounds(50, 100, 200, 50);

		// 혈핵형을 선택하는 choice객체에게 이벤트 감지자 추가
		bt.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				// 밖에 있는 전역변수를 못가져옴 스태틱으로 선언해야 가능
				ss = bt.getSelectedItem().toString();
				System.out.println(ss);
				resultLabel.setText(ss);
			}
		});

		f.add(bt);
		f.add(resultLabel);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		f.setVisible(true);
	}
}
