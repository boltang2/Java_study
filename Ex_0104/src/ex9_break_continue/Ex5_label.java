package ex9_break_continue;

public class Ex5_label {
	public static void main(String[] args) {
		// label: �ݺ����� �ĺ���(�̸�ǥ)�� �����ϴ� ����
		out : for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 10; j++) {
				if(j % 2 == 0) {
					break out; // ���� inner �ݺ����� �ƴ϶� out���� ������ outer �ݺ����� ���
				}
				System.out.printf("%d", j);
			}
			System.out.println();
		}
	}
}
