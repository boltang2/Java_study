package ex2_multi_chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements Runnable {

	JTextArea area;
	JTextField input;
	JButton send_bt;

	// ���� ������ ���� ��ü
	Socket s;
	BufferedReader in = null;
	PrintWriter out = null;
	Thread t;

	public ChatClient() {
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 420, 550);
		setLayout(null);
		area = new JTextArea();
		area.setBounds(10, 50, 380, 350);

		input = new JTextField();
		input.setBounds(10, 420, 250, 50);

		send_bt = new JButton("����");
		send_bt.setBounds(290, 420, 100, 50);
		add(area);
		add(input);
		add(send_bt);

		// ���� Ŭ���̾�Ʈ�� ������ ����
		connected();

		send_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sendData(); // ������ �޼��� �����ϱ� �޼���
			}
		});

		t = new Thread(this);
		t.start();

		// �����ӻ����� ���� �Ұ�
		setResizable(false);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				// x�ϱ� ��ư�� ������ �����ϱ� ���� �������� ������ ����
				out.println("xx:~X");
			}
		});

		setVisible(true);
	}

	// ���� ���� �޼���
	private void connected() {
		try {
			s = new Socket("192.168.56.1", 3500);

			// �������� �Ѿ�� ���� �о���̱� ���� input��Ʈ��
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// ���ڿ��� ������ �����ϱ� ���� ��Ʈ��
			out = new PrintWriter(s.getOutputStream(), true);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// ������ �����͸� �����ϴ� �޼���
	private void sendData() {
		String msg = input.getText();
		out.println(msg);
		input.setText("");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				String msg = in.readLine();
				if (msg.equals("xx:~X")) {
					break;
				}
				if (msg != null) {
					area.append(msg + "\n");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				out.close();
				in.close();
				s.close();
				System.exit(0);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
