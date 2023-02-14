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
	public String randomWord() { // wordSet 배열에서 랜덤으로 단어를 가져옴
		int index = rnd.nextInt(getWordSet().length);
		return getWordSet()[index];
	}

	@Override
	public String rearrange(String word) {
		String reword = ""; // 재배열할 문자들을 합친 단어
		String[] wordArr = word.split("");

		// 공백을 제외한 나머지는 순서 변경
		// i = 0 부터 순차 탐색하면서 랜덤으로 index를 뽑은뒤 reword에 wordArr[index]를 추가시키고
		// wordArr[i] 와 wordArr[index]를 스왑
		for (int i = 0; i < wordArr.length; i++) {
			// 해당문자가 공백이 아니라면 스왑
			if (!wordArr[i].equals(" ")) {
				int index; // 랜덤으로 뽑을 index값
				String tmp = wordArr[i]; // 임시 저장
				// 해당 인덱스 값이 공백이 아닌 문자를 찾을때 까지
				while (true) {
					index = rnd.nextInt(wordArr.length - i) + i;
					if (!wordArr[index].equals(" ")) {
						break;
					}
				}
				// 스왑후 reword에 추가
				wordArr[i] = wordArr[index];
				wordArr[index] = tmp;
				reword += wordArr[i];
				// 해당문자가 공백이라면 공백 그대로 추가
			} else {
				reword += wordArr[i];
			}
		}

		return reword;

//		진짜 개멍청하게 짰다 이거..
//		int maxRandomIndex = word.length();
//		ArrayList<Integer> dupli = new ArrayList<>(); // 이미 뽑은 인덱스를 나열해논 배열
//		char[] rewordArr = new char[maxRandomIndex]; // 재배열한 문자 배열
//
//		// 공백위치는 단어순서가 바뀌어도 그대로 둬야 하므로 공백위치는 동일하게 둔다.
//		for (int i = 0; i < word.length(); i++) {
//			if (word.charAt(i) == ' ') {
//				rewordArr[i] = ' ';
//				dupli.add(i);
//			}
//		}
//
//		// word를 0번째 인덱스부터 끝까지 탐색해 랜덤값 중복제거 후 reword에 대입.
//		// 랜덤값 -> reword인덱스
//		for (int i = 0; i < word.length(); i++) { // word 전체 탐색
//			if (word.charAt(i) == ' ')
//				continue;
//			loop: while (true) { // word.charAt(i) -> reword[index]에 대입
//				int index = rnd.nextInt(maxRandomIndex);
//				for (int j = 0; j < dupli.size(); j++) { // 뽑았던 index 집합
//					if (dupli.get(j) == index) { // 만약 중복이 확인되면 다시 뽑음
//						continue loop;
//					}
//				}
//				rewordArr[index] = word.charAt(i); // 중복이 없다면 해당 인덱스에 문자 집어 넣음
//				dupli.add(index); // 이제 이 인덱스값은 다시 뽑을 수 없게 중복 모아둔 곳에 저장
//				break;
//			}
//		}
//
//		// 재배열한 문자들 스트링으로 변환
//		for (int i = 0; i < rewordArr.length; i++) {
//			reword += rewordArr[i];
//		}
//		
//		return reword;
	}

	@Override
	public void hint(String word, String answer) {
		String hint = "|"; // 힌트 출력
		int wordL = word.length();
		int answerL = answer.length();

		// 만약 answer가 word보다 짧거나 길게 잘못 입력한경우 word와 같게 공백을 넣거나 자름
		if (wordL < answerL) {
			answer = answer.substring(0, word.length());
		} else {
			for (int i = 0; i < wordL - answerL; i++) {
				answer += "#";
			}
		}

		System.out.println("힌트를 보고싶으시면  (Y)");
		System.out.println("힌트를 보기싫으시면  (N)");
		System.out.print("입력해주세요 >> ");
		String yesOrNo = sc.next();

		// Y, N, 그 외 타이핑 했을 경우
		while (true) {
			// Y) 정답과 타이핑한 값을 비교해 맞은 부분만 표시 나머지는 _로 표시
			// 가시성을 위해 ||추가
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
				// N) 힌트 보기 싫을경우 다시 정답 입력하는 문구 출력
			} else if (yesOrNo.equalsIgnoreCase("N")) {
				break;
			} else {
				// 그 외) 다시 Y/N 출력하도록 유도
				System.out.println("올바르지 않은 값을 입력하셨어요 다시 입력해주세요.");
			}
		}
	}

	@Override
	public boolean answer(String word, String answer) {
		if (word.equalsIgnoreCase(answer)) {
			System.out.printf("%s 정답! \n", answer);
			return true;
		} else {
			System.out.println("틀렸습니다....");
			return false;
		}
	}

}
