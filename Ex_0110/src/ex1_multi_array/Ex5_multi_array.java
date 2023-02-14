package ex1_multi_array;

import java.util.Scanner;

public class Ex5_multi_array {
	public static void main(String[] args) {
		// �л����� �̸�, ����, ������� ����ϰ� �ѹ��� ����ϰ� �ʹ�.
		// ù ����� ����� ������ �Է��� �������� Ű���忡�� �޾Ƽ�
		// �л����� ��� �� ����� �����غ���

		// ����ο� : 2
		// �̸� : kim
		// ���� : 90
		// ���� : 87
		// ----------------
		// �̸� : park
		// ���� : 86
		// ���� : 99
		// ----------------
		// 2�� ��� �Ϸ�
		// kim 90 87
		// park 86 99

		Scanner sc = new Scanner(System.in);
		System.out.print("����� �ο� : ");
		int n = sc.nextInt();
		String[] info = { "�̸� : ", "���� : ", "���� : " };
		String[][] arr = new String[n][info.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(info[j]);
				arr[i][j] = sc.next();
			} // in
			System.out.println("---------------------");
		} // out
		
		System.out.println(n + "�� ��� �Ϸ�!!");
		
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
