package ex4_work;

public class HangManMain {
	public static void main(String[] args) {
		String[] words = {"apple", "doctor", "view"};
		
		HangMan hm = new HangMan(words);
		hm.game();
	}
}
