package ex3_account;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {

		Atm atm = new Atm();
		atm.setMoney(3000);

		Scanner sc = new Scanner(System.in);

		out: while (true) {
			System.out.println("------------");
			System.out.println("1.��      �� : ");
			System.out.println("2.��      �� : ");
			System.out.println("3.�ܾ�Ȯ�� : ");
			System.out.println("etc.�� �� : ");
			System.out.print(">> ");
			int select = sc.nextInt();
			int money = 0;
			switch (select) {
			case 1:
				System.out.println("---- �Ա� ----");
				System.out.print("�Աݾ� : ");
				money = sc.nextInt();
				atm.deposit(money);
				break;
			case 2:
				System.out.println("---- ��� ----");
				System.out.print("��ݾ� : ");
				money = sc.nextInt();
				atm.withdraw(money);
				break;
			case 3:
				System.out.println("---- �ܾ� ----");
				System.out.println("�ܾ� : " + atm.getMoney());
				break;
			default:
				System.out.println("����� �����մϴ�.");
				break out;
			}
		} // while
	}
}
