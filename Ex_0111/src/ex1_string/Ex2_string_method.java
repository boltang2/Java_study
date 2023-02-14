package ex1_string;

public class Ex2_string_method {
	public static void main(String[] args) {
		// String 클래스의 메서드(기능)들
		// 메서드란 어떤 작업을 수행하기 위한 명령문들의 집함
		// 반복적으로 사용되는 코드를 줄이기 위해 쓰는 개념

		String name = "Hong Gil Dong";
		int len = name.length();
		System.out.println("문장의 길이  : " + len);
		int index = name.indexOf('o');
		System.out.println(index);
		index = name.lastIndexOf('o');
		System.out.println(index);
		
		char c = name.charAt(5);
		System.out.println(c);
		
		//name.substring(beginIndex);
		//name.substring(beginIndex, endIndex);
		
		String s1 = name.substring(5);
		System.out.println(s1);
		s1 = name.substring(5,10);
		System.out.println(s1);
		
		name = "Hong. Gil. Dong";
		s1 = name.replaceAll("\\.", "%");
		s1 = name.replace('%', '.');
		System.out.println(s1);
		
		name = "kim. lee. park.";
		String name2 = "kim. lee. park";
		
		name = name.replace('.', '/');
		name2 = name2.replaceAll(".", "/"); // 자바 정규식에선 .앞에 값이 하나로 인식되어 이런 결과가 나타남. \\.를 사용해야함
		System.out.println(name);
		System.out.println(name2);
		
		String id = "         hi hello     ";
		id = id.trim();
		System.out.println(id);
		// 특정 문장을 기준으로 배열형태로 나눠서 저장해주는 메서드
		String[] id2 = id.split(" ");
		for(String tmp : id2) {
			System.out.println(tmp);
		}
		String answer = "Apple";
		if(answer.equalsIgnoreCase("apple")) { // 대소문자 무시
			System.out.println("값이 같다");
		}
		
		// 스트링 클래스의 메서드는 아니지만 , 앞으로 많이 사용하게될 메서드
		// 정수형태의 문자열을 연산이 가능한 실제 정수로 바꿔보자
		// 기본자료형은 wrapper라는 부모 클래스가 존재
		String num = "10";
		int a = Integer.parseInt(num); // 반드시 정수형태로 존재해야 반환 성공
		System.out.println(a);
		
	}
}
