package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {

		// if-else
		// if(���ǽ�){������ ������ ���}else{������ �������� ���� ���}

		int n = 49;
		String str = "";

		if (n++ >= 50) {
			str = "n�� 50�̻��� ��";
		} else {
			str = "n�� 50�̸��� ��";
		}

		System.out.println(str);

		System.out.println("-----------------");

		char c = '��';
		if (c == '��') {
			str = "����� �����Դϴ�.";
		} else {
			str = "����� �����Դϴ�.";
		}
		
		System.out.println(str);
		System.out.println("-----------------");
		
		str = c == '��' ? "����� �����Դϴ�." : "����� �����Դϴ�.";
		System.out.println(str);

	}
}
