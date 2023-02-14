package ex5_work;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		
		// Ű���忡�� �ݾ��� �Է¹ް�
		// �ش� �ݾ� �����ȿ��� ���� �� �ִ� ������ ��ϸ� ȭ�鿡 ���
		// ���Ḧ �����ϸ� ���� �� �ܾ��� ��ȯ
		// insert coin : 1000
		// ȯŸ - 1000
		// �ݶ� - 900
		// ���̴� - 900
		// >> �ݶ�
		// �ݶ� (��)�� �����ϼ̽��ϴ�.
		// �ܾ� 100��

		String[][] drinks = { { "��ī�ݶ�", "1800" }, { "��ī����", "2000" }, { "���", "1500" }, { "�������", "1600" },
				{ "ĥ�����̴�", "1600" }, { "ĥ������", "1800" }, { "���ڿ�", "1200" }, { "���̼Ҵ�", "1200" }, { "��Ÿ500", "1000" },
				{ "����ƾ��", "1100" } };
		
		Scanner sc = new Scanner(System.in);
		Vending vnd = new Vending(drinks);
		vnd.showDrinks();
		
		System.out.print("insert coin >> ");
		int coin = sc.nextInt();
		
		while(true) {
			vnd.showDrinks(coin);
			System.out.printf(">> ");
			String drink = sc.next();
			if(vnd.chooseDrink(drink)) {
				break;
			}	
		}	
	}
}
