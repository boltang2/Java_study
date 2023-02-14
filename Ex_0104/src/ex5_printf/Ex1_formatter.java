package ex5_printf;

public class Ex1_formatter {
	public static void main(String[] args) {

		// 포맷터 : 사용할 데이터의 결과를 원하는 구조로 출력 가능하게 해주는 문법

		// 오늘은 23년 01월 05일 입니다.

		int y = 23;
		int m = 1;
		int d = 5;

		System.out.println("오늘은 " + y + "년 " + m + "월 " + d + "일 입니다.");
		System.out.printf("오늘은 %d년 %02d월 %02d일 입니다.\n", y, m, d); // %0n -> n자리수 확보해줌.

		// 오늘의 날씨는 13.5도 입니다.
		float f = 13.5f;
		System.out.printf("오늘의 날씨는 %.1f도 입니다.\n", f); // .n -> 소수점 n자리수 까지만 출력

		
		// 저는 A형입니다.
		char c = 'A';
		System.out.printf("저는 %c형 입니다.\n", c);
		
		// 저는 홍길동입니다.
		String str = "홍길동";
		System.out.printf("저는 %s입니다.\n", str);
		
		// 오늘은 100%이해 했습니다.
		System.out.printf("%d%%이해 했습니다.\n", 100);

		// 1) %d : int
		// 2) %f : float, double
		// 3) %c : char
		// 4) %s : String
		// 5) %% : %

	}
}
