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
			System.out.println("���� �غ� �Ϸ�!");
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

				// Ŭ���̾�Ʈ�� ���Ӱ� ���ÿ� ���ڿ��� ������ ������
				// �� ���� reader�� ���ؼ� �޴´�.

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
