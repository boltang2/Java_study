package ex1_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import util.MyPath;

public class Ex1_FileInput {
	public static void main(String[] args) {
		String path = MyPath.PATH + "/test.txt";

		File f = new File(path);
		FileInputStream fis = null;
		byte[] b_read = new byte[(int) f.length()];

		// ���� ��λ� ������ ���ٸ�
		if (f.exists()) {

			// ����Ŭ������ ����� InputStream�� ����
			try {
				fis = new FileInputStream(f);

				int code = -1;
				fis.read(b_read);
				String res = new String(b_read);
				System.out.println(res);

				// fis�� 1byte������ ���� �����´�
				// fis��Ʈ���� �� �̻� �о� �� ������ ���ٸ� -1�� ��ȯ�Ѵ�
				// byte������ �����͸� �дٰ� EOF�� �����ٴ� ���� �ǹ��Ѵ�.
				while ((code = fis.read()) != -1) {
					System.out.println((char) code);
				}

				// ����� �Ϸ�� ��Ʈ���� �ݵ�� �ݾ���� �Ѵ�.
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
