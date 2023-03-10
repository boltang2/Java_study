package ex8_work;

public class Ex1_work {
	public static void main(String[] args) {

		// 2중 for문을 사용하여 아래의 결과를 출력하시오

		System.out.println("--------------------------");
		// 1)
		System.out.println("1)");
		int x = 5; // 트리 높이
		int y = 2 * x - 1; // 트리 너비 사실상 필요 없음
		for (int i = 1; i <= x; i++) { // 트리 높이만큼 진행
			for (int j = 0; j < i * 2 - 1; j++) { // 해당 높이 에서 별을 출력할 갯수
				if (j % 2 == 0) { // 인덱스 값이 짝수이면 별, 홀수이면 공백 출력
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		// 2)
		System.out.println("2)_1");
		int xx = 5; // 트리 높이
		int yy = 2 * (2 * xx) - 3; // 트리 너비 1) 별의 갯수 = 2xx - 1 2) 공백의 갯수 = 별의 갯수 - 1
		int middle = (yy + 1) / 2; // 트리 중간 값
		for (int i = 0; i < xx; i++) { // 트리 높이만큼 진행
			for (int j = 1; j <= yy; j++) { // 트리 중간 값 중심으로 좌우 + 높이 갯수만큼 별 출력
				if ((middle - i * 2) <= j && (middle + i * 2) >= j) {
					if (j % 2 == 1) { // 좌우 인덱스 값을 만족 하는 경우 인덱스 값이 홀수 이면 별을 출력 후 다음 반복문 바로 재생
						System.out.print("*");
						continue;
					}
				}
				System.out.print(" "); // 그 이외에는 공백 출력
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		System.out.println("2)_2");
		for (int i = 1; i <= xx; i++) {
			for (int k = 0; k < (xx - i) * 2; k++) { // 먼저 밀고
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) { // 해당 높이에 해당 되는 별 출력
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println("--------------------------");

		// 2)
		System.out.println("2)_3");
		for (int i = 0; i < xx; i++) {
			for (int j = 0; j < xx + i; j++) {
				if (i + j > xx / 2 + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j < 5 + i; j++) {
				if (i + j > 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	} // main
}
