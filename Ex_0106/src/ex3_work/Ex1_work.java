package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {
		System.out.println("01" + "02");

		// 선언과 생성을한줄로 표기할 수 있다.
		int[] arr = new int[] { 10, 24, 7, 16, 10 };
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);
	}
	

}
