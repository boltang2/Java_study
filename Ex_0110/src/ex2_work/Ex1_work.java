package ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// Ű���忡�� �Է¹��� �� ��ŭ �Ǻ���ġ ���� ����ϱ�
		// �Է� : 5
		// 1 1 2 3 5 8 13 21
		Scanner sc = new Scanner(System.in);
		System.out.printf("���ڸ� �Է��ϼ���.");
		int n = sc.nextInt();
		int[] answer = { 1, 1 };
		
		if (n > 2) {
			for (int i = 3; i <= n; i++) {
				int tmp = answer[0];
				answer[0] += answer[1];
				answer[1] = tmp;
			}
		} 
		System.out.printf("%d ������ �� : %d", n, answer[0]);
	}
}
