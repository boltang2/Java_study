package ex2_char_input;

import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		FileReader fr = null;

		try {
			fr = new FileReader("C:/Embedded_KHJ/test.txt");

			int code = -1;

			while ((code = fr.read()) != -1) {
				System.out.print((char) code);
			}
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
