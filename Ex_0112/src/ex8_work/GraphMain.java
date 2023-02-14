package ex8_work;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {
		/*
		 * 0~9 ������ ������ 100�� ���� ����
		 * 
		 * 111214124.....
		 * 0�� ����	: #### 4
		 * 1�� ����	: ##### 5
		 * ...
		 * 9�� ����	: ### 3
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
