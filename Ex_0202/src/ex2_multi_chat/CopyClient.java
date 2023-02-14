package ex2_multi_chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {
	// 생성자를 통해 원본 클라이언트의 소캣정보 및 서버정보를 받는다
	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;

	public CopyClient(Socket s, ChatServer cs) {
		// TODO Auto-generated constructor stub
		// 생성자를 통해 원본 클라이언트의 소켓정보 및 서버정보를 받는다.
		this.s = s;
		this.server = cs;
		try {
			out = new PrintWriter(s.getOutputStream(), true); // true <- flush역할
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
