package ex4_multi_thread;

public class TMain {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();

		t1.start(); // 1을 출력하는 run()메서드를 독립적으로 실행
		t2.start(); // 2을 출력하는 run()메서드를 독립적으로 실행
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("main스레드 끝");
	}
}
