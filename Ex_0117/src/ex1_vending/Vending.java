package ex1_vending;

public class Vending {
	private int money;

	private Can[] can;

	public Vending(String[][] drinks) {
		this.can = new Can[drinks.length];
		for (int i = 0; i < drinks.length; i++) {
			this.can[i] = new Can(drinks[i][0], Integer.parseInt(drinks[i][1]));
		}
	}

	public void showCans() {
		for (int i = 0; i < can.length; i++) {
			System.out.printf("%s(%d)\n", can[i].getCanName(), can[i].getPrice());
		}
	}
	
	public int outCan(String name) {
		
		return 0;
	}
}
