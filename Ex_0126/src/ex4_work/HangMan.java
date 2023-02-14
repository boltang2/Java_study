package ex4_work;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
	private String[] words; // �������� ���� �ܾ����
	private String word; // ���� ���� �ܾ�
	private String[] showWord; // �������� ������ �ܾ�
	private HashSet<String> history = new HashSet<>(); // ���� �Է��ߴ� ���ĺ� ����
	private Random rnd = new Random();
	private Scanner sc = new Scanner(System.in);

	public HangMan(String[] words) {
		this.words = words;
		int index = rnd.nextInt(words.length);
		word = this.words[index];
		showWord = new String[word.length()];
		Arrays.fill(showWord, "��");
	}

	public String[] check(String[] showWord, String c) {
		if(c.length() == 1 && (c.charAt(0) >= 'a' && c.charAt(0) <='z')) {
			if(history.contains(c)) {
				System.out.println(c + "(��)�� �̹� �Է��� �����Դϴ�.");
			} else {
				for (int i = 0; i < word.length(); i++) {
					if (c.charAt(0) == word.charAt(i)) {
						showWord[i] = c;
					}
				}
				history.add(c);
			}
		} else {
			System.out.println("�ѱ����� ���ҹ��ڸ� �����մϴ�.");
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

		System.out.println("\n" + word + "����!!");
	}
	
	public boolean exit() {
		for(String star : showWord) {
			if(star.equalsIgnoreCase("��")) {
				return false;
			}
		}
		return true;
	}
}
