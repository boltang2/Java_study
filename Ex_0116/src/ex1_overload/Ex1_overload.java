package ex1_overload;

public class Ex1_overload {
	// �ż��� �����ε�
	// �����ε��� �޼����� �ߺ�����

	// 1) �޼����� ������ ������ �޶�� �Ѵ�.
	// 2) ������ ���� ���ٸ� Ÿ���� �޶�� �Ѵ�.
	// 3) ������ ���� Ÿ���� ���Ƶ�, ������ ������ �޶�� �Ѵ�.
	public void result() {
		System.out.println("���ڰ� ���� �޼���");
	}

	public void result(int n) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}

	public void result(char c) {
		System.out.println("���ڸ� ���ڷ� �޴� �޼���");
	}

	public void result(String s, int n) {
		System.out.println("���ڿ��� ���ڸ� ���ڷ� �޴� �޼���");
	}

	public void result(int n, String s) {
		System.out.println("���ڿ� ���ڿ��� ���ڷ� �޴� �޼���");
	}
}
