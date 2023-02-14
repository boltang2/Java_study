package ex4_memo_app;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Memo {
	static String msg = "";

	public static void main(String[] args) {
		Frame f = new Frame("�޸���");
		f.setBounds(500, 200, 250, 330);
		f.setLayout(null);

		Font font = new Font("", Font.PLAIN, 20);

		// ��ܿ� �ڸ����� ������Ʈ�� --------------------
		TextField tf = new TextField();
		tf.setBounds(10, 50, 180, 20);
		Button btn = new Button("ok");
		btn.setBounds(195, 49, 40, 20);
		btn.setEnabled(false);

		// �߾ӿ� �ڸ����� ������Ʈ�� --------------------
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 90, 230, 180);
		ta.setFont(font);
		ta.setEditable(false); // ta�� ���������� ���� �Է��ϴ� ���� ����
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				msg += tf.getText() + "\n";
				ta.setText(msg);
				tf.setText("");
				tf.requestFocus(); // tf�� Ŀ���� �̵���
			}
		});

		// ���� ������ tf�� ���� ta�� �߰� ���� ���� �� ����
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					msg += tf.getText() + "\n";
					ta.setText(msg);
					tf.setText("");
					tf.requestFocus(); // tf�� Ŀ���� �̵���
				}
			}
		});

		// �ϴܿ� �ڸ����� ������Ʈ�� --------------------
		Button btnSave = new Button("����");
		btnSave.setBounds(10, 280, 180, 30);
		Button btnClose = new Button("�ݱ�");
		btnClose.setBounds(200, 280, 40, 30);

		// �����ư Ŭ���� �̺�Ʈ ������
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String msg = ta.getText();
				FileWriter fw = null;
				BufferedWriter bw = null;

				try {
					// �˾�â
					FileDialog fd = new FileDialog(f, "����", FileDialog.SAVE);
					fd.setVisible(true);
					// ���� ������ ���� ���
					String path = fd.getDirectory() + fd.getFile();
					System.out.println(path);
					fw = new FileWriter(path, true);
					bw = new BufferedWriter(fw);
					bw.write(msg);
					bw.flush();
					System.out.println(fd.getFile());
					if (fd.getFile() != null) {
						// �˾�â
						JOptionPane.showMessageDialog(f, "����Ϸ�");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				} finally {
					try {
						bw.close();
						fw.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}

			}
		});

		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
			}
		});
		// --------------------------------------

		// textField(tf)���� �ִ� ��쿡�� ok��ư Ȱ��ȭ
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				// TODO Auto-generated method stub
				if (tf.getText().trim().equals("")) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}

			}
		});

		f.add(tf);
		f.add(btn);
		f.add(ta);
		f.add(btnSave);
		f.add(btnClose);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		f.setResizable(false); // ũ������ ����
		f.setVisible(true);
	}
}
