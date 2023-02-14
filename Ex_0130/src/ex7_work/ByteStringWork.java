package ex7_work;

import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ByteStringWork {
	public static void main(String[] args) {
		// byte기반의 스트림 사용
		// 아무경로에 file.txt를 만들고 내용을 넣어 저장
		// 저장된 file.txt를 읽어서 회문수인지 아닌지를 판단하시오.
		String path = "C:\\Embedded_KHJ/ex7_work(1).txt";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		File f = new File(path);
		byte[] b = new byte[(int) f.length()];
	
		try {
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			String word = "ababa";
			
			bos.write(word.getBytes());
			bos.flush();
			
			boolean x = true;
			
			
			if(f.exists()) {
				fis = new FileInputStream(path);
				bis = new BufferedInputStream(fis);
				
				bis.read(b);
				
				String res = new String(b);
				
				for(int i = 0; i < res.length() / 2; i++) {
					if(res.charAt(i) != res.charAt(res.length() - 1 - i)) {
						x = false;
						break;
					}
				}
				if(x) {
					System.out.println("회문수 입니다.");					
				} else {
					System.out.println("회문수가 아닙니다.");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
