package ex1_output;

import java.io.File;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String path = "C:/Embedded_KHJ/fileOutput예제.txt";
		File f = new File(path);
		
		try {
			fos = new FileOutputStream(f, true); // true 넣으면 이어서 작성가능. default는 false로 항상 파일 덮어 쓴다.
			String msg = "file OutputStream의 예제입니다. \n두 줄 입력도 쌉가능!";
			String msg2 = "\n나는 세번째 line입니다.\n";
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
