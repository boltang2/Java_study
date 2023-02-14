package ex5_work;

public class Vending {

	private int money; // ���� ���ǱⰡ ������ �ִ� ��
	private Drink[] drk; // ����� �̸��� ������ ��üȭ

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Drink[] getDrk() {
		return drk;
	}
	
	public Vending(String[][] drk) {
		this.drk = new Drink[drk.length];
		for (int i = 0; i < drk.length; i++) {
			this.drk[i] = new Drink(); // drk[] Ŭ���� ����
			this.drk[i].setName(drk[i][0]); // �� ����
			this.drk[i].setPrice(Integer.parseInt(drk[i][1])); // �� ����
		}
	}

	public void showDrinks() { // ��� ����� ��� ���
		int count = 0;
		System.out.println("-------------------------------------------");
		for (int i = 0; i < drk.length; i++) {
			if (count < 3) {
				System.out.printf("%s(%d)\t", drk[i].getName(), drk[i].getPrice());
				count++;
			} else {
				System.out.print("\n\n");
				count = 0;
			}
		}
		System.out.print("\n-------------------------------------------\n");
	}

	public void showDrinks(int money) { // ���� ���� �� ������ ������ ���� ����� ��� ���
		this.money = money;
		int count = 0;
		System.out.println("-------------------------------------------");
		for (int i = 0; i < drk.length; i++) {
			if(count < 3) {
				if (money > drk[i].getPrice()) {
					drk[i].setBuy(true); // �ش� ������� ������ �� �����Ƿ� true�� �ٲ��ش�.
					System.out.printf("%s(%d)\t", drk[i].getName(), drk[i].getPrice()); // ���Ŀ� �°� ���
				} else {
					int leng = drk[i].getName().length() + Integer.toString(drk[i].getPrice()).length() + 2;
					for(int j = 0; j < leng; j++) {
						System.out.print(" ");
					}
					System.out.print("\t");
				}
				count++;
			} else {
				System.out.print("\n\n");
				count = 0;
			}
		}
		System.out.print("\n-------------------------------------------\n");
	}

	public boolean chooseDrink(String drink) { // ���� ������� ������� �� ������� �ܾ� ��ȯ(����ó��)
		boolean isTrue = false;
		for (int i = 0; i < drk.length; i++) {
			if (drk[i].getName().equals(drink) && drk[i].getBuy()) { 
				// ���Ű��� ����� ���� �Է��� ������� ������ ? && ���Ű����̸� drk.buy == true
				money -= drk[i].getPrice(); // �ܾ� ���
				System.out.printf("%s (��)�� �����ϼ̽��ϴ�.\n�ܾ� : %d", drk[i].getName(), money);
				isTrue = true; // while���� �����
				return isTrue;
			}
		}
		System.out.println("������� �߸� ������ϴ�. �ٽ� ����ּ���.");
		return isTrue; // while���� �ٽõ�
	}
}
