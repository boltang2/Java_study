package ex7_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		/*
		 * 수1, 수2 연산자를 result() 메서드로 전달하여
		 * 결과를 출력하시오
		 * 수1
		 * 수2
		 * 연산자
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int su1 = 0;
		int su2 = 0;
		String op = "";
		Calculator cal = new Calculator();
		System.out.print("수 1 : ");
		su1 = sc.nextInt();
		System.out.print("수 2 : ");
		su2 = sc.nextInt();
		System.out.print("연산자 : ");
		op = sc.next();
		cal.getResult(op, su1, su2);
		
		
	}
}
