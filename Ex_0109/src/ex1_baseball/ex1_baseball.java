package ex1_baseball;
import java.util.Random;
import java.util.Scanner;

public class ex1_baseball {
	public static void main(String[] args) {
		/*
		 * 1~9중에 겹치지 않도록 숫자 세개를 만들어서 컴퓨터만 알고있는다
		 * 
		 * ex com: 358
		 * 
		 * 수1 : 1 수2 : 2 수3 : 3
		 * 
		 * --> 0 strike 1 ball
		 * 
		 * 수1 : 4 수2 : 5 수3 : 6
		 * 
		 * --> 1 strike 0 ball
		 * 
		 * 수1 : 3 수2 : 8 수3 : 5
		 * 
		 * --> 1 strike 2 ball
		 * 
		 * 일치하는게 한개도 없다면 out 모두 일치한다면 3 strike
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

		System.out.println("정답  : " + com1 + com2 + com3);

		while (true) {
			// 정답이라고 생각하는 세 자리의 수를 입력받는다.
			System.out.print("수1 : ");
			u1 = sc.nextInt();
			System.out.print("수2 : ");
			u2 = sc.nextInt();
			System.out.print("수3 : ");
			u3 = sc.nextInt();

			// strike와 ball 갯수를 저장할 변수
			int strike = 0;
			int ball = 0;

			// 정답 처리를 위한 경우의 수
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
				System.out.printf("%d회 만에 정답!\n", count);
				break;
			} else {
				if (strike == 0 && ball == 0) {
					System.out.println("out!");
				} else {
					System.out.printf("strike = %d, ball = %d 입니다.\n", strike, ball);
				}
			}
			count++;
			System.out.println("---------------------------");
		} // while
	}
}
