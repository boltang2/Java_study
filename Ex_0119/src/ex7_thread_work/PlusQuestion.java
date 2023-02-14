package ex7_thread_work;

import java.util.Random;
import java.util.Scanner;

public class PlusQuestion extends Thread {

	private int totalTime = 0; // �ɸ��ð��� �����ϴ� ����
	private boolean exit = true;
	private Random rnd = new Random(); // �� ���� 0 ~ 100������ ������ ������ ���� Ŭ����
	private Scanner sc = new Scanner(System.in);
	
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

	@Override
	public void run() { // �ð� ���� ������ �޼���
		int second = 0;
		try {
			while(exit) { // exit�� false�� �ɶ����� ��, ���� ������ �� ���⶧���� ���ѹݺ��ϸ鼭 sec�� �ø�
				Thread.sleep(1000); 
				second++;
			}
		} catch (Exception e) {
			
		}
		setTotalTime(second); // �ݺ��� ������ ���� �����ϰ� ���
		System.out.printf("������ ���ߴµ� %d�ʰ� �ɷȽ��ϴ�.", totalTime);
	}

	public int[] randomNumbers() { // �� ���� 0 ~ 100������ ������ ������ ����
		int ran1 = rnd.nextInt(101);
		int ran2 = rnd.nextInt(101);
		return new int[] {ran1, ran2};	
	}

	public int questionCount(int[] ranNumbers, int count) { // ���� ������ ���߸� count + 1 ���� �ƴϸ� count����
		int answer = ranNumbers[0] + ranNumbers[1];
		int reply = -1;
		while(true) { // Ȥ�� ���ڿ� �ٸ� Ÿ���� �Է������� ��ȸ�� �ѹ� ����.
			try {
				System.out.printf("%d + %d = ", ranNumbers[0], ranNumbers[1]);
				reply = new Scanner(System.in).nextInt();
				break;
			} catch (Exception e) {
				System.out.println("���ڸ� �ٽ� �Է����ּ���.");
			}
		}
		if(answer == reply) { // �����̶�� count++
			System.out.println("����!");
			count++;
		} else { // �ƴ϶�� count �״��
			System.out.println("����..");
		}
		
		return count;
	}
	
	public void howTime (int answerCount) { // ���� ���� ����
		int count = 0; // ���� ���� ���� ����
		while(answerCount > count) { // ���� ������ ���� ������ �����Ҷ� ���� ����
			count = questionCount(randomNumbers(),count); // ���� �μ��� �迭�� �Ѱ� count�� ����
		}
		setExit(false); // ������ �������� exit�غ�
	}

}
