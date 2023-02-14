package ex3_method;

import java.util.HashSet;

public class MetMain {
	public static void main(String[] args) {
		Method1 m1 = new Method1();
		m1.test1();
		int su = 100;
		su = m1.test2(su);
		System.out.println("su : " + su);
		String res = m1.test3("ȫ�浿", 20);
		System.out.println(res);
	}
}
