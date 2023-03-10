package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// 키보드에서 정수 값을 입력 받고, 입력받은 숫자가 소수인지 판단하시오

		Scanner sc = new Scanner(System.in);

		// 단 키보드에서 1을 받았아면 '소수가 아님'을 출력해야 한다.

		System.out.print("양수 숫자를 입력해주세요.");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.printf("%d은 소수가 아님", num);
		} else {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.printf("%d은 소수 입니다.", num);
			} else {
				System.out.printf("%d은 소수가 아님", num);
			}
		}
	}
}
