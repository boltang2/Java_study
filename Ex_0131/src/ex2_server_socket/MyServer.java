package ex2_server_socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

	ServerSocket ss;

	public MyServer() {
		// TODO Auto-generated constructor stub
		try {
			ss = new ServerSocket(3001);
			System.out.println("서버 준비 완료!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			BufferedReader br = null;
			InputStreamReader isr = null;
			try {
				Socket s = ss.accept();

				// 클라이언트는 접속과 동시에 문자열을 보내기 때문에
				// 그 값을 reader를 통해서 받는다.

				isr = new InputStreamReader(s.getInputStream());
				br = new BufferedReader(isr);

				String msg = br.readLine();
				String ip = s.getInetAddress().getHostAddress();

				System.out.println(ip + " : " + msg);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
