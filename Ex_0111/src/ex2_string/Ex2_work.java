package ex2_string;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ű���忡�� �ƹ����̳� �Է¹ް� �ҹ��� a�� ������ ���
		System.out.println("1) Ű���忡�� �ƹ����̳� �Է¹ް� �ҹ��� a�� ������ ���");
		System.out.printf("�ƹ����� �Է��ϼ���. >> ");
		String str1 = sc.next();
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'a')
				count++;
		}
		System.out.printf("a�� ������ %d �Դϴ�\n", count);

		// ȸ�� �Ǵ��ϱ�
		// �� a1221a
		System.out.println("2) ȸ�� �Ǵ��ϱ�");
		System.out.print("���ڸ� �Է��ϼ���. >> ");
		String str2 = sc.next();
		count = 1;
		boolean isTrue = true;
		for (int i = 0; i < str2.length() / 2; i++) {
			if (str2.charAt(i) != str2.charAt(str2.length() - count)) {
				isTrue = false;
				break;
			}
			count++;
		}
		if (isTrue) {
			System.out.println("ȸ�� �Դϴ�.");
		} else {
			System.out.println("ȸ���� �ƴմϴ�.");
		}

		// �˻��� ���: song
		// [song]
		// ����
		// ����
		// ����
		// �˻��� ���: park
		// �ش� ���� �����ϴ�.
		System.out.println("3) ��� ��ȭ �����ϱ�");
		System.out.printf("��츦 �Է��ϼ���. >> ");
		boolean isNone = true;
		String str3 = sc.next();
		String[][] actor = { { "[song]", "����", "����", "����" }, { "[lee]", "��λ�", "�����ڵ�", "����" },
				{ "[ryu]", "��", "��������", "����" }, { "[jo]", "�����ڵ�", "����Ʈ����", "Ÿ¥" } };
		for(String[] act : actor) {
			if(act[0].substring(1, act[0].length() - 1).equalsIgnoreCase(str3)) {
				for(String movie : act) {
					System.out.println(movie);
				}
				isNone = false;
				break;
			}
		}
		if(isNone) {
			System.out.println("�ش� ��� ����");
		}

	}
}
