package ex3_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		// 반복문 : 특정 수행문을 여어번 반복할 수 있도록 해주는 제어문
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		// for문에서 만들어진 지역변수 i는 for문의 소속이므로
		// for의 영역을 벗어나면 사용이 불가능
		// i = 10;
		
		int n = 0;
		for (n = 1; n <=3; n++) {
			System.out.println(n);
		}
		System.out.println("n : " + n);
		
		System.out.println("-----------------");
		
		for(int i = 10; i > 0; i--) {
			System.out.println("i : " + i);
		}
		
		System.out.println("-----------------");
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println("i : " + i);
			}
		}

	}
}
