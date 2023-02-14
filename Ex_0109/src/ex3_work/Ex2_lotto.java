package ex3_work;

import java.util.Random;

public class Ex2_lotto {
	public static void main(String[] args) {

		// 1 ~ 45 사이의 중복되지 않는 난수 6개를 만들어 lotto배열에 담고
		// 최종적으로 lotto배열에 담긴 값들을 출력하시오.
		int[] num = new int[45]; // 로또 45개 숫자
		int[] lotto = new int[6];

		Random rnd = new Random();

		for (int i = 0; i < num.length; i++) { // 로또 초기화
			num[i] = i + 1;
		} // for

		for (int i = 0; i < 6; i++) {
			while (true) {
				int tmp = rnd.nextInt(num.length); // 로또에 넣을 숫자
				if (num[tmp] != 0) { // 중복이 아니라면 해당 숫자를 로또배열에 넣은 후 중복 제거를 위해 해당 num의 index값을 0으로 만듬.
					lotto[i] = num[tmp];
					num[tmp] = 0;
					break;
				}
			} // while
		} // for
		
		System.out.print("금주의 로또 당첨 번호 : ");
		for (int tmp : lotto) { // 로또 출력
			System.out.print(tmp + " ");
		} // for
	} // main
}
