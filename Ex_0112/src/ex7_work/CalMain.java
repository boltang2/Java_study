package ex7_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		/*
		 * ��1, ��2 �����ڸ� result() �޼���� �����Ͽ�
		 * ����� ����Ͻÿ�
		 * ��1
		 * ��2
		 * ������
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int su1 = 0;
		int su2 = 0;
		String op = "";
		Calculator cal = new Calculator();
		System.out.print("�� 1 : ");
		su1 = sc.nextInt();
		System.out.print("�� 2 : ");
		su2 = sc.nextInt();
		System.out.print("������ : ");
		op = sc.next();
		cal.getResult(op, su1, su2);
		
		
	}
}
