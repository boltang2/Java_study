package ex2_input;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		// Stream : byte기반의 스트림
		// reader, writer : char기반의 스트림
		
		FileInputStream fis = null;
		byte[] keyboard = new byte[100];
		
		// 키보드 값을 입력받아서 keyboard배열에 저장
		try {
			System.in.read(keyboard);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = new String(keyboard);
		System.out.println(str.trim());
	}
}
