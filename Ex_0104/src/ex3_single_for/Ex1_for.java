package ex3_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		// �ݺ��� : Ư�� ���๮�� ����� �ݺ��� �� �ֵ��� ���ִ� ���
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		// for������ ������� �������� i�� for���� �Ҽ��̹Ƿ�
		// for�� ������ ����� ����� �Ұ���
		// i = 10;
		
		int n = 0;
		for (n = 1; n <=3; n++) {
			System.out.println(n);
		}
		System.out.println("n : " + n);
		
		System.out.println("-----------------");
		
		for(int i = 10; i > 0; i--) {
			System.out.println("i : " + i);
		}
		
		System.out.println("-----------------");
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println("i : " + i);
			}
		}

	}
}
