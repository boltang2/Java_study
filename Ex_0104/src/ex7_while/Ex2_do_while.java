package ex7_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		
		// do-while문 : 선 처리, 후 비교
		// 제어문들 중 유일하게 ;으로 끝맺어야 한다.
		// do {} while();
		
		int i = 11;
		do {
			System.out.println(i);
			i++;
		} while(i <= 20);
		
		System.out.println("--------------");
		
		// 변수 java, jsp, android에 랜덤으로
		// 0 ~ 130 사이의 값을 담는다.
		// do-while을 통해 세 과목의 점수가 모두 0 ~ 100 사이 일때만
		// while문을 빠져나와 각 과목별 랜덤 성적을 출력.
		
		Random rnd = new Random();
		
		// 결과
		// 자바 : 92 ...
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
