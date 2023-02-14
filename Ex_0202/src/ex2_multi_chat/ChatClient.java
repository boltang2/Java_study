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

	// 서버 접속을 위한 객체
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

		send_bt = new JButton("전송");
		send_bt.setBounds(290, 420, 100, 50);
		add(area);
		add(input);
		add(send_bt);

		// 현재 클라이언트를 서버에 접속
		connected();

		send_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sendData(); // 서버로 메세지 전달하기 메서드
			}
		});

		t = new Thread(this);
		t.start();

		// 프레임사이즈 변경 불가
		setResizable(false);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				// x하기 버튼을 눌러서 종료하기 전에 서버와의 접속을 해제
				out.println("xx:~X");
			}
		});

		setVisible(true);
	}

	// 서버 접속 메서드
	private void connected() {
		try {
			s = new Socket("192.168.56.1", 3500);

			// 서버에서 넘어온 값을 읽어들이기 위한 input스트림
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// 문자열을 서버로 전송하기 위한 스트림
			out = new PrintWriter(s.getOutputStream(), true);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 서버에 데이터를 전달하는 메서드
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
