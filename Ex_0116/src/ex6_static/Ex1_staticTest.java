package ex6_static;

public class Ex1_staticTest {

	String str1 = "�Ϲ� ��� ����";
	static String str2 = "����ƽ ����";

	public void test1() {
		// �Ϲ� �޼��忡���� static������ �Ϲݺ����� ��� ����� �� �ִ�.
		str1 = "hi";
		str2 = "hello";
		
		// �Ϲ� �޼��忡���� staticŰ���带 ���� ������ ���� �� ����.
		// static String str3 = "�ݰ�";
	}
	
	public static void test2() {
		// static �޼��忡���� �Ϲ� ��������� ����� �Ұ��� �ϴ�.
		// str1 = "hi";
		str2 = "hello";
		
		// ���������� �Ϲ� ������ ����ϴ� ���� ����
		int num = 100;
		
		// static �޼��忡���� static������ ���������� �����ϴ� ���� �Ұ��� �ϴ�.
		// static int num2 = 300;
	}
}
