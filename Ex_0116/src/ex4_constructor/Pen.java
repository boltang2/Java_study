package ex4_constructor;

public class Pen {
	private String brand;
	private String color;
	private int price;

	public Pen() {
		System.out.println("Pen税 持失切");
		brand = "monami";
		color = "black";
		price = 500;
	}

	public Pen(String color, int price) {
		System.out.println("Pen税 持失切");
		brand = "monami";
		this.color = color;
		this.price = price;
	}

	public void result() {
		System.out.println("brand : " + brand);
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}
