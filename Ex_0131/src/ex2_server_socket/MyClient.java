package ex2_server_socket;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String msg = sc.nextLine();

		if (msg != null && msg.trim().length() > 0) {
			Socket s = null;
			PrintWriter out = null;

			try {
				s = new Socket("192.168.3.101", 3001);

				// ���ڿ��� ������ �����ϱ� ���� ��Ʈ���� �غ�
				out = new PrintWriter(s.getOutputStream());

				// out�� ���� ������ ������ ����
				out.write(msg);
				out.flush();
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					out.close();
					s.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
