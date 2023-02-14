package ex8_runnable;

public class TMain {
	public static void main(String[] args) {
		 T1 r = new T1();
		 // Runnable을 구현하고 있는 자식 클래스 T1은
		 // 부모로부터 start() 메서드를 가져올 수 없다.
		 // runnable클래스가 인터페이스이기 때문.
		 Thread t = new Thread(r);
		 t.start(); // r의 run() 메서드가 백그라운드에서 실행
		 
	}
}
