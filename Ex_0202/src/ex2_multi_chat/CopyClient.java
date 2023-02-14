package ex2_multi_chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {
	// �����ڸ� ���� ���� Ŭ���̾�Ʈ�� ��Ĺ���� �� ���������� �޴´�
	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;

	public CopyClient(Socket s, ChatServer cs) {
		// TODO Auto-generated constructor stub
		// �����ڸ� ���� ���� Ŭ���̾�Ʈ�� �������� �� ���������� �޴´�.
		this.s = s;
		this.server = cs;
		try {
			out = new PrintWriter(s.getOutputStream(), true); // true <- flush����
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				String msg = in.readLine();
				if (msg.equals("xx:~X")) {
					out.println("xx:~X");
					server.removeClient(this);
					break;
				}

				server.sendMessage(ip + " : " + msg);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
