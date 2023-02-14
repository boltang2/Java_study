package ex5_printf;

public class Ex1_formatter {
	public static void main(String[] args) {

		// ������ : ����� �������� ����� ���ϴ� ������ ��� �����ϰ� ���ִ� ����

		// ������ 23�� 01�� 05�� �Դϴ�.

		int y = 23;
		int m = 1;
		int d = 5;

		System.out.println("������ " + y + "�� " + m + "�� " + d + "�� �Դϴ�.");
		System.out.printf("������ %d�� %02d�� %02d�� �Դϴ�.\n", y, m, d); // %0n -> n�ڸ��� Ȯ������.

		// ������ ������ 13.5�� �Դϴ�.
		float f = 13.5f;
		System.out.printf("������ ������ %.1f�� �Դϴ�.\n", f); // .n -> �Ҽ��� n�ڸ��� ������ ���

		
		// ���� A���Դϴ�.
		char c = 'A';
		System.out.printf("���� %c�� �Դϴ�.\n", c);
		
		// ���� ȫ�浿�Դϴ�.
		String str = "ȫ�浿";
		System.out.printf("���� %s�Դϴ�.\n", str);
		
		// ������ 100%���� �߽��ϴ�.
		System.out.printf("%d%%���� �߽��ϴ�.\n", 100);

		// 1) %d : int
		// 2) %f : float, double
		// 3) %c : char
		// 4) %s : String
		// 5) %% : %

	}
}
