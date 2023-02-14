package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// Ű���忡�� �Է¹��� �� ��ŭ�� ��� ���� ������ ������ �����
		// 1�� �ݵ�� 1�� ��� �� ����
		// (-1.1)���� �ö󰡼� ���� ���� �� ���� �迭�� �ʰ��� ��� ���ߵ���
		// n ����� ������ ���� ���� ������. (1,0) ����
		Scanner sc = new Scanner(System.in);
		int count = 1;
		String str = ""; // count�� ���Ŀ� ���� ��Ʈ������ ������ ����
		System.out.printf("������ ũ�⸦ �������ּ���(Ȧ��).");
		int n = sc.nextInt();
		int[][] ms = new int[n][n]; // ������
		int[] x = new int[n];
		int[] y = new int[n]; // ���� x,y��ǥ�� ��Ÿ�� -> (y[0],x[0]) �ش� �迭�� 0��° �ε��� ���� ���� ��ǥ�� ��Ÿ������.
		
		for (int i = 0; i < n; i++) { // ��ǥ �ʱ�ȭ ex) (n = 3) -> x = [0,1,2], y = [0,1,2]
			x[i] = i;
			y[i] = i;
		}
		
		for (int i = 0; i < n / 2; i++) { // count == 1 �ϋ� x��ǥ�� ��� ���� �����ϹǷ� �׸�ŭ x��ǥ�� �̵��� ex) (n = 3) -> x = [1,2,0]
			shiftLeft(x);
		}
		
		for (int i = 0; i < n; i++) { // ������ �Է�
			for (int j = 0; j < n; j++) {
				//System.out.printf("���� ��ǥ�� %d %d�̰� ���� count�� %d �Դϴ�.\n", y[0], x[0], count);
				ms[y[0]][x[0]] = count; // ���� ��ǥ�� �ش��ϴ� count�� ����
				if ((count) % n == 0 && count != 1) { // n�� ��� ���� ������ ��ǥ�� (1,0)����
					y = shiftLeft(y);
				} else { // �� �� ���� ��ǥ�� (-1,1)����
					y = shiftRight(y);
					x = shiftLeft(x);
				}
				count++;
			} // in for+
		} // out for
		
		for (int i = 0; i < n; i++) { // ������ ���
			for (int j = 0; j < n; j++) {
				System.out.printf("%02d\t", ms[i][j]);
			}
			System.out.println();
		}
		
	} // main
	
	private static int[] shiftLeft(int[] arr) { // ex [0,1,2,3,4] -> [1,2,3,4,0] ��ǥ �������� ����� �� ���
		int tmp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = tmp;
		return arr;
	}

	private static int[] shiftRight(int[] arr) { // ex [0,1,2,3,4] -> [4,0,1,2,3] ��ǥ �������� ������ �� ���
		int tmp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = tmp;
		return arr;
	}
}
