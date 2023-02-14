package ex6_gugudan;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("´Ü : ");
		int dan = sc.nextInt();
		
		Gugu gugu = new Gugu();
		gugu.getGugudan(dan);
	}
}
