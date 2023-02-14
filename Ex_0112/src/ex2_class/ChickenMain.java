package ex2_class;

public class ChickenMain {
	public static void main(String[] args) {
		Chicken c1 = new Chicken();
		c1.sauce = "후라이드";
		c1.myChicken();
		
		Chicken c2 = new Chicken();
		c2.sauce = "양념";
		c2.myChicken();
	}
}
