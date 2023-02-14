package ex3_method;

public class Method1 {
	public void test1() {
		System.out.println("안녕하세요.");
	}
	public int test2(int n) {
		n += 100;
		System.out.println("n : " + n);
		return n;
	}
	
	public String test3(String str, int n) {
		str = "저는" + str + "이고" + n + "입니다.";
		return str;
	}
}
