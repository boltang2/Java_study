package ex3_buffered_input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import util.MyPath;

public class Ex1_BufferedInput {
	public static void main(String[] args) {

		// fis�� bis�� ���� �� �����ν� ������ �о� �� �� ���۸� �۾��� �����ϵ��� ���ش�
		// ���۸��̶�, ����� ����Ʈ �迭�� ���۶�� �޸� ������ ��Ƽ� ������ �״ٰ�
		// �ѹ��� ������ִ� ���
		// ���ۿ����� ������ ���� �ޱ����� ���õǾ� �ִ� �����ġ�� �� �κ��ε�,
		// �̿����� �����͸� ��Ƶθ� �� ���� ������� �ϴµ� �����ϹǷ�
		// �ӵ����� ���鿡�� �̵��� �� ���ִ�.
		String path = MyPath.PATH + "/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int) f.length()];

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			if (f.exists()) {
				fis = new FileInputStream(f);
				bis = new BufferedInputStream(fis);

				bis.read(b_read);

				String res = new String(b_read);
				System.out.println(res);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				// ��Ʈ���� ���� �� �������� �ݾ��ִ� ���� ����.
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
