package ex1_scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		// 키보드에서 값을 입력받을 수 있도록 해주는 클래스
		// UI 배우는 시점에서는 필요없기 때문에 int, String 타입만 간단하게
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println("입력 받은 값 : " + num);
		
		System.out.print("문장 : ");
		String str = sc.next();
		System.out.println("입력 받은 값: " + str);
		
	}
}
