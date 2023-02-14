package ex7_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		
		// do-while�� : �� ó��, �� ��
		// ����� �� �����ϰ� ;���� ���ξ�� �Ѵ�.
		// do {} while();
		
		int i = 11;
		do {
			System.out.println(i);
			i++;
		} while(i <= 20);
		
		System.out.println("--------------");
		
		// ���� java, jsp, android�� ��������
		// 0 ~ 130 ������ ���� ��´�.
		// do-while�� ���� �� ������ ������ ��� 0 ~ 100 ���� �϶���
		// while���� �������� �� ���� ���� ������ ���.
		
		Random rnd = new Random();
		
		// ���
		// �ڹ� : 92 ...
		int java = 0;
		int jsp = 0;
		int android = 0;
		do {
			java = rnd.nextInt(131);
			jsp = rnd.nextInt(131);
			android = rnd.nextInt(131);
		} while(!(java <= 100 && jsp <= 100 && android <= 100));
		
		System.out.printf("java : %d\njsp : %d\nandroid : %d\n", java, jsp, android);
	}
}
