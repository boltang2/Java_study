package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		Bank b1 = new Bank("����", "02-123-4567");
		Bank b2 = new Bank("�̴�", "02-765-4321");
		Bank b3 = new Bank("ȫ��", "02-345-6789");
		
		Bank.interest = 0.1f;
		b1.getResult();
		b2.getResult();
		b3.getResult();
	}
}
