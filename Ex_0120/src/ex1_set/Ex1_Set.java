package ex1_set;

import java.util.HashSet;

public class Ex1_Set {
	public static void main(String[] args) {
		
//		자바의 collection
//		다수의 데이터를 쉽고 효과적으로 
//		처리할 수 있는 표준화된 방법을
//		제공하는 클래스의 집합
//
//		1) list<>(ArrayList)
//		2) set<>(HashSet, TreeSet)
//		3) map<>(HashMap)
		
		HashSet<Integer> hs = new HashSet<>();
		
		// 넣는 순서를 보장 안해준다
		hs.add(1);
		hs.add(2);
		hs.add(4);
		hs.add(1);
		
		// set은 배열과 같이 index로 접근하는 것이 불가
		// 대신 for문이 없어도 set이 가지고 있는 모든 내용을 통째로 출력하는 것은 가능
		System.out.println(hs);
		System.out.println(hs.size());
		
		// set은 index단위의 접근이 불가하기 떄문에
		// 0, 1,2 등의 index에 접근하고 싶다면 배열로 변경한 뒤
		// 변경된 배열을 통해서 index로 접근
		
		// 0으로 넣으면 알아서 set size만큼 생성해줌
		Integer[] arr = hs.toArray(new Integer[0]);
		System.out.println(arr.length);
		System.out.println(arr[1]);
		
		// set이 가진 모든 메모리를 초기화
		hs.clear();
		System.out.println(hs.size());
	}
}
