package ex7_work;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Output op = new Output();

		System.out.printf("��ȣȭ �� ���ڸ� �Է����ּ��� : ");

		String str = sc.next();

		System.out.println("��� : " + op.convert(str));
	}
}
