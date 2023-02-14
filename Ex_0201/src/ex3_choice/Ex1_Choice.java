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

		// ���û��� ��ü ����
		Choice bt = new Choice();
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");
		// choice��ü�� ���̰��� �ȿ� �ִ� ����� ������� �����ǹǷ� 0���� �ξ ����
		bt.setBounds(10, 40, 100, 0);

		// ����� ������ label
		Label resultLabel = new Label(ss);
		Font font = new Font("", Font.BOLD, 20);
		resultLabel.setFont(font);
		resultLabel.setBounds(50, 100, 200, 50);

		// �������� �����ϴ� choice��ü���� �̺�Ʈ ������ �߰�
		bt.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				// �ۿ� �ִ� ���������� �������� ����ƽ���� �����ؾ� ����
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
