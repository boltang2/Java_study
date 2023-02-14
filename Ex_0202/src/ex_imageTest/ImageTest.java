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

		// �̹��� �غ�
		ImageIcon img1 = new ImageIcon("������.png");
		ImageIcon img2 = new ImageIcon("������2.png");

		// ImageIcon�� �߰��� �� �ִ� ��ü�� JLabel, JButton�� ����
		JLabel jl = new JLabel(img1);
		jl.setBounds(0, 0, 500, 500);

		// ��ư����
		JButton btn = new JButton();
		btn.setIcon(img1);
		btn.setBounds(10, 50, 30, 30);

		// ��ưŬ�� ����

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				jl.setIcon(img2);
				// �̹����� �ȹٲ�� ������ �������� �������� ��ü������ ����
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
		// �̹����� ���� �����ӳ��� ������ ��ĥ��� add�� ������� �켱����
		f.add(btn);
		f.add(jl);
		f.setVisible(true);
	}
}
