package ex8_runnable;

public class TMain {
	public static void main(String[] args) {
		 T1 r = new T1();
		 // Runnable�� �����ϰ� �ִ� �ڽ� Ŭ���� T1��
		 // �θ�κ��� start() �޼��带 ������ �� ����.
		 // runnableŬ������ �������̽��̱� ����.
		 Thread t = new Thread(r);
		 t.start(); // r�� run() �޼��尡 ��׶��忡�� ����
		 
	}
}
