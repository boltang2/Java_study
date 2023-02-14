package ex2_button;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_CheckBox {
	public static void main(String[] args) {
		Frame f = new Frame("����");
		f.setBounds(500, 200, 800, 250);
		f.setLayout(null);

		// ��Ʈ�� ���õ� Ŭ���� // bold �β� italic �񽺵���
		Font font = new Font("�ü�ü", Font.ITALIC, 30);

		// ������ �ؽ�Ʈ�� �����ֱ� ���� Ŭ����
		Label q1 = new Label("1. ����� ��̴� �����Դϱ�?");
		q1.setFont(font);
		q1.setBounds(50, 50, 400, 30);
		q1.setBackground(Color.magenta);
		// ������ ���ϴ� label ����
		Label q2 = new Label("����� ������ �����Դϱ�");
		q2.setBounds(10, 140, 410, 50);

		// ���߼����� �Ұ����� radiobutton����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("����", group, false);
		Checkbox female = new Checkbox("����", group, false);
		male.setBounds(10, 200, 100, 50);
		female.setBounds(120, 200, 100, 50);

		// ������ư�� �̺�Ʈ ������
		ItemListener radio_check = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String str = e.getItem().toString();
				System.out.println(str);
			}
		};

		male.addItemListener(radio_check);
		female.addItemListener(radio_check);

		// üũ�ڽ��� ������ �����ϴ� ������
		ItemListener check_click = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String str = e.getItem().toString();
				String res = "";

				switch (str) {
				case "��ȭ":
					res = e.getStateChange() == 1 ? "��ȭ ����" : "��ȭ ������";
					break;
				case "����":
					res = e.getStateChange() == 1 ? "���� ����" : "���� ������";
					break;

				default:
					break;
				}
				System.out.println(res);
			}
		};

		// üũ�ڽ� ����
		Checkbox movie = new Checkbox("��ȭ");
		movie.setBounds(10, 100, 100, 50);
		Checkbox book = new Checkbox("����");
		book.setBounds(120, 100, 100, 50);
		Checkbox game = new Checkbox("����");
		game.setBounds(230, 100, 100, 50);

		// üũ�ڽ��鿡�� �̺�Ʈ ������ ���
		movie.addItemListener(check_click);
		book.addItemListener(check_click);
		game.addItemListener(check_click);

		f.add(q1);
		f.add(movie);
		f.add(book);
		f.add(game);
		f.add(male);
		f.add(female);
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
