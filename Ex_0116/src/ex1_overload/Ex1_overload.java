package ex1_overload;

public class Ex1_overload {
	// 매서드 오버로딩
	// 오버로딩은 메서드의 중복정의

	// 1) 메서드의 인자의 갯수가 달라야 한다.
	// 2) 인자의 수가 같다면 타입이 달라야 한다.
	// 3) 인자의 수와 타입이 같아도, 인자의 순서가 달라야 한다.
	public void result() {
		System.out.println("인자가 없는 메서드");
	}

	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}

	public void result(char c) {
		System.out.println("문자를 인자로 받는 메서드");
	}

	public void result(String s, int n) {
		System.out.println("문자열과 숫자를 인자로 받는 메서드");
	}

	public void result(int n, String s) {
		System.out.println("숫자와 문자열을 인자로 받는 메서드");
	}
}
