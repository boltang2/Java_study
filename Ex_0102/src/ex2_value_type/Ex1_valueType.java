package ex2_value_type;

import java.util.HashMap;

public class Ex1_valueType {
	
	public static void main(String[] args) {

		/*
		 * �⺻ �ڷ���
		 * ���� : boolean - 1bit 
		 * ������ : char - 2byte
		 * ������ : byte - 1byte .... -128 ~ +127
		 * 		  short - 2byte .... -32768 ~ +32767
		 * 		  int - 4byte .... -21��  ~ +21��
		 * 		  long - 8byte .... -900�� ~ +900��
		 * �Ǽ��� : float - 4byte
		 * 		  double - 8byte
		 * 
		 */
		
		/*
		 * ���� : Ư�� ���� �����ϱ� ���� ����
		 * �׸�(�ڷ���)�� �����ϴ� �ĺ���
		 * 
		 * ���� ���� ��Ģ
		 * 1) �ڷ��� ������; (����)
		 * 2) ������ = ��; (����)
		 * 3) �ڷ��� ������ = �� ; (�ʱ�ȭ)
		 * 
		 * ���� ����� ���ǻ���
		 * 1) ���� �������� �����̸��� �ߺ����� �ʵ��� �Ѵ�.
		 * 2) _�� �����ϰ�� Ư�����ڸ� ������ �� ����.
		 * 3) �������� �ݵ�� �ҹ��ڷ� ����.
		 * 4) �������� ���ڷ� ������ �� ������, �ݵ�� �������� �ۼ��� ��.
		 */
		
		 // 1) ����
		 //���� ����. ��, true or false ������ �����ϴ� �ڷ��� Ÿ��
		 boolean b;
		 b = true;
		 boolean b2;
		 b2 = false;
		 // �ڷ��� Ÿ�Կ� �´� ���� �־���� �Ѵ�.
		 System.out.println(b);
		 // 2) ������
		 // Ȧ����ǥ �ȿ� �� �ѱ��ᳪ ���� ������ �ڷ���
		 char c = 'A';
		 System.out.println("c : " + c);
		 char c2 = 65 + 1;
		 System.out.println("c2 : " + c2);
		 // 3) ������
		 //byte by = 128;
		 int n1 = 210000000;
		 // int�� ������ ����� ���� longŸ�Կ� �����Ϸ��� �ݵ�� LŰ���带 �߰��ؾ� �Ѵ�.
		 long n2 = 2200000000L;
		 // 4) �Ǽ���
		 // �Ҽ����� ���� ������ �����ϱ� ���� �ڷ���
		 float f1 = 3.14F;
		 double f2 = 3.14;
		 System.out.println(f1);
		 System.out.println(f2);
		 
		 f1 = 100;
		 f2 = 100;
		 
		 HashMap<Integer, String> a = new HashMap<Integer, String>();
		 a.put(1, "a");
		 System.out.println(a.get(1));
	}
}
