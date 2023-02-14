package ex2_string;

import java.util.Scanner;

public class Ex1_string {
	public static void main(String[] args) {
		// 주민번호를 입력하세요
		// 예) 901122-201135
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		System.out.println("에)901111-2222222");
		System.out.print(">> ");
		
		String id = sc.next();
		
		if(id.trim().length() < 14 || id.trim().charAt(6) != '-') {
			System.out.println("주민번호 형식이 올바르지 않습니다.");
		} else {
			String s = "";
			if(id.trim().substring(7,8).equals("1") || id.trim().substring(7,8).equals("3")) {
				s = "남자";
			} else {
				s = "여자";
			}
			System.out.printf("당신은 %s년 %s월 %s일에 태어난 %s입니다.", id.trim().substring(0,2),id.trim().substring(2,4),id.trim().substring(4,6),s);
		}
	}
}
