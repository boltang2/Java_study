package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		// ĳ����(����ȯ)
		// ���� �ٸ� �ڷ��� ���� ���� �ְ�ޱ� ���� ����(����)
		
		// 1) ���θ��
		// - ū �ڷ����� ���� �ڷ����� �����ϴ� ��(�ڵ�)
		double d = 100.5; // 8byte
		int n = 200; // 4byte
		d = n;
		System.out.println(d);
		
		char c = 'a'; // 2byte
		int n1 = 100; // 4byte
		n1 = c;
		System.out.println(n1);
		
	} // main
}
