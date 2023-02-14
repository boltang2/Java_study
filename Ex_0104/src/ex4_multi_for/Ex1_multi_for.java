package ex4_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {

		// 다중for문 : for문 안에 for문이 추가되어 있는 경우
		// 1 2 3
		// 1 2 3
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("-------------");

		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(j + (i * 3) + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		char a = 'A';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}
}
