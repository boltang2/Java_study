package ex2_input;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		// Stream : byte����� ��Ʈ��
		// reader, writer : char����� ��Ʈ��
		
		FileInputStream fis = null;
		byte[] keyboard = new byte[100];
		
		// Ű���� ���� �Է¹޾Ƽ� keyboard�迭�� ����
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
