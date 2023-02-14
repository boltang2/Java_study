package ex2_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 300, 1000, 500);
		f.setLayout(null);

		Button btn1 = new Button("��ư1");
		btn1.setBounds(10, 150, 200, 100);
		Button btn2 = new Button("��ư2");
		btn2.setBounds(220, 150, 200, 100);
		Button btn3 = new Button("��ư3");
		btn3.setBounds(430, 150, 200, 100);

		ActionListener click = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = e.getActionCommand();
				int id = e.getID();
				System.out.println(id);
				switch (str) {
				case "��ư1":
					System.out.println("��ư1���� Ŭ���߾��");
					break;
				case "��ư2":
					System.out.println("��ư2���� Ŭ���߾��");
					break;
				case "��ư3":
					System.out.println("��ư3���� Ŭ���߾��");
					break;

				default:
					break;
				}

			}
		};

		btn1.addActionListener(click);
		btn2.addActionListener(click);
		btn3.addActionListener(click);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
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
