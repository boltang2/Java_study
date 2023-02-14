package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {

		// 2) 디모션
		// - 작은 자료형에 큰 자료형이 대입되는 것(자동 x)
		char c = 'C'; // 2byte
		int n = c + 1; // 4byte
		c = (char) n;
		System.out.println(c);
		
		float ff = 5.5f;
		n = 0;
		n = (int) ff;
		System.out.println(n);
	} // main
}
