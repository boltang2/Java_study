package ex3_char_output;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		FileWriter fr = null;

		try {
			fr = new FileWriter("C:/Embedded_KHJ/fileWriter의 예제.txt");

			String str = "first line \n";
			String str2 = "두번째 줄";
			
			// fr은 기본적으로 2byte를 지원하기 때문에 getBytes()를 통해
			// byte[] 구조로 쪼개지 않아도 기록이 가능
			
			fr.write(str);
			fr.write(str2);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
