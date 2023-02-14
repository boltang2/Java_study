package ex1_server_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

	ServerSocket ss;

	public MyServer() {
		// TODO Auto-generated constructor stub
		try {
			ss = new ServerSocket(3000);
			System.out.println("���� �غ� �Ϸ�!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				// ������ Ŭ���̾�Ʈ�� ������ ������ accept�޼���� �޾Ƽ�
				// s��ü���� �Ѱ��ش�.
				// �����ڰ� �� ������ �Ʒ��� ������ �������� �ʰ� ����Ѵ�.
				Socket s = ss.accept();
				
				// Ŭ���̾�Ʈ�� ip�ּ�
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
