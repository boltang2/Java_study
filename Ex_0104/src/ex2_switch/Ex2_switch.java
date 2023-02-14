package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		String str = "b";
		
		switch (str) {
		case "A":
			System.out.println("90~100");
			break;
		case "B":
			System.out.println("80~90");
			break;
		case "C":
			System.out.println("70~80");
			break;
		case "D":
			System.out.println("90~100");
			break;
		default:
			System.out.println("올바른 성적을 입력해야 합니다.");
			break;
		}
	}
}
