package ex5_method;

public class VMethod {
	// ������ ������ ���� �Ķ���� ����� ����
	public void v_test(int...n) {
		// n = {1,10}
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
}
