package ex3_io_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/Embedded_KHJ";
		File f = new File(path);
		
		// f�� ������ path�� ��ΰ� ������ ��� true
		if(f.isDirectory()) {
			System.out.println("---���� Ŭ������ ������ ������ϵ� ---");
			// f�� ������ ������ ���� ������� �̸��� ��Ƶδ� �޼���
			String[] lists = f.list();
			
			for(String list : lists) {
				System.out.println(list);
			}
			
			
		}
	}
}
