package ex3_thread;

public class ThreadMain {
	public static void main(String[] args) {
		ThreadEx te = new ThreadEx();
		// start�޼��带 �̿��ϸ� run�޼��尡 ���������� ����ǰ� �����
		te.start();
		System.out.println("main������ ����");
	}
}
