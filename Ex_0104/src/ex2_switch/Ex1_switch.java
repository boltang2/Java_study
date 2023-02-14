package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		// switch-case : 비교값과 조건값을 통해 결과를 처리하는 제어문
		// switch(비교값) {
		// case 조건값 :
		// 비교값과 조건값이 일치하는 실행되는 영역
		// break;
		// }
		int n = 2;

		switch (n) {
		case 1: // 조건값(조건값의 타입은 비교값과 반드시 일치해야 한다.)
			System.out.println("1. 게임시작");
			break;
		case 2:
			System.out.println("2. 게임소개");
			break;
		case 3:
			System.out.println("3. 옵션");
			break;
		default: // 비교값과 조건값이 모두 일치하지 않을경우
			     // 반드시 실행되는 영역
			System.out.println("1, 2, 3중에서만 ㅅㅇㄱ");
			break;
		}
	} // main
}
