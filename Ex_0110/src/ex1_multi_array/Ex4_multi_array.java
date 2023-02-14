package ex1_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {
		
		// 2차원 배열 arr에 담긴 모든 값의 합과 평균을 출력.
		// 총합 : 
		int[][] arr = { { 111, 2, 3, 4, 5 }, { 6, 5, 4, 3 }, { 1, 5, 7 }, { 1, 1 } };
		int count = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			count += arr[i].length;
			for(int j = 0; j < arr[i].length; j++) {
				//count++;
				sum += arr[i][j];
			}
		}
		
		System.out.printf("총 합 : %d \n평균  : %.1f", sum, (float) sum / count);
	} // main
}
