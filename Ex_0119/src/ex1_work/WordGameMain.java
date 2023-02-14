package ex1_work;

import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WordScramble ws = new WordScramble();
		String answer = ws.getAnswer();
		String question = ws.getScrambleWord(answer);
	}
}
