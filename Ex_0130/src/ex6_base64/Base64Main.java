package ex6_base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64Main {
	public static void main(String[] args) {
		Encoder e = Base64.getEncoder();
		Decoder d = Base64.getDecoder();
		
		// encoder를 통해 암호화
		byte[] eb = e.encode("암호화 작업 start".getBytes());
		
		System.out.println(new String(eb));
		
		// decoder를 통해 복호화
		byte[] ed = d.decode(eb);
		System.out.println(new String(ed));
	}
}
