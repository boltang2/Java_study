package ex4_work;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Words extends Thread {
	private ArrayList<String> list = new ArrayList<>();
	private String[] word;
	private boolean exit = true;
	private Random rnd = new Random();
	private Scanner sc = new Scanner(System.in);

	public Words(String[] word) {
		this.word = word;
		this.list.add(this.word[0]);
	}

	@Override
	public void run() {
		while (exit) {
			try {
				Thread.sleep(3000);
				int index = rnd.nextInt(word.length);
				list.add(word[index]);		
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

	public void game() {
		while (exit) {
			System.out.println(list);
			System.out.print(">> ");
			String str = sc.next();
			list.remove(str);
			isExit();
		}
		System.out.println("Ŭ����!!");
	}
	
	public void isExit() {
		if(list.size() == 0) {
			exit = false;
		}
	}

}
