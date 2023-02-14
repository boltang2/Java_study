package ex2_map;

import java.util.Collection;
import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String, Character> map = new HashMap<String, Character>();
		map.put("k1", '°¡');
		map.put("k2", 'A');
		map.put("k3", 'B');
		map.put("k4", '5');

		System.out.println(map);
		
		// map -> ¹è¿­
		Collection<Character> values = map.values();
		Character[] arr = values.toArray(new Character[0]);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		char res = map.get("k3");
	}
}
