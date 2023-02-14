package ex8_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {

		// ObjectStream���

		// ��� -------------

		// id : aaa
		// 0�� 0�� 0��
		// ����(s) | ����(r) | ��(p)
		// ����� �̰���ϴ�.
		// ���� ��? y | n : n
		// ���� ����

		// id : aaa
		// 1�� 0�� 0��
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		String path = "C:/Embedded_KHJ/";

		Scanner sc = new Scanner(System.in);

		System.out.print("id : ");
		String user = sc.next();
		path = path + user + ".sav";
		File f = new File(path);

		try {
			Rsp rsp;
			if (!f.exists()) {
				rsp = new Rsp(user);
			} else {
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				rsp = (Rsp) ois.readObject();
			}
			rsp.rspGame();
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(rsp);
			oos.flush();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
				ois.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
