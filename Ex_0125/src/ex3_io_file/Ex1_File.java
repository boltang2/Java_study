package ex3_io_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {

		// io (input, output)
		// 입력과 출력을 담당하는 스트림을 의미한다.
		// 스트림이란, 데이터를 입출력하기 위한 일종의 통로
		// 콘솔(C:, 키보드 ... 이클립스 외부영역)에서 데이터를 가져온다던지
		// jvm의 데이터를 콘솔로 내보내는 등의 작업을 할 수 있도록 하는 클래스들
		// jvm에서 콘솔 output 반대는 input
		String path = "C:/Embedded_KHJ/test.txt";
		File f1 = new File(path);
		// f1이 접근한 경로가 파일 형식일 경우 true
		// 디렉토리 형식일 경우 false
		if (f1.isFile()) {
			System.out.println("용량 : " + f1.length() + "byte");
		}
	}
}
