package ex3_method;

public class Method1 {
	public void test1() {
		System.out.println("�ȳ��ϼ���.");
	}
	public int test2(int n) {
		n += 100;
		System.out.println("n : " + n);
		return n;
	}
	
	public String test3(String str, int n) {
		str = "����" + str + "�̰�" + n + "�Դϴ�.";
		return str;
	}
}
