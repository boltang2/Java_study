package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {

		// if-else
		// if(조건식){조건을 만족할 경우}else{조건을 만족하지 못한 경우}

		int n = 49;
		String str = "";

		if (n++ >= 50) {
			str = "n은 50이상의 수";
		} else {
			str = "n은 50미만의 수";
		}

		System.out.println(str);

		System.out.println("-----------------");

		char c = '남';
		if (c == '여') {
			str = "당신은 여자입니다.";
		} else {
			str = "당신은 남자입니다.";
		}
		
		System.out.println(str);
		System.out.println("-----------------");
		
		str = c == '남' ? "당신은 남자입니다." : "당신은 여자입니다.";
		System.out.println(str);

	}
}
