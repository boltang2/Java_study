package ex1_class;

public class Computer {
	
	// 컴퓨터를 만들기 위한 설계작업
	private String brand = "apple";
	int ssd = 256;
	int ram = 32;
	float cpu = 24.f;
	String color = "white";
	
	// 컴퓨터의 성능을 확인하기 위한 메서드(기능)
	// 메서드 : 반복적으로 사용되는 코드를 줄이기 위해서 만드는 영역
	
	public void getInfo() {
		System.out.println("brand : " + brand);
		System.out.println("ssd : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("cpu : " + cpu);
		System.out.println("color : " + color);
		System.out.println("-------------------");
	}
	
	// 메서드의 구성
	// 접근제한자 반환형 메서드 명 (파라미터(매개변수))
	// public void getinfo() { 메서드 호출 시 실행영역 }
	
	// 접근제한자 :
	// 1) public : 같은 프로젝트 내의 모든 객체들에게 사용을 허가
	// 2) private : 현재 클래스에서만 사용을 허가
	// 3) protected : 상속관계의 객체들에게만 사용을 허가
	// 4) default : 현재 패키지 내의 객체들에게 사용을 허가 (접근제한자 영역에 아무것도 아무것도 안쓰면 default 취급)
	
	
}
