package ex4_interface;

public interface InterTest {
	// 인터페이스
	// 서비스 요청에 따른 중개자 역할을 하는 클래스
	
	// 인터페이스 내부에는 상수, 추상메서드만 추가가 가능
	
	// 상수는 한번 정해진 값으로 프로그램 종료까지 변하지 않는 수
	// 상수는 모두 대문자로 적어야함(약속)
	final int VALUE = 100;
	abstract int getVALUE();
}
