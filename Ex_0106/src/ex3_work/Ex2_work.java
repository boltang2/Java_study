package ex3_work;

import java.util.Arrays;

public class Ex2_work {
	public static void main(String[] args) {

		int[] arr = new int[] { 4, 12, 24, 45, 222, 111 };
		
		//Arrays.sort(arr);
		
		System.out.println(arr[arr.length - 1]);
		
		// arr이 가진 값을 오름차순으로 정렬
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int tmp : arr) {
			System.out.println(tmp);
		}
	}
}
