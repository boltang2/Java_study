package ex8_work;

public class Ex2_work {
	public static void main(String[] args) {
		// 2중 for문을 사용하여 아래의 결과를 도출하시오
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
		
		// 1부터 n까지의 총 합을 출력하시오.
		int n = 10;
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			answer += i;
		}
		System.out.printf("(n = %d) --> %d\n",n, answer);
	} // main
}
