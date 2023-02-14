package ex4_method;

public class Ex1_paramMain {
	public static void main(String[] args) {
		Ex1_param e1 = new Ex1_param();
		String str = "안녕";
		e1.test1(str);
		System.out.println("main : " + str);
		int[] arr = { 1, 2, 3 };
		e1.test2(arr);
		
		// 객체 형태 값을 파라미타로 넘기면 복사본이 아니라 주소값을 넘김.
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------");
	}
}
