package ex9_break_continue;

public class Ex1_break {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j < 10; j++) {
				if(j % 2 == 0) {
					break;		
				}
				System.out.println(j);
			}
		}
	}
}
