package ex3_account;

public class Atm {

	private int money;

	public void setMoney(int money) {
		this.money = money;
	}

	// �ܾ�
	public int getMoney() {
		return money;
	}

	// �Ա�
	public void deposit(int money) {
		this.money += money;
		System.out.println("�Աݼ���");
	}

	// ���
	public void withdraw(int money) {
		if (this.money < money) {
			System.out.println("�ܾ��� �����մϴ�. �ʱ�ȭ������ �̵��մϴ�.");
		} else {
			this.money -= money;
			System.out.println("��ݼ���");
		}
	}
}
