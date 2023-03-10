package ex2_string;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 키보드에서 아무값이나 입력받고 소문자 a의 갯수를 출력
		System.out.println("1) 키보드에서 아무값이나 입력받고 소문자 a의 갯수를 출력");
		System.out.printf("아무문자 입력하세요. >> ");
		String str1 = sc.next();
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'a')
				count++;
		}
		System.out.printf("a의 개수는 %d 입니다\n", count);

		// 회문 판단하기
		// 값 a1221a
		System.out.println("2) 회문 판단하기");
		System.out.print("문자를 입력하세요. >> ");
		String str2 = sc.next();
		count = 1;
		boolean isTrue = true;
		for (int i = 0; i < str2.length() / 2; i++) {
			if (str2.charAt(i) != str2.charAt(str2.length() - count)) {
				isTrue = false;
				break;
			}
			count++;
		}
		if (isTrue) {
			System.out.println("회문 입니다.");
		} else {
			System.out.println("회문이 아닙니다.");
		}

		// 검색할 배우: song
		// [song]
		// 박쥐
		// 괴물
		// 관상
		// 검색할 배우: park
		// 해당 배우는 없습니다.
		System.out.println("3) 배우 영화 나열하기");
		System.out.printf("배우를 입력하세요. >> ");
		boolean isNone = true;
		String str3 = sc.next();
		String[][] actor = { { "[song]", "박쥐", "괴물", "관상" }, { "[lee]", "백두산", "내부자들", "광해" },
				{ "[ryu]", "명량", "극한직업", "광해" }, { "[jo]", "내부자들", "퍼펙트게임", "타짜" } };
		for(String[] act : actor) {
			if(act[0].substring(1, act[0].length() - 1).equalsIgnoreCase(str3)) {
				for(String movie : act) {
					System.out.println(movie);
				}
				isNone = false;
				break;
			}
		}
		if(isNone) {
			System.out.println("해당 배우 없음");
		}

	}
}
