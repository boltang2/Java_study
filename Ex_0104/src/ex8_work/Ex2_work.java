package ex8_work;

public class Ex2_work {
	public static void main(String[] args) {
		// 2�� for���� ����Ͽ� �Ʒ��� ����� �����Ͻÿ�
		/*
		 * 1 2 3 4 5 6 7 8 9 10 
		 * 2 3 4 5 6 7 8 9 10 1 
		 * .... 
		 * 10 1 2 3 4 5 6 7 8 9
		 */
		int size = 12;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j + i == size) {
					System.out.print(size + " ");
				} else {
					System.out.print((j + i) % size + " "); 
				}
			}
			System.out.println();
		}
		
		// 1���� n������ �� ���� ����Ͻÿ�.
		int n = 10;
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			answer += i;
		}
		System.out.printf("(n = %d) --> %d\n",n, answer);
	} // main
}
