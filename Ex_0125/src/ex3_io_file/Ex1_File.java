package ex3_io_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {

		// io (input, output)
		// �Է°� ����� ����ϴ� ��Ʈ���� �ǹ��Ѵ�.
		// ��Ʈ���̶�, �����͸� ������ϱ� ���� ������ ���
		// �ܼ�(C:, Ű���� ... ��Ŭ���� �ܺο���)���� �����͸� �����´ٴ���
		// jvm�� �����͸� �ַܼ� �������� ���� �۾��� �� �� �ֵ��� �ϴ� Ŭ������
		// jvm���� �ܼ� output �ݴ�� input
		String path = "C:/Embedded_KHJ/test.txt";
		File f1 = new File(path);
		// f1�� ������ ��ΰ� ���� ������ ��� true
		// ���丮 ������ ��� false
		if (f1.isFile()) {
			System.out.println("�뷮 : " + f1.length() + "byte");
		}
	}
}
