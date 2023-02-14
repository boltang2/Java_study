package ex3_work;

import java.util.Random;

public class Ex2_lotto {
	public static void main(String[] args) {

		// 1 ~ 45 ������ �ߺ����� �ʴ� ���� 6���� ����� lotto�迭�� ���
		// ���������� lotto�迭�� ��� ������ ����Ͻÿ�.
		int[] num = new int[45]; // �ζ� 45�� ����
		int[] lotto = new int[6];

		Random rnd = new Random();

		for (int i = 0; i < num.length; i++) { // �ζ� �ʱ�ȭ
			num[i] = i + 1;
		} // for

		for (int i = 0; i < 6; i++) {
			while (true) {
				int tmp = rnd.nextInt(num.length); // �ζǿ� ���� ����
				if (num[tmp] != 0) { // �ߺ��� �ƴ϶�� �ش� ���ڸ� �ζǹ迭�� ���� �� �ߺ� ���Ÿ� ���� �ش� num�� index���� 0���� ����.
					lotto[i] = num[tmp];
					num[tmp] = 0;
					break;
				}
			} // while
		} // for
		
		System.out.print("������ �ζ� ��÷ ��ȣ : ");
		for (int tmp : lotto) { // �ζ� ���
			System.out.print(tmp + " ");
		} // for
	} // main
}
