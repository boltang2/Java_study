package ex3_work;

public class Ex4_work {
	public static void main(String[] args) {
		int num = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
	}
}
