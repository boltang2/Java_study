package ex2_coin;

import java.util.Random;

public class Ex1_coin {
	public static void main(String[] args) {
		// ���� money�� 10 ~ 5000������ ������ ����� �ִ´�
		// ��, 1���ڸ� ���ڴ� �ݵ�� 0���� ����� ������ �Ѵ�.
		// �߻��� ���� money�� �������� �ٲ��� ��,
		// 500��, 100��, 50��, 10��¥�� ������ ���� � �Ž��� ������ �Ǵ��ϴ� �ڵ带 ����
		// ��, ������ �� ���� ���� �������� �Ž��� �� ��.

		int[] coin = { 500, 100, 50, 10 };
		Random rnd = new Random();
		int money = (rnd.nextInt(500) + 1) * 10;

		System.out.printf("���� %d�� �ֽ��ϴ�.\n", money);

		for (int i = 0; i < coin.length; i++) {
			int much = money / coin[i];
			System.out.printf("%d�� : %d��\n", coin[i], much);
			money -= much * coin[i];
		}

	}
}
