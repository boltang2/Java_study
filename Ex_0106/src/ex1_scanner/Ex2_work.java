package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// Ű���忡�� n1�� n2������ ���� �������� �Է¹޴´�
		// n1���� n2������ ���� ���
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ΰ��� �Է����ּ���.");
		int num1 = sc.nextInt();
		System.out.print("������ ���ڸ� �Է����ּ���.");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			int tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		for (int i = num1; i <= num2; i++) {
			answer += i;
		}
		System.out.printf("�� ���� ������ ���� %d �Դϴ�. \n", answer);

	}

}
