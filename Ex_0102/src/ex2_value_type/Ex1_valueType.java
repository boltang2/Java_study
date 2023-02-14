package ex2_value_type;

import java.util.HashMap;

public class Ex1_valueType {
	
	public static void main(String[] args) {

		/*
		 * 기본 자료형
		 * 논리형 : boolean - 1bit 
		 * 문자형 : char - 2byte
		 * 정수형 : byte - 1byte .... -128 ~ +127
		 * 		  short - 2byte .... -32768 ~ +32767
		 * 		  int - 4byte .... -21억  ~ +21억
		 * 		  long - 8byte .... -900경 ~ +900경
		 * 실수형 : float - 4byte
		 * 		  double - 8byte
		 * 
		 */
		
		/*
		 * 변수 : 특정 값을 저장하기 위한 공간
		 * 그릇(자료형)을 구별하는 식별자
		 * 
		 * 변수 선언 규칙
		 * 1) 자료형 변수명; (선언)
		 * 2) 변수명 = 값; (대입)
		 * 3) 자료형 변수명 = 값 ; (초기화)
		 * 
		 * 변수 선언시 주의사항
		 * 1) 같은 영역에서 변수이름을 중복되지 않도록 한다.
		 * 2) _를 제외하고는 특수문자를 포함할 수 없다.
		 * 3) 변수명은 반드시 소문자로 시작.
		 * 4) 변수명은 숫자로 시작할 수 없으며, 반드시 영문으로 작성할 것.
		 */
		
		 // 1) 논리형
		 //참과 거짓. 즉, true or false 값만을 저장하는 자료형 타입
		 boolean b;
		 b = true;
		 boolean b2;
		 b2 = false;
		 // 자료형 타입에 맞는 값을 넣어줘야 한다.
		 System.out.println(b);
		 // 2) 문자형
		 // 홀따옴표 안에 딱 한글잠나 저장 가능한 자료형
		 char c = 'A';
		 System.out.println("c : " + c);
		 char c2 = 65 + 1;
		 System.out.println("c2 : " + c2);
		 // 3) 정수형
		 //byte by = 128;
		 int n1 = 210000000;
		 // int의 범위를 벗어나는 값을 long타입에 저장하려면 반드시 L키워드를 추가해야 한다.
		 long n2 = 2200000000L;
		 // 4) 실수형
		 // 소수점을 가진 값들을 저장하기 위한 자료형
		 float f1 = 3.14F;
		 double f2 = 3.14;
		 System.out.println(f1);
		 System.out.println(f2);
		 
		 f1 = 100;
		 f2 = 100;
		 
		 HashMap<Integer, String> a = new HashMap<Integer, String>();
		 a.put(1, "a");
		 System.out.println(a.get(1));
	}
}
