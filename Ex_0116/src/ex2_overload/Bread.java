package ex2_overload;

public class Bread {

	// 메서드1
	public void makeBread() {
		System.out.println("빵을 만들었어요");
	}

	// 메서드 2
	public void makeBread(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("빵을 만들었어요");
		}
		System.out.println(n + "개의 빵을 만들었어요.");
	}

	// 메서드 3
	public void makeBread(String s, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(s + "빵을 만들었습니다.");
		}
		System.out.printf("%d개의 %s빵을 만들었어요.\n");
	}
}
