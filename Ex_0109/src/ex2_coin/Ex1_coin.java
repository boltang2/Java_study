package ex2_coin;

import java.util.Random;

public class Ex1_coin {
	public static void main(String[] args) {
		// 변수 money에 10 ~ 5000까지의 난수를 만들어 넣는다
		// 단, 1의자리 숫자는 반드시 0으로 만들어 지도록 한다.
		// 발생된 난수 money를 동전으로 바꿨을 때,
		// 500원, 100원, 50원, 10원짜리 동전이 각각 몇개 거슬러 지는지 판단하는 코드를 구현
		// 단, 가능한 한 적은 수의 동전으로 거슬러 줄 것.

		int[] coin = { 500, 100, 50, 10 };
		Random rnd = new Random();
		int money = (rnd.nextInt(500) + 1) * 10;

		System.out.printf("현재 %d원 있습니다.\n", money);

		for (int i = 0; i < coin.length; i++) {
			int much = money / coin[i];
			System.out.printf("%d원 : %d개\n", coin[i], much);
			money -= much * coin[i];
		}

	}
}
