package ex7_work;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Output op = new Output();

		System.out.printf("암호화 할 문자를 입력해주세요 : ");

		String str = sc.next();

		System.out.println("결과 : " + op.convert(str));
	}
}
