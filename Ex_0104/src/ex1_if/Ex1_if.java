package ex1_if;

public class Ex1_if {
	public static void main(String[] args) {
		// ��� : ���α׷��� �帧�� �����ϴ� ����
		// - �б⹮ : if, switch
		// - �ݺ��� : for, while

		// if(���ǽ�){���ǽ��� ���ϰ�� ����}

		int n = 50;

		// String�� ���ڿ��� ���尡���� �ڷ��� (Ŭ����)
		String str = "";

		if (n == 50) {
			// ���ǽ��� ���� �� ����Ǵ� ����
			str = "n�� 50�Դϴ�.";
		}

		if (n != 50) {
			str = "n�� 50�� �ƴմϴ�.";
		}
		
		System.out.println(str);
	} // main
}
