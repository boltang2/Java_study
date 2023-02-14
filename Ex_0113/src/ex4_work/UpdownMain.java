package ex4_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		Updown ud = new Updown();
		
		// 1 ~ 50 사이의 난수를 발생시킨다.
		// 메인클래스에서 정수값을 입력받는다
		// 입력받은 값이 UP, DOWN, 정답인지를 판다
		// 정답일 경우 main클래스의 while문을 빠져나가도록 처리
		// Randon rnd = new Randon().nextInt(50) + 1;
		int correct = rnd.nextInt(50) + 1;
		ud.setCorrect(correct);
		
		while(true) {
			// up, down 및 정답처리
			// 정답인 경우 while문을 빠져 나간다.
			System.out.print("정답을 입력하세요. >>");
			int ans = sc.nextInt();
			if(ud.isUpdown(ans)) break;
		}
	}
}
