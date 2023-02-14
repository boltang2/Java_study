package ex1_string;

import java.util.Scanner;

public class Ex1_string {
	public static void main(String[] args) {
		// String �ΰ����� Ư¡�� ������ �ִ�.
		// 1) ��ü ���� ����� �ΰ����� �ִ� Ŭ����(�Ͻ���, �����)
		// 2) �ѹ� ������ ���ڿ��� ������ ������ �ʴ´�(�Һ��� Ư¡)
		
		String str1 = "abc"; // �Ͻ��� ��ü���� (new Ű���带 ���� �ʰ� ����)
		String str2 = "abc";
		String str3 = new String("abc"); // ����� ��ü���� (heap������ ���� ����)
		String str4 = new String("abc");
		if(str1 == str3) { // == �⺻�ڷ������� ���ϴ� ��� ���� ��
						   // == ��ü������ ���ϴ� ��� �ּҰ��� ��
			System.out.println("oo");
		} else {
			System.out.println("xx");
		}
		
		// String Ŭ������ ��ü�� �ּҺ� ����, ���� ���ϴ� ��찡 �ξ� ����
		if(str1.equals(str3)) {
			System.out.println("oo");
		} else {
			System.out.println("xx");
		}
		// �⺻�ڷ������� ���� -> ����
		// Ŭ������ ���� -> ��ü (��Ʈ���� �����ϰ� ��ü, ������� �ҷ��� �ȴ�.)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("str3 �Է��ϼ���.");
		str3 = sc.next();
		
		if(str1.equals(str3)) {
			System.out.println("oo");
		} else {
			System.out.println("xx");
		}
		
		String greet = "�ȳ�"; // �ѹ������� ���ڿ��� ������ ����.
		greet += "�ϼ���";
		/*
		 * �ȳ� <- garbage collector�� heap�޸𸮸� ���Ӿ��� ���� ���������ִ� ���ξ��� �����͸� ����������.
		 * �ȳ��ϼ��� <- greet��ü�� �� �ּҰ����� ����
		 */
		
		str1 = "bbb";
		str2 = "bbb";
		str2 = "ccc";
		/*
		 * bbb <- str1 ��ü�� ��� ����
		 * ccc <- str2 ��ü�� �� �ּҰ����� ����
		 */
		
		System.out.println(greet);
	}
}
