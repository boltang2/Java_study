package ex1_vending;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		String[][] drinks = { { "��ī�ݶ�", "1800" }, { "��ī����", "2000" }, { "���", "1500" }, { "�������", "1600" },
				{ "ĥ�����̴�", "1600" }, { "ĥ������", "1800" }, { "���ڿ�", "1200" }, { "���̼Ҵ�", "1200" }, { "��Ÿ500", "1000" },
				{ "����ƾ��", "1100" } };
		Scanner sc = new Scanner(System.in);
		Vending vd = new Vending(drinks);
		vd.showCans();
	}
}
