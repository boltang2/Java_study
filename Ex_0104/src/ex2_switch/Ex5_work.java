package ex2_switch;

public class Ex5_work {
	public static void main(String[] args) {

		int su1 = 10;
		int su2 = 5;
		char op = '-'; // ������ �ƹ��ų�

		switch (op) {
		case '+':
			System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
			break;
		case '-':
			System.out.println(su1 + " - " + su2 + " = " + (su1 - su2));
			break;
		case '/':
			System.out.println(su1 + " / " + su2 + " = " + (su1 / su2));
			break;
		case '*':
			System.out.println(su1 + " * " + su2 + " = " + (su1 * su2));
			break;
		case '%':
			System.out.println(su1 + " % " + su2 + " = " + (su1 % su2));
			break;
		default:
			System.out.println("�ùٸ� �����ڰ� �ƴմϴ�.");
			break;
		}

	}
 }
