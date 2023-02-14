package ex2_multi_chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread {

	ServerSocket ss;

	// ����� Ŭ���̾�Ʈ�� ����� ArrayList
	ArrayList<CopyClient> list;

	public ChatServer() {
		// TODO Auto-generated constructor stub
		try {
			list = new ArrayList<CopyClient>();
			ss = new ServerSocket(3500);
			System.out.println("���� ����");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "�� ����");

				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public void sendMessage(String msg) {
		// �����ڵ��� CopyClient������ ArrayList�� ����Ǿ� �ִ� ����
		for (CopyClient cc : list) {
			cc.out.println(msg); // ������ �������ִ� ��� �����ڵ鿡�� �޼����� ����
		}
	}

	// ����� ����ڸ� ArrayList���� ����
	public void removeClient(CopyClient cc) {
		list.remove(cc); // ��������� ����ڸ� ArrayList���� ����
		// �����ִ� �������鿡�� ����޼����� ����
		sendMessage("***" + cc.ip + "���� �����Ͽ����ϴ� ***");
	}
}
