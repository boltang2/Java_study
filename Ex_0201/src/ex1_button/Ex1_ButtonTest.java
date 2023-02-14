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
		// frame Ŭ������ �߰��� ������Ʈ�� ȭ�鿡 ���� ä����� �ϴ� �Ӽ��� ������ �ִ�.
		f.setLayout(null); // �ڵ���ġ ����

		// ��ư����
		// �ڵ���ġ�� �����ִ� Frame�� ���� �� �ڽ� ������Ʈ����
		// �ݵ�� ��ġ�� ũ�Ⱚ�� �����Ǿ� �־�� �Ѵ�.
		Button btnOk = new Button("Ȯ��");
		btnOk.setBounds(70, 70, 100, 50);
		Button btnClose = new Button("�ݱ�");
		btnClose.setBounds(230, 70, 100, 50);

		// ������ ��ư�鿡 ���ؼ� �̺�Ʈ ������ �߰�
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Ȯ�� ��ư Ŭ��");
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("�ݱ� ��ư Ŭ��");
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
