package ex_operator;

import java.util.HashMap;

public class Ex2_operator {
	public static void main(String[] args) {

		// 비교 연산자
		// 값을 비교해서 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2; // < 작다 > 크다
		System.out.println("n1 < n2 : " + res);

		res = n1 >= n2;
		System.out.println("n1 >= n2 : " + res);

		res = n1 == n2;
		System.out.println("n1 == n2 : " + res);

		res = n1 != n2;
		System.out.println("n1 != n2 : " + res);

		// 논리 연산자
		// 비교 연산자를 통하 ㄴ연산이 두개 이상 필요할 때 사용
		int age = 30;
		int limit = 35;
		// and(&&) 연산자 : 앞의 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다.
		// t && t = t
		// t && f = f
		// f && t = f
		// f && f = f
		boolean res2 = (limit - age) >= 5 && age > 30;
		System.out.println("&& : " + res2);

		// or(||) 연산자 : 앞의 연산이 참이면 뒤쪽 연산을 수행하지 않는다.
		// t && t = t
		// t && f = f
		// f && t = f
		// f && f = f
		int i1 = 10;
		int i2 = 20;
		res2 = (i1 += 10) >= 20 || i2 - 10 == 11;
		System.out.println("|| : " + res2);
		HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
		System.out.println(a.get(1));

		// not(!) 연산자 : 참을 거짓으로 거짓을 참으로 바꿔주는 연산자
	} // main
}
