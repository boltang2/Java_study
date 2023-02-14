package ex7_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharStreamWork {
	public static void main(String[] args) {
		
		// char기반의 스트림 사용
		// 특정경로에 char.txt 파일을 만들고 아무 내용이나 넣는다
		// char.txt를 읽어서 내용에 알파벳 대문자와 소문자 갯수를 각각 출력
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		String path = "C:\\Embedded_KHJ/ex7_work(2).txt";
		
		try {
			fw = new FileWriter(path);
			bw = new BufferedWriter(fw);
			
			bw.write("abcABSDAWEasdq31 ASDasdasd");
			
			bw.flush();
			
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String word = br.readLine();
			System.out.println(word);
			
			int countL = 0;
			int countU = 0;
			
			for(int i = 0; i < word.length(); i++) {
				char c  = word.charAt(i);
				if(c >= 'a' && c <= 'z') {
					countL++;
				} else if(c >= 'A' && c <= 'Z') {
					countU++;
				}
			}
			
			System.out.println("대문자  : " + countU);
			System.out.println("소문자  : " + countL);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
