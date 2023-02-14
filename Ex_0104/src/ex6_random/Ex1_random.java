package ex6_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {

		// 난수를 만들어주는 클래스 Random
		Random rnd = new Random();

		// 1 ~ 3 사이의 난수
		// rnd.nextInt(난수의 범위) + 시작수
		// rnd.nextInt(끝수 - 시작수 + 1) + 시작수
		int num = rnd.nextInt(4) + 2;
		System.out.println(num);
		
		System.out.println("----------------");
		
		char c = (char) (rnd.nextInt('Z' - 'A' + 1) + 'A'); 
		System.out.println("문자 : " + c);
	
	}
}
