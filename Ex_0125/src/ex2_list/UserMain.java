package ex2_list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		
		// 이름 : aaa
		// 나이 : 20
		// aaa / 20 등록
		Scanner sc = new Scanner(System.in);
		ArrayList<User> list = new ArrayList<>();
		
		
		out : while(true) {
			User u = new User();
			System.out.print("이름 : ");
			String name = sc.next();
			for(User c : list) {
				if(c.getName().equals(name)) {
					System.out.println("중복아이디 입력.");
					continue out;
				}
			}
			System.out.print("나이 : ");
			int age = sc.nextInt();
			u.setName(name);
			u.setAge(age);
			list.add(u);
			
//			for(User c : list) {
//				System.out.println(c.getName());
//				System.out.println(c.getAge());
//			}
		}
		
	}
}
