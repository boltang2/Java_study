package ex1_work;

import java.util.Random;

public class WordScramble {
	// ���� �� ���� �ܾ ��ȯ�ϴ� Ŭ����
	String[] strArr = { "apple", "persimmon", "pear", "oriental melon" };
	String shake = "";

	public String getAnswer() {

		// ������ �͸�Ŭ������ ������ �� �ִ�
		// rnd, sc��� ���� ��ü�� �̸��� �������� �ʰ� new�� ����
		// �ٷ� ����ϰ� ����� ��, �� �ڸ����� �����ϴ� ���·� ����ϴ� �����
		// �͸�Ŭ������� �Ѵ�
		int idx = new Random().nextInt(strArr.length);
		return strArr[idx];
	}

	public String getScrambleWord(String word) {
		int[] inArr = new int[word.length()];

		// ������� inArr�迭�� ��ġ�� �ʴ� �������� ä���ִ´�
		outer: for (int i = 0; i < inArr.length;) {
			inArr[i] = new Random().nextInt(inArr.length);

			for (int j = 0; j < i; j++) {
				if (inArr[i] == inArr[j]) {
					continue outer;
				}
			}
			i++;
		}

		for (int i = 0; i < inArr.length; i++) {
			shake += word.charAt(i);
		}
	}
}
