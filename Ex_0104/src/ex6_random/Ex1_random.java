package ex6_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {

		// ������ ������ִ� Ŭ���� Random
		Random rnd = new Random();

		// 1 ~ 3 ������ ����
		// rnd.nextInt(������ ����) + ���ۼ�
		// rnd.nextInt(���� - ���ۼ� + 1) + ���ۼ�
		int num = rnd.nextInt(4) + 2;
		System.out.println(num);
		
		System.out.println("----------------");
		
		char c = (char) (rnd.nextInt('Z' - 'A' + 1) + 'A'); 
		System.out.println("���� : " + c);
	
	}
}
