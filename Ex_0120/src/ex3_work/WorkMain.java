package ex3_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {

		// ����: 123
		// 123�� �����Դϴ�.

		// ����: ab91
		// ab91��(��) ������ �ƴ�

		// try-catch������ ������� �ʰ� �ڵ带 �ۼ��� ������.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String str = sc.next();
		boolean isInt = true;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!(c >= '0' && c <= '9')) {
				isInt = false;
				break;
			}
		}
		if(isInt) {
			System.out.println(str + "�� �����Դϴ�.");
		} else {
			System.out.println(str + "��(��) ������ �ƴմϴ�.");
		}


	}
}
