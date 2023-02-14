package ex8_work;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {
		/*
		 * 0~9 사이의 난수를 100개 만들어서 저장
		 * 
		 * 111214124.....
		 * 0의 갯수	: #### 4
		 * 1의 갯수	: ##### 5
		 * ...
		 * 9의 갯수	: ### 3
		 */
		Random rnd = new Random();
		Graph gra = new Graph();
		int[] random = new int[100];
		for(int i = 0; i < random.length; i++) {
			random[i] = rnd.nextInt(10);
		}
		int[] value = gra.coordinateValue(random);
		
		gra.showGraph(value);
		

	}
}
