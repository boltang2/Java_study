package ex3_account;

public class Atm {

	private int money;

	public void setMoney(int money) {
		this.money = money;
	}

	// 잔액
	public int getMoney() {
		return money;
	}

	// 입금
	public void deposit(int money) {
		this.money += money;
		System.out.println("입금성공");
	}

	// 출금
	public void withdraw(int money) {
		if (this.money < money) {
			System.out.println("잔액이 부족합니다. 초기화면으로 이동합니다.");
		} else {
			this.money -= money;
			System.out.println("출금성공");
		}
	}
}
