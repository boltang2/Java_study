package ex7_thread_work;

public class WorkMain {
	public static void main(String[] args) {
//		1 ~ 100 ������ ���� �� ���� ���ϴ� ������ ����
//		Ű���忡�� ���� �Է��Ͽ� �ټ� ������ ����ó�� �� ������ �ڵ尡 �ݺ�
//		���������� �ټ������� ��� �����µ� ���ʰ� �ɷȴ��� ȭ�鿡 ����ϸ� �ڵ带 ����
//		
//		-----------------------------
//		20 + 15 = 35(�Է�)
//		����!
//		100 + 66 = 11
//		����...
//		61 + 51 = 112
//		����!
//		......
//      53 + 28 = 81;
//		����!
//		5������ ó���ϴµ� 24�ʰ� �ɷȽ��ϴ�
		
		PlusQuestion pq = new PlusQuestion();
		int answerCount = 5;
		pq.start();
		pq.howTime(answerCount);
	}
}
