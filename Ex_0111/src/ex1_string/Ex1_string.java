package ex1_string;

import java.util.Scanner;

public class Ex1_string {
	public static void main(String[] args) {
		// String 두가지의 특징을 가지고 있다.
		// 1) 객체 생성 방법이 두가지가 있는 클래스(암시적, 명시적)
		// 2) 한번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
		
		String str1 = "abc"; // 암시적 객체생성 (new 키워드를 쓰지 않고 만듬)
		String str2 = "abc";
		String str3 = new String("abc"); // 명시적 객체생성 (heap공간에 새로 만듬)
		String str4 = new String("abc");
		if(str1 == str3) { // == 기본자료형끼리 비교하는 경우 값을 비교
						   // == 객체형끼리 비교하는 경우 주소값을 비교
			System.out.println("oo");
		} else {
			System.out.println("xx");
		}
		
		// String 클래스는 객체간 주소비교 보다, 값을 비교하는 경우가 훨씬 많다
		if(str1.equals(str3)) {
			System.out.println("oo");
		} else {
			System.out.println("xx");
		}
		// 기본자료형으로 만듬 -> 변수
		// 클래스로 만듬 -> 객체 (스트링만 유일하게 객체, 변수라고 불러도 된다.)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("str3 입력하세요.");
		str3 = sc.next();
		
		if(str1.equals(str3)) {
			System.out.println("oo");
		} else {
			System.out.println("xx");
		}
		
		String greet = "안녕"; // 한번생성된 문자열은 변하지 않음.
		greet += "하세요";
		/*
		 * 안녕 <- garbage collector가 heap메모리를 끈임없이 돌며 힙영역에있는 주인없는 데이터를 지워버린다.
		 * 안녕하세요 <- greet객체는 요 주소값으로 변함
		 */
		
		str1 = "bbb";
		str2 = "bbb";
		str2 = "ccc";
		/*
		 * bbb <- str1 객체는 계속 참조
		 * ccc <- str2 객체는 요 주소값으로 변함
		 */
		
		System.out.println(greet);
	}
}
