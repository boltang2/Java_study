package ex_operator;

import java.util.HashMap;

public class Ex2_operator {
	public static void main(String[] args) {

		// �� ������
		// ���� ���ؼ� ���� ������ �Ǵ��ϴ� ������
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2; // < �۴� > ũ��
		System.out.println("n1 < n2 : " + res);

		res = n1 >= n2;
		System.out.println("n1 >= n2 : " + res);

		res = n1 == n2;
		System.out.println("n1 == n2 : " + res);

		res = n1 != n2;
		System.out.println("n1 != n2 : " + res);

		// �� ������
		// �� �����ڸ� ���� �������� �ΰ� �̻� �ʿ��� �� ���
		int age = 30;
		int limit = 35;
		// and(&&) ������ : ���� ������ �����̸� ���� ������ �������� �ʴ´�.
		// t && t = t
		// t && f = f
		// f && t = f
		// f && f = f
		boolean res2 = (limit - age) >= 5 && age > 30;
		System.out.println("&& : " + res2);

		// or(||) ������ : ���� ������ ���̸� ���� ������ �������� �ʴ´�.
		// t && t = t
		// t && f = f
		// f && t = f
		// f && f = f
		int i1 = 10;
		int i2 = 20;
		res2 = (i1 += 10) >= 20 || i2 - 10 == 11;
		System.out.println("|| : " + res2);
		HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
		System.out.println(a.get(1));

		// not(!) ������ : ���� �������� ������ ������ �ٲ��ִ� ������
	} // main
}
