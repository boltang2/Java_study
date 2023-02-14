package ex3_io_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {

		String path = "C:/Embedded_KHJ/aaa";

		File f = new File(path);

		// 파일클래스 f의 경로가 물리적으로 존재하는지를 확인하는 메서드
		if (f.exists()) {
			
		} else {
			System.out.println("존재하지 않는 경로가 있습니다");
			f.mkdir();
		}
	}
}
