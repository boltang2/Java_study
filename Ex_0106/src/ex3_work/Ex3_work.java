package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// Ű���忡�� ���� ���� �Է� �ް�, �Է¹��� ���ڰ� �Ҽ����� �Ǵ��Ͻÿ�

		Scanner sc = new Scanner(System.in);

		// �� Ű���忡�� 1�� �޾ҾƸ� '�Ҽ��� �ƴ�'�� ����ؾ� �Ѵ�.

		System.out.print("��� ���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.printf("%d�� �Ҽ��� �ƴ�", num);
		} else {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.printf("%d�� �Ҽ� �Դϴ�.", num);
			} else {
				System.out.printf("%d�� �Ҽ��� �ƴ�", num);
			}
		}
	}
}
