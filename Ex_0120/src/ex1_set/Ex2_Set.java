package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex2_Set {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();

		Random rnd = new Random();

		while (hs.size() < 6) {
			int v = rnd.nextInt(45) + 1;
			hs.add(v);
		}

		System.out.println(hs);

		// 오름차순 정렬
		TreeSet<Integer> ts = new TreeSet<>();

		while (ts.size() != 6) {
			int n = rnd.nextInt(45) + 1;
			ts.add(n);
		}
		
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("홍길동");
		ts2.add("apple");
		
		System.out.println(ts);
	}
}
