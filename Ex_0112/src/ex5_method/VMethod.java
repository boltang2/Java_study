package ex5_method;

public class VMethod {
	// 갯수의 제한이 없는 파라미터 사용이 가능
	public void v_test(int...n) {
		// n = {1,10}
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
}
