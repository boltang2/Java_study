package ex2_list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		
		// �̸� : aaa
		// ���� : 20
		// aaa / 20 ���
		Scanner sc = new Scanner(System.in);
		ArrayList<User> list = new ArrayList<>();
		
		
		out : while(true) {
			User u = new User();
			System.out.print("�̸� : ");
			String name = sc.next();
			for(User c : list) {
				if(c.getName().equals(name)) {
					System.out.println("�ߺ����̵� �Է�.");
					continue out;
				}
			}
			System.out.print("���� : ");
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
