package ex4_work;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
	private String[] words; // 랜덤으로 뽑을 단어모음
	private String word; // 내가 맞출 단어
	private String[] showWord; // 유저에게 보여줄 단어
	private HashSet<String> history = new HashSet<>(); // 내가 입력했던 알파벳 모음
	private Random rnd = new Random();
	private Scanner sc = new Scanner(System.in);

	public HangMan(String[] words) {
		this.words = words;
		int index = rnd.nextInt(words.length);
		word = this.words[index];
		showWord = new String[word.length()];
		Arrays.fill(showWord, "☆");
	}

	public String[] check(String[] showWord, String c) {
		if(c.length() == 1 && (c.charAt(0) >= 'a' && c.charAt(0) <='z')) {
			if(history.contains(c)) {
				System.out.println(c + "(은)는 이미 입력한 문자입니다.");
			} else {
				for (int i = 0; i < word.length(); i++) {
					if (c.charAt(0) == word.charAt(i)) {
						showWord[i] = c;
					}
				}
				history.add(c);
			}
		} else {
			System.out.println("한글자의 영소문자만 가능합니다.");
		}
		return showWord;
	}
	
	public void game() {
		while(true) {
			System.out.print("word : " + String.join(" ", showWord) + " >> ");
			if(exit()) {
				break;
			}
			String c = sc.next();
			check(showWord, c);
		}

		System.out.println("\n" + word + "정답!!");
	}
	
	public boolean exit() {
		for(String star : showWord) {
			if(star.equalsIgnoreCase("☆")) {
				return false;
			}
		}
		return true;
	}
}
