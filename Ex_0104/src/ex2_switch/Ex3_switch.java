package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		
		// 스위치문은 비교값으로 딱 세가지 타입만 사용이 가능
		// 정수(byte, int, short), 문자열(String), answk(char;5
		char c = '이';
		
		switch (c) {
		case '김':
			System.out.println("23%");
			break;
		case '이':
			System.out.println("14%");
			break;
		case '박':
			System.out.println("23%");
			break;

		default:
			break;
		}
	}
}
