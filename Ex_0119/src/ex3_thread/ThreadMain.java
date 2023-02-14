package ex3_thread;

public class ThreadMain {
	public static void main(String[] args) {
		ThreadEx te = new ThreadEx();
		// start메서드를 이용하면 run메서드가 독립적으로 실행되게 만든다
		te.start();
		System.out.println("main스레드 종료");
	}
}
