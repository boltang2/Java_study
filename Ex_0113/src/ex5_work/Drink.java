package ex5_work;

public class Drink {
	private String name; // ����� �̸�
	private int price; // ����� ����
	private boolean buy = false; // �ش� ������� ��� �ִ��� ���� �Ǵ�

	public boolean getBuy() {
		return buy;
	}

	public void setBuy(boolean buy) {
		this.buy = buy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
