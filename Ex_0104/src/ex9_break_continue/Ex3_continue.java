package ex9_break_continue;

public class Ex3_continue {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j % 2 == 0) {
					continue;
				}
				System.out.println(j);
			}
		}
	}
}
