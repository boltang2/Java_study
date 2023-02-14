package ex7_work;

public class Input {
	private char[] input;

	public Input() {
		input = new char[36];
		for(int i = 0; i < 25; i++) {
			input[i] = (char) (97 + i);
		}
		for(int i = 26; i < 36; i++) {
			input[i] = (char) (22+i);
		}
	}

	public char[] getInput() {
		return input;
	}
}
