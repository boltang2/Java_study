package ex6_static;

public class Bank {
	private String point;
	private String tel;
	static float interest;

	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
		interest = 10f;
	}
	
	public void getResult() {
		System.out.println("���� : " + point);
		System.out.println("��ȭ : " + tel);
		System.out.println("������ :" + interest + "%");
		System.out.println("---------------");
	}
}
