package ex6_exception_work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		// Ű���忡�� ������ �ް�
		// �������� ������ �ƴ����� �Ǵ��Ͻÿ�.
		
		// ������ ����� �޾����ٸ�
		// ���� : 10
		// ��� : 10
		
		// ���� : aaa
		// aaa��(��) ������ �ƴմϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String err = sc.next();
		try {
			int num = Integer.parseInt(err);
			System.out.println("��� : " + num);
		} catch (Exception e) {
			System.out.println(err + "��(��) ������ �ƴմϴ�.");
		}
	}
}
