package ex_operator;

public class Ex5_work {
	public static void main(String[] args) {
		
		/*
		 �������� �ִ�.
		 ��, ���, �������� Ű��� �ִµ�, �Ϸ���귮�� ����
		 5, 7, 5����
		 
		 ���
		 �Ϸ� ���귮 : 17��
		 �ð��� ��� : 
		 
		 1) ���������� �Ϸ翡 ����Ǵ� ������ �� ������ ���
		 2) �ѽð��� ��� ������ ����Ǵ��� ���
		 
		 ## ��, ������ ������ �Ϸ������ ������ ������ intŸ������,
		 	�ð��� ������� ����� ������ floatŸ������ ���� ��.
		 	
		 ## ���� ����� ������ �ڵ�����, �ּ� �� ���� �̻��� ����� ����� �� ��.
		 */

		int pear = 5;
		int apple = 7;
		int orange = 5;

		// 1)
		System.out.println("�Ϸ� ���귮 : " + (pear + apple + orange));
		System.out.println("�ð��� ��� : " + (float) (pear + apple + orange) / 24);
		// 2)
		int total = pear + apple + orange;  
		float avg = (float) total / 24;
		System.out.println("�Ϸ� ���귮 : " + total);
		System.out.println("�ð��� ��� : " + avg);

	}
}
