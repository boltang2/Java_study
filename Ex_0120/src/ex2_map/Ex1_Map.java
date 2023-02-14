package ex2_map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
		// map : 키와 값을 묶어서 하나의 데이터로 저장한다.
		// 키값을 통해서 벨류를 바로 찾아 검색하므로 많은 양의 데이터중에서 
		// 원하는 값을 찾아내는 능력이 뛰어남
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(2, 200);
		
		int res = map.get(2);
		System.out.println(map);
		
		map.containsKey(2);
		map.containsValue(200);
		
		map.remove(2);
	}
}
