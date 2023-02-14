package es7_work;

import java.util.Arrays;

abstract public class WordSet {
	private String[] wordSet;
	
	public WordSet(String[] wordSet) {
		this.wordSet = Arrays.copyOfRange(wordSet, 0, wordSet.length);
		
	}
	public String[] getWordSet() {
		return wordSet;
	}
	
	abstract public String randomWord();
	abstract public String rearrange(String word);
	abstract public void hint(String word, String answer);
	abstract public boolean answer(String word, String answer);
}

