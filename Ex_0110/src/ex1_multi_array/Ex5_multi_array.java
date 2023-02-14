package ex1_multi_array;

import java.util.Scanner;

public class Ex5_multi_array {
	public static void main(String[] args) {
		// 학생들의 이름, 수학, 영어성적을 등록하고 한번에 출력하고 싶다.
		// 첫 실행시 몇명의 정보를 입력할 것인지를 키보드에서 받아서
		// 학생정보 등록 및 출력을 진행해보자

		// 등록인원 : 2
		// 이름 : kim
		// 수학 : 90
		// 영어 : 87
		// ----------------
		// 이름 : park
		// 수학 : 86
		// 영어 : 99
		// ----------------
		// 2명 등록 완료
		// kim 90 87
		// park 86 99

		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 인원 : ");
		int n = sc.nextInt();
		String[] info = { "이름 : ", "수학 : ", "국어 : " };
		String[][] arr = new String[n][info.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(info[j]);
				arr[i][j] = sc.next();
			} // in
			System.out.println("---------------------");
		} // out
		
		System.out.println(n + "명 등록 완료!!");
		
		for(int i = 0; i < info.length; i++) {
			System.out.printf("%s\t",info[i]);
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%s\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
