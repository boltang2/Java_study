package ex1_baseball;
import java.util.Random;
import java.util.Scanner;

public class ex1_baseball {
	public static void main(String[] args) {
		/*
		 * 1~9�߿� ��ġ�� �ʵ��� ���� ������ ���� ��ǻ�͸� �˰��ִ´�
		 * 
		 * ex com: 358
		 * 
		 * ��1 : 1 ��2 : 2 ��3 : 3
		 * 
		 * --> 0 strike 1 ball
		 * 
		 * ��1 : 4 ��2 : 5 ��3 : 6
		 * 
		 * --> 1 strike 0 ball
		 * 
		 * ��1 : 3 ��2 : 8 ��3 : 5
		 * 
		 * --> 1 strike 2 ball
		 * 
		 * ��ġ�ϴ°� �Ѱ��� ���ٸ� out ��� ��ġ�Ѵٸ� 3 strike
		 */

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int com1, com2, com3;
		int u1, u2, u3;
		int count = 1;

		do {
			com1 = rnd.nextInt(9) + 1;
			com2 = rnd.nextInt(9) + 1;
			com3 = rnd.nextInt(9) + 1;
		} while (com1 == com2 || com1 == com3 || com2 == com3);

		System.out.println("����  : " + com1 + com2 + com3);

		while (true) {
			// �����̶�� �����ϴ� �� �ڸ��� ���� �Է¹޴´�.
			System.out.print("��1 : ");
			u1 = sc.nextInt();
			System.out.print("��2 : ");
			u2 = sc.nextInt();
			System.out.print("��3 : ");
			u3 = sc.nextInt();

			// strike�� ball ������ ������ ����
			int strike = 0;
			int ball = 0;

			// ���� ó���� ���� ����� ��
			if (u1 == com1) {
				strike++;
			} else if (u1 == com2 || u1 == com3) {
				ball++;
			}
			if (u2 == com2) {
				strike++;
			} else if (u2 == com1 || u2 == com3) {
				ball++;
			}
			if (u3 == com3) {
				strike++;
			} else if (u3 == com1 || u3 == com2) {
				ball++;
			}
			if (strike == 3) {
				System.out.printf("%dȸ ���� ����!\n", count);
				break;
			} else {
				if (strike == 0 && ball == 0) {
					System.out.println("out!");
				} else {
					System.out.printf("strike = %d, ball = %d �Դϴ�.\n", strike, ball);
				}
			}
			count++;
			System.out.println("---------------------------");
		} // while
	}
}
