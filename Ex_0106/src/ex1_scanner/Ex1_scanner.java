package ex1_scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		// Ű���忡�� ���� �Է¹��� �� �ֵ��� ���ִ� Ŭ����
		// UI ���� ���������� �ʿ���� ������ int, String Ÿ�Ը� �����ϰ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		System.out.println("�Է� ���� �� : " + num);
		
		System.out.print("���� : ");
		String str = sc.next();
		System.out.println("�Է� ���� ��: " + str);
		
	}
}
