package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		// 상속관게에서의 자식클래스는 부모가 가진 자원(속성, 메서드)를
		// 마음대로 가져다가 사용할 수 있다.
		Child c1 = new Child();
		Parent p1 = new Parent();
		
		// 부모자신 관계의 클래스라고 해도 private으로 지정된 변수를
		// 자식은 가져다 쓰지 못한다.
		
		// child생성자 보다 parent생성자가 먼저 생섬됨
		
		// parent생성시 parent영역만 생성됨
		
		// instance가 같다 == 부모 자식 관계이다
		
		// 자바는 단일상속 구조이기 때문에 여러면의 부모가 존재할 수 없다.
		
		// Object객체는 최상위 클래스이기 때문에 항상 먼저 생성
		
		//
		
		if(c1 instanceof Parent) System.out.println("인스턴스가 같다.");
	}
}
