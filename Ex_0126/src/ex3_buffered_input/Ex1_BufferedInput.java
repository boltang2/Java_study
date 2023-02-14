package ex3_buffered_input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import util.MyPath;

public class Ex1_BufferedInput {
	public static void main(String[] args) {

		// fis와 bis를 연결 해 줌으로써 파일을 읽어 올 때 버퍼링 작업을 수행하도록 해준다
		// 버퍼링이란, 출력할 바이트 배열을 버퍼라는 메모리 영역에 모아서 저장해 뒀다가
		// 한번에 출력해주는 방식
		// 버퍼영역은 파일을 쓰고 받기위해 마련되어 있는 기억장치의 한 부분인데,
		// 이영역에 데이터를 모아두면 한 번에 입출력을 하는데 용이하므로
		// 속도적인 측면에서 이득을 볼 수있다.
		String path = MyPath.PATH + "/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int) f.length()];

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			if (f.exists()) {
				fis = new FileInputStream(f);
				bis = new BufferedInputStream(fis);

				bis.read(b_read);

				String res = new String(b_read);
				System.out.println(res);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				// 스트림은 생성 된 역순으로 닫아주는 것이 좋다.
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
