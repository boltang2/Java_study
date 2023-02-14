package ex2_exception;

public class Ex1_TryCatch {
	public static void main(String[] args) {

		int result = 0;
		int[] arr = new int[3];

		try {
			result = 10 / 2;
			arr[2] = 1;
			// 오류나면 try구간 남은 코드는 실행하지않고
			// 바로 catch로 넘어감
			// 고로 오류구문은 하나만 가능
			System.out.println("오류없음");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Exception은 모든 오류종류의 부모
			// try영역에서 오류가 발생하면
			// 반드시 catch구문을 실행한다.
			// 1)
			// e.printStackTrace();
			// 2)
			System.out.println("배열의 존재하지 않는 index에 접근했습니다.");

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			// try영역에서의 예외발생여부와 관계 없이
			// 무조건 실행 되는 영역
			System.out.println("finally");
		}

		System.out.println("결과 : " + result);

		// try-catch(예외처리) : 프로그램 실행중 예외(오류, 에러...)
		// 그 시점에서 프로그램이 강제적으로 종효된다.
		// 때로는 예상 가능한 오류에 대해 예외가 발생해도 이를 무시하거나 수정하여
		// 계속 코드를 진행해야 할 때가 있다.
		// 예외처리 기법을 통해 프로그램의 비 정상적인 종료를 줄여보자!!

	}
}
