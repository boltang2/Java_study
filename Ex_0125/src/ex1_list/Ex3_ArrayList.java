package ex1_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> sList = new ArrayList<String>();
		out: while (true) {
			System.out.print("추가 : ");
			String str = sc.next();
			if (str.equalsIgnoreCase("exit")) {
				break;
			}
			for (String tmp : sList) {
				if (tmp.equals(str)) {
					System.out.println("중복된 아이디를 입력하셨습니다.");
					continue out;
				}
			}
			sList.add(str);
			System.out.println(sList);
		}
		System.out.println("종료");
	}
}
