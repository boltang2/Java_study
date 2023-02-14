package ex1_if;

public class Ex1_if {
	public static void main(String[] args) {
		// 제어문 : 프로그램의 흐름을 제어하는 문장
		// - 분기문 : if, switch
		// - 반복문 : for, while

		// if(조건식){조건식이 참일경우 실행}

		int n = 50;

		// String은 문자열을 저장가능한 자료형 (클래스)
		String str = "";

		if (n == 50) {
			// 조건식이 참일 때 실행되는 영역
			str = "n은 50입니다.";
		}

		if (n != 50) {
			str = "n은 50이 아닙니다.";
		}
		
		System.out.println(str);
	} // main
}
