package ex5_super;

public class Child extends Parent {
	
	public Child() {
		super(10); // �θ� Ŭ����
		super.name = "ȫ�浿"; // �θ�Ŭ������ ������ ����
		System.out.println("child�� ������ " + name);
	}
	@Override
	public void getMsg() {
		// TODO Auto-generated method stub
		super.getMsg();
		System.out.println("���� �ڽ�");
	}
}
