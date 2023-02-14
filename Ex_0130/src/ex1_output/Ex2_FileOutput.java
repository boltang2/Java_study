package ex1_output;

import java.io.File;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String path = "C:/Embedded_KHJ/fileOutput����.txt";
		File f = new File(path);
		
		try {
			fos = new FileOutputStream(f, true); // true ������ �̾ �ۼ�����. default�� false�� �׻� ���� ���� ����.
			String msg = "file OutputStream�� �����Դϴ�. \n�� �� �Էµ� �԰���!";
			String msg2 = "\n���� ����° line�Դϴ�.\n";
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
