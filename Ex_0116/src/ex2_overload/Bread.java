package ex2_overload;

public class Bread {

	// �޼���1
	public void makeBread() {
		System.out.println("���� ��������");
	}

	// �޼��� 2
	public void makeBread(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("���� ��������");
		}
		System.out.println(n + "���� ���� ��������.");
	}

	// �޼��� 3
	public void makeBread(String s, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(s + "���� ��������ϴ�.");
		}
		System.out.printf("%d���� %s���� ��������.\n");
	}
}
