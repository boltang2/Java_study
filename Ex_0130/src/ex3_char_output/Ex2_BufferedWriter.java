package ex3_char_output;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex2_BufferedWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("C:/Embedded_KHJ/bufferedWriter�� ����.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("ù��° line�Դϴ�.");
			bw.newLine(); // ����ġ�°� ������ ����
			bw.write("�ι�° ��");
			
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
