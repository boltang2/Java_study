package ex5_thread;

import java.util.Scanner;

public class TMain {
	public static void main(String[] args) {
		
		// Ű���忡�� ���� �ް�
		// 1�ʿ� 1�� ���ҵǴ� ���� ����ϴٰ� 0�� �Ǿ��� �� �����带 ����
		T1 t1 = new T1();
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int num = sc.nextInt();
		t1.setNum(num);
		t1.start();
		
	}
}
