package ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// 키보드에서 입력받은 값 만큼 피보나치 수열 출력하기
		// 입력 : 5
		// 1 1 2 3 5 8 13 21
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요.");
		int n = sc.nextInt();
		int[] answer = { 1, 1 };
		
		if (n > 2) {
			for (int i = 3; i <= n; i++) {
				int tmp = answer[0];
				answer[0] += answer[1];
				answer[1] = tmp;
			}
		} 
		System.out.printf("%d 까지의 합 : %d", n, answer[0]);
	}
}
