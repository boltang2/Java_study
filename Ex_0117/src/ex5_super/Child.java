package ex5_super;

public class Child extends Parent {
	
	public Child() {
		super(10); // 부모 클래스
		super.name = "홍길동"; // 부모클래스의 변수로 접근
		System.out.println("child의 생성자 " + name);
	}
	@Override
	public void getMsg() {
		// TODO Auto-generated method stub
		super.getMsg();
		System.out.println("나는 자식");
	}
}
