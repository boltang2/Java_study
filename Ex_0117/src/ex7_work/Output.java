package ex7_work;

public class Output extends Input {
	private char[] output;

	public Output() {
		output = new char[] { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
	}

	public String convert(String in) {
		char[] input = super.getInput();
		String ans = "";
		for (int i = 0; i < in.length(); i++) {
			for (int j = 0; j < input.length; j++) {
					if(in.charAt(i) == input[j]) {
						ans += output[j];
					}
			}
		}
		return ans;
	}

	public char[] getOutput() {
		return output;
	}
	
}
