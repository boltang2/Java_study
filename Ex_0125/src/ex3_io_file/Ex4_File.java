package ex3_io_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		String path = "C:/Embedded_KHJ";

		File f1 = new File(path);

		if (f1.isDirectory()) {
			// path����� ���� ��ϵ��� FileŬ���� ������ ���� ��.
			File[] f2 = f1.listFiles();

			// ������ϵ��� ����ϵ�, ���������� �����ֱ�
			for (int i = 0; i < f2.length; i++) {
				if(f2[i].isDirectory()) {
					System.out.println(f2[i].getName());
				}
			}
		}
	}
}
