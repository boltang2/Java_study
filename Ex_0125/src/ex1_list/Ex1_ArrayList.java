package ex1_list;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		// ArrayList : 크기의 한계를 가지고 있지 않음
		// index구조로 접근이 가능하여 목록 조회등이나 객체 관리가 편리
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(1,5); // 특정인덱스에 값 추가 그 뒤에 있는 값들을 하나 씩 미루고 채움
		list.set(2,4); // 특정인덱스 값 수정
		list.remove(1); // 특정인덱스 삭제
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		System.out.println("------------------------");
		
		for(int tmp : list) {
			System.out.println(tmp);
		}
	}
}
