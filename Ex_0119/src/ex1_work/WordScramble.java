package ex1_work;

import java.util.Random;

public class WordScramble {
	// 정답 및 섞인 단어를 반환하는 클래스
	String[] strArr = { "apple", "persimmon", "pear", "oriental melon" };
	String shake = "";

	public String getAnswer() {

		// 난수를 익명클래스로 생성할 수 있다
		// rnd, sc등과 같이 객체의 이름을 지정하지 않고 new를 통해
		// 바로 사용하고 사용한 뒤, 그 자리에서 제거하는 형태로 사용하는 방식을
		// 익명클래스라고 한다
		int idx = new Random().nextInt(strArr.length);
		return strArr[idx];
	}

	public String getScrambleWord(String word) {
		int[] inArr = new int[word.length()];

		// 만들어진 inArr배열에 겹치지 않는 난수값을 채워넣는다
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
