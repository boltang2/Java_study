package ex8_work;

public class Ex1_work {
	public static void main(String[] args) {

		// 2�� for���� ����Ͽ� �Ʒ��� ����� ����Ͻÿ�

		System.out.println("--------------------------");
		// 1)
		System.out.println("1)");
		int x = 5; // Ʈ�� ����
		int y = 2 * x - 1; // Ʈ�� �ʺ� ��ǻ� �ʿ� ����
		for (int i = 1; i <= x; i++) { // Ʈ�� ���̸�ŭ ����
			for (int j = 0; j < i * 2 - 1; j++) { // �ش� ���� ���� ���� ����� ����
				if (j % 2 == 0) { // �ε��� ���� ¦���̸� ��, Ȧ���̸� ���� ���
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		// 2)
		System.out.println("2)_1");
		int xx = 5; // Ʈ�� ����
		int yy = 2 * (2 * xx) - 3; // Ʈ�� �ʺ� 1) ���� ���� = 2xx - 1 2) ������ ���� = ���� ���� - 1
		int middle = (yy + 1) / 2; // Ʈ�� �߰� ��
		for (int i = 0; i < xx; i++) { // Ʈ�� ���̸�ŭ ����
			for (int j = 1; j <= yy; j++) { // Ʈ�� �߰� �� �߽����� �¿� + ���� ������ŭ �� ���
				if ((middle - i * 2) <= j && (middle + i * 2) >= j) {
					if (j % 2 == 1) { // �¿� �ε��� ���� ���� �ϴ� ��� �ε��� ���� Ȧ�� �̸� ���� ��� �� ���� �ݺ��� �ٷ� ���
						System.out.print("*");
						continue;
					}
				}
				System.out.print(" "); // �� �̿ܿ��� ���� ���
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		System.out.println("2)_2");
		for (int i = 1; i <= xx; i++) {
			for (int k = 0; k < (xx - i) * 2; k++) { // ���� �а�
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) { // �ش� ���̿� �ش� �Ǵ� �� ���
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println("--------------------------");

		// 2)
		System.out.println("2)_3");
		for (int i = 0; i < xx; i++) {
			for (int j = 0; j < xx + i; j++) {
				if (i + j > xx / 2 + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j < 5 + i; j++) {
				if (i + j > 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	} // main
}
