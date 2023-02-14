package ex9_break_continue;

public class Ex6_label {
	public static void main(String[] args) {
		label : for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if(j % 2 == 0) {
					continue label; // 기존 inner 반복문이 아니라 out으로 지정한 outer 반복문을 벗어남
				}
				System.out.printf("%d", j);
			}
			System.out.println();
		}
	}
}
