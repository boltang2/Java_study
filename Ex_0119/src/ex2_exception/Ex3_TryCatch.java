package ex2_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		// 스캐너를 통해 키보드에서 값을 입력받고
		// 정수인지 아닌지를 판단하시오.

		// 정수 : 100
		// 결과 : 100

		// 정수 : a
		// 정수만 입력해주세요

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("정수  >> ");
			int num = sc.nextInt();
			System.out.println("결과 : " + num);
		} catch (Exception e) {
			System.out.println("정수만 입력해주세요.");
		}
	}
}
