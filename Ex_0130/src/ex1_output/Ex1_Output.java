package ex1_output;

import java.io.PrintStream;

public class Ex1_Output {
	public static void main(String[] args) {
		
		// System.out을 통해 콘솔창에 데이터를 출력하는 과정
		PrintStream ps = System.out;
		ps.write('A');
		byte[] b_wirte = { 'B', 'C', 'D' };
		try {
			ps.write(b_wirte);
		} catch (Exception e) {
			// TODO: handle exception
		}
		ps.close();
	}
}
