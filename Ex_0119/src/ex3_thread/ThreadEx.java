package ex3_thread;

public class ThreadEx extends Thread {
	// ������� �ϳ��� ���α׷����� ���ÿ� ���������� ���μ����� ���ÿ�
	// ����� �� �ֵ��� �� �ִ� �������� �������(����)
	// ��, ��Ƽ�׽�ŷ�� �ϰ� ������ �����尡 �ʼ�
	@Override
	public void run() {
		// �������� ������ ���� ����
		for (int i = 0; i < 10; i++) {
			System.out.println("������ ������");
		}
	}
}
