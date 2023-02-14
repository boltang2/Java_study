package ex2_exception;

public class Ex2_TryCatch {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };
		
		// 코드를 수정해서 오류가 해결되는 부분은 try catch를 쓸 이유가 없다
		// 강제로 try catch안에 넣어야만 실행되는 코드가 있는데 그런 경우만 사용
		try {
			
			for(int i = 0; i <= arr.length; i++) {
				System.out.printf("%d", arr[i]);
			}

		} catch (Exception e) {

		}
		
		System.out.println("\n프로그램 종료");
	}
}
