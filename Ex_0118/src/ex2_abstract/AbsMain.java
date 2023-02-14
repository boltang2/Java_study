package ex2_abstract;

public class AbsMain {
	public static void main(String[] args) {
		// 추상클래스는 직접적으로 메모리를 할당받는 것이 불가
		// 할당받으려면 오버라이딩 해야함
		AbsChild child = new AbsChild();
		child.setValue(10);
		
	}

}
