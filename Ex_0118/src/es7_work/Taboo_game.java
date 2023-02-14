package es7_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Taboo_game extends WordSet {

	private Random rnd = new Random();
	private Scanner sc = new Scanner(System.in);

	public Taboo_game(String[] wordSet) {
		super(wordSet);
	}

	@Override
	public String randomWord() { // wordSet �迭���� �������� �ܾ ������
		int index = rnd.nextInt(getWordSet().length);
		return getWordSet()[index];
	}

	@Override
	public String rearrange(String word) {
		String reword = ""; // ��迭�� ���ڵ��� ��ģ �ܾ�
		String[] wordArr = word.split("");

		// ������ ������ �������� ���� ����
		// i = 0 ���� ���� Ž���ϸ鼭 �������� index�� ������ reword�� wordArr[index]�� �߰���Ű��
		// wordArr[i] �� wordArr[index]�� ����
		for (int i = 0; i < wordArr.length; i++) {
			// �ش繮�ڰ� ������ �ƴ϶�� ����
			if (!wordArr[i].equals(" ")) {
				int index; // �������� ���� index��
				String tmp = wordArr[i]; // �ӽ� ����
				// �ش� �ε��� ���� ������ �ƴ� ���ڸ� ã���� ����
				while (true) {
					index = rnd.nextInt(wordArr.length - i) + i;
					if (!wordArr[index].equals(" ")) {
						break;
					}
				}
				// ������ reword�� �߰�
				wordArr[i] = wordArr[index];
				wordArr[index] = tmp;
				reword += wordArr[i];
				// �ش繮�ڰ� �����̶�� ���� �״�� �߰�
			} else {
				reword += wordArr[i];
			}
		}

		return reword;

//		��¥ ����û�ϰ� ®�� �̰�..
//		int maxRandomIndex = word.length();
//		ArrayList<Integer> dupli = new ArrayList<>(); // �̹� ���� �ε����� �����س� �迭
//		char[] rewordArr = new char[maxRandomIndex]; // ��迭�� ���� �迭
//
//		// ������ġ�� �ܾ������ �ٲ� �״�� �־� �ϹǷ� ������ġ�� �����ϰ� �д�.
//		for (int i = 0; i < word.length(); i++) {
//			if (word.charAt(i) == ' ') {
//				rewordArr[i] = ' ';
//				dupli.add(i);
//			}
//		}
//
//		// word�� 0��° �ε������� ������ Ž���� ������ �ߺ����� �� reword�� ����.
//		// ������ -> reword�ε���
//		for (int i = 0; i < word.length(); i++) { // word ��ü Ž��
//			if (word.charAt(i) == ' ')
//				continue;
//			loop: while (true) { // word.charAt(i) -> reword[index]�� ����
//				int index = rnd.nextInt(maxRandomIndex);
//				for (int j = 0; j < dupli.size(); j++) { // �̾Ҵ� index ����
//					if (dupli.get(j) == index) { // ���� �ߺ��� Ȯ�εǸ� �ٽ� ����
//						continue loop;
//					}
//				}
//				rewordArr[index] = word.charAt(i); // �ߺ��� ���ٸ� �ش� �ε����� ���� ���� ����
//				dupli.add(index); // ���� �� �ε������� �ٽ� ���� �� ���� �ߺ� ��Ƶ� ���� ����
//				break;
//			}
//		}
//
//		// ��迭�� ���ڵ� ��Ʈ������ ��ȯ
//		for (int i = 0; i < rewordArr.length; i++) {
//			reword += rewordArr[i];
//		}
//		
//		return reword;
	}

	@Override
	public void hint(String word, String answer) {
		String hint = "|"; // ��Ʈ ���
		int wordL = word.length();
		int answerL = answer.length();

		// ���� answer�� word���� ª�ų� ��� �߸� �Է��Ѱ�� word�� ���� ������ �ְų� �ڸ�
		if (wordL < answerL) {
			answer = answer.substring(0, word.length());
		} else {
			for (int i = 0; i < wordL - answerL; i++) {
				answer += "#";
			}
		}

		System.out.println("��Ʈ�� ��������ø�  (Y)");
		System.out.println("��Ʈ�� ��������ø�  (N)");
		System.out.print("�Է����ּ��� >> ");
		String yesOrNo = sc.next();

		// Y, N, �� �� Ÿ���� ���� ���
		while (true) {
			// Y) ����� Ÿ������ ���� ���� ���� �κи� ǥ�� �������� _�� ǥ��
			// ���ü��� ���� ||�߰�
			if (yesOrNo.equalsIgnoreCase("Y")) {
				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(i) == answer.charAt(i)) {
						hint += word.charAt(i);
					} else {
						if (word.charAt(i) == ' ') {
							hint += " ";
						} else {
							hint += "_";
						}
					}
					hint += "|";
				}
				System.out.println(hint);
				System.out.println("-------------");
				break;
				// N) ��Ʈ ���� ������� �ٽ� ���� �Է��ϴ� ���� ���
			} else if (yesOrNo.equalsIgnoreCase("N")) {
				break;
			} else {
				// �� ��) �ٽ� Y/N ����ϵ��� ����
				System.out.println("�ùٸ��� ���� ���� �Է��ϼ̾�� �ٽ� �Է����ּ���.");
			}
		}
	}

	@Override
	public boolean answer(String word, String answer) {
		if (word.equalsIgnoreCase(answer)) {
			System.out.printf("%s ����! \n", answer);
			return true;
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�....");
			return false;
		}
	}

}
