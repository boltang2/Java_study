package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball {
	public static void main(String[] args) {
		// ������ ������ ���� �߱� ������
		// �迭�� ����� ����Ͽ� �ڵ带 �ٿ�������.
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int size = 5; // ���� ���� ���� ũ��
		int[] com = new int[size]; // ��ǻ�Ͱ� �� ������ �Է��� �迭
		int[] user = new int[size]; // ���� ������ �Է��� �迭
		int count = 1; // ���� ������ ���߷��� �õ��� Ƚ��
		// �ߺ� ���� �� ����
		do {
			for (int i = 0; i < com.length; i++) {
				com[i] = rnd.nextInt(9) + 1;
			}
		} while (overlap(com));
		// �����
		System.out.print("���� : ");
		for (int tmp : com) {
			System.out.print(tmp);
		} // for
		System.out.println();
		while (true) {
			for (int i = 0; i < user.length; i++) { // ���� �Է��� �� ����
				System.out.printf("��%d : ", i + 1);
				user[i] = sc.nextInt();
			} // for
			if(overlap(user)) { // Ȥ�� ������ �ߺ��� ���ڸ� �Է��ߴٸ� ��ȸ �������� �ٽ� ��ȸ�� ��
				System.out.println("�ߺ��� ���ڸ� �Է� �ϼ̾��. �ٽ� �Է����ּ���!");
				continue;
			}
			int[] strikeBall = strikeBall(com, user); // ���� �Է��� ���� ��ǻ�Ͱ� �� ������ ���� strike���� -> strikeball[0], ball���� -> strikeball[1]
			if (strikeBall[0] == size) { // ��� strike��� ���� ����� �ݺ��� ����������
				System.out.printf("%dȸ ���� ����!\n", count);
				break;
			} else {
				if (strikeBall[0] == 0 && strikeBall[1] == 0) { // �ƹ��͵� ������ ������ ��� out���
					System.out.print("out!");
				} else { // �ϳ��� ������ ��� �ش� strike, ball ������ ��� �� �ٽ� �ݺ�
					System.out.printf("strike = %d, ball = %d �Դϴ�.\n", strikeBall[0], strikeBall[1]);
				}
			} // if else 
			count++; // ���� ������ ���߷��� �õ��� Ƚ�� �ø���
			System.out.println("---------------");
		} // while
	} // main
	private static boolean overlap(int[] arr) { // ���� ���� �ߺ��� �ִ��� ������ �˻�
		boolean isOverlap = false;
		for (int i = 0; i < arr.length - 1; i++) { // arr.length C 2 ��ŭ ����, �ϳ��� �ߺ��� �߰� �ȴٸ� true ����
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return !isOverlap;
				}
			}
		}
		return isOverlap;
	}
	private static int[] strikeBall(int[] arr1, int[] arr2) { // strike�� ball���� ����
		int[] strikeBall = { 0, 0 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (i == j) {
					if (arr1[i] == arr2[j]) {
						strikeBall[0]++;
					}
				} else {
					if (arr1[i] == arr2[j]) {
						strikeBall[1]++;
					}
				}
			}
		}
		return strikeBall;
	}
}
