package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		// ��Ӱ��Կ����� �ڽ�Ŭ������ �θ� ���� �ڿ�(�Ӽ�, �޼���)��
		// ������� �����ٰ� ����� �� �ִ�.
		Child c1 = new Child();
		Parent p1 = new Parent();
		
		// �θ��ڽ� ������ Ŭ������� �ص� private���� ������ ������
		// �ڽ��� ������ ���� ���Ѵ�.
		
		// child������ ���� parent�����ڰ� ���� ������
		
		// parent������ parent������ ������
		
		// instance�� ���� == �θ� �ڽ� �����̴�
		
		// �ڹٴ� ���ϻ�� �����̱� ������ �������� �θ� ������ �� ����.
		
		// Object��ü�� �ֻ��� Ŭ�����̱� ������ �׻� ���� ����
		
		//
		
		if(c1 instanceof Parent) System.out.println("�ν��Ͻ��� ����.");
	}
}
