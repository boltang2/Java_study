package ex2_map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
		// map : Ű�� ���� ��� �ϳ��� �����ͷ� �����Ѵ�.
		// Ű���� ���ؼ� ������ �ٷ� ã�� �˻��ϹǷ� ���� ���� �������߿��� 
		// ���ϴ� ���� ã�Ƴ��� �ɷ��� �پ
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
