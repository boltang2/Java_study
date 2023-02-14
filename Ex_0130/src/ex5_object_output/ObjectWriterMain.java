package ex5_object_output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriterMain {
	public static void main(String[] args) {
		Person ps = new Person();
		ps.setAge(20);
		ps.setName("홍길동");

		String path = "C:\\Embedded_KHJ/person.sav";

		FileOutputStream fos = null;
		// 객체를 통째로 출력하는데 사용하는 output stream
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(ps); // person객체를 저장
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
