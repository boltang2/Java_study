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
			System.out.println("서버 준비 완료!");
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
				// 접속한 클라이언트의 정보를 서버가 accept메서드로 받아서
				// s객체에게 넘겨준다.
				// 접속자가 올 때까지 아래쪽 라인을 실행하지 않고 대기한다.
				Socket s = ss.accept();
				
				// 클라이언트의 ip주소
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
