package ex3_io_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {

		String path = "C:/Embedded_KHJ/aaa";

		File f = new File(path);

		// ����Ŭ���� f�� ��ΰ� ���������� �����ϴ����� Ȯ���ϴ� �޼���
		if (f.exists()) {
			
		} else {
			System.out.println("�������� �ʴ� ��ΰ� �ֽ��ϴ�");
			f.mkdir();
		}
	}
}
