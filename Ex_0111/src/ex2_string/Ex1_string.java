package ex2_string;

import java.util.Scanner;

public class Ex1_string {
	public static void main(String[] args) {
		// �ֹι�ȣ�� �Է��ϼ���
		// ��) 901122-201135
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
		System.out.println("��)901111-2222222");
		System.out.print(">> ");
		
		String id = sc.next();
		
		if(id.trim().length() < 14 || id.trim().charAt(6) != '-') {
			System.out.println("�ֹι�ȣ ������ �ùٸ��� �ʽ��ϴ�.");
		} else {
			String s = "";
			if(id.trim().substring(7,8).equals("1") || id.trim().substring(7,8).equals("3")) {
				s = "����";
			} else {
				s = "����";
			}
			System.out.printf("����� %s�� %s�� %s�Ͽ� �¾ %s�Դϴ�.", id.trim().substring(0,2),id.trim().substring(2,4),id.trim().substring(4,6),s);
		}
	}
}
