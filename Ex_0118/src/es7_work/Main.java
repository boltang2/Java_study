package es7_work;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String[] wordSet = {"apple","persimmon","pear","oriental melon"};
		Scanner sc = new Scanner(System.in);
		Taboo_game tg = new Taboo_game(wordSet);
		
		String word = tg.randomWord();
		String reword = tg.rearrange(word);
		while(true) {
			System.out.print("문제 : " + reword + "\n");
			System.out.print("정답을 입력하세요 >> ");
			String answer = sc.next();
			if(tg.answer(word, answer)) {
				break;
			} else {
				tg.hint(word, answer);
			}
		}
	}
}
