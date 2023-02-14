package ex1_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex3_BufferedFileOutput {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream("C:/Embedded_KHJ/bos의 예제.txt");
			bos = new BufferedOutputStream(fos);

			String str = "buffered스트림의 예제.";
			bos.write(str.getBytes());
			
			// 내용을 물리적으로 기록하기 위한 메서드를 안전빵으로 한번 더 호출
			bos.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				// 생성된 역순으로 닫는게 매우 중요하다.
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
