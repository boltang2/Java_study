package ex1_vending;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		String[][] drinks = { { "코카콜라", "1800" }, { "코카제로", "2000" }, { "펩시", "1500" }, { "펩시제로", "1600" },
				{ "칠성사이다", "1600" }, { "칠성제로", "1800" }, { "데자와", "1200" }, { "데미소다", "1200" }, { "비타500", "1000" },
				{ "마운틴듀", "1100" } };
		Scanner sc = new Scanner(System.in);
		Vending vd = new Vending(drinks);
		vd.showCans();
	}
}
