package ex7_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharStreamWork {
	public static void main(String[] args) {
		
		// char����� ��Ʈ�� ���
		// Ư����ο� char.txt ������ ����� �ƹ� �����̳� �ִ´�
		// char.txt�� �о ���뿡 ���ĺ� �빮�ڿ� �ҹ��� ������ ���� ���
		
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
			
			System.out.println("�빮��  : " + countU);
			System.out.println("�ҹ���  : " + countL);
			
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
