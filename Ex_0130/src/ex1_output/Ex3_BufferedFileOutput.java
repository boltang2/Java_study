package ex1_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex3_BufferedFileOutput {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream("C:/Embedded_KHJ/bos�� ����.txt");
			bos = new BufferedOutputStream(fos);

			String str = "buffered��Ʈ���� ����.";
			bos.write(str.getBytes());
			
			// ������ ���������� ����ϱ� ���� �޼��带 ���������� �ѹ� �� ȣ��
			bos.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				// ������ �������� �ݴ°� �ſ� �߿��ϴ�.
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
