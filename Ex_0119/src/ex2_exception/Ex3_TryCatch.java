package ex2_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		// ��ĳ�ʸ� ���� Ű���忡�� ���� �Է¹ް�
		// �������� �ƴ����� �Ǵ��Ͻÿ�.

		// ���� : 100
		// ��� : 100

		// ���� : a
		// ������ �Է����ּ���

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("����  >> ");
			int num = sc.nextInt();
			System.out.println("��� : " + num);
		} catch (Exception e) {
			System.out.println("������ �Է����ּ���.");
		}
	}
}
