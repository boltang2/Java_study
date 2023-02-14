package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// 키보드에서 n1과 n2변수에 각각 정수값을 입력받는다
		// n1부터 n2까지의 합을 출력
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 두개를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.print("나머지 숫자를 입력해주세요.");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			int tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		for (int i = num1; i <= num2; i++) {
			answer += i;
		}
		System.out.printf("두 숫자 사이의 합은 %d 입니다. \n", answer);

	}

}
