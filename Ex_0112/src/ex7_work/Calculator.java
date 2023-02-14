package ex7_work;

public class Calculator {

	public void getResult(String s, int su1, int su2) {
		switch (s) {
		case "+":
			System.out.printf("%d %s %d = %d", su1, s, su2, (su1 + su2));
			break;
		case "-":
			System.out.printf("%d %s %d = %d", su1, s, su2, (su1 - su2));
			break;
		case "/":
			System.out.printf("%d %s %d = %d", su1, s, su2, (su1 / su2));
			break;
		case "*":
			System.out.printf("%d %s %d = %d", su1, s, su2, (su1 * su2));
			break;

		default:
			break;
		}
	}
	/*
	 * result = String.format("%d + %d = %d", n[0], n[1], n[0] + n[1]); -> ""안의 값이 스트링 형태로 반환됨.
	 */
}
