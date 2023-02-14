package ex4_interface;

public class InterMain {
	public static void main(String[] args) {
		// 추상과 마찬가지로 완성이 덜 된 메서드가 포함되어 있으므로
		// 직접적인 메모리 할당은 불가
		// InterTest it = new InterTest();
		
		InterChild ic = new InterChild();
		System.out.println(ic.getVALUE());
	}
}
