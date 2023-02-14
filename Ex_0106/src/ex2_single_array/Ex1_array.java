package ex2_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		// 배열 : '같은 자료형'끼리 모아둔 하나의 묶음
		// 효율적인 자료관리를 위해 '반드시' 알고 있어야 하는 개념
		
		// 1) 배열 선언
		int[] arr;
		
		// 2) 배열 생성
		arr = new int[] {10,20,30,40};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
