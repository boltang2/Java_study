package ex3_char_output;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex2_BufferedWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("C:/Embedded_KHJ/bufferedWriter의 예제.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("첫번째 line입니다.");
			bw.newLine(); // 엔터치는거 조차도 줄임
			bw.write("두번째 줄");
			
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
