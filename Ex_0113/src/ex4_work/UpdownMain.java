package ex4_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		Updown ud = new Updown();
		
		// 1 ~ 50 ������ ������ �߻���Ų��.
		// ����Ŭ�������� �������� �Է¹޴´�
		// �Է¹��� ���� UP, DOWN, ���������� �Ǵ�
		// ������ ��� mainŬ������ while���� ������������ ó��
		// Randon rnd = new Randon().nextInt(50) + 1;
		int correct = rnd.nextInt(50) + 1;
		ud.setCorrect(correct);
		
		while(true) {
			// up, down �� ����ó��
			// ������ ��� while���� ���� ������.
			System.out.print("������ �Է��ϼ���. >>");
			int ans = sc.nextInt();
			if(ud.isUpdown(ans)) break;
		}
	}
}
