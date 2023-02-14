package ex1_set;

import java.util.HashSet;

public class Ex1_Set {
	public static void main(String[] args) {
		
//		�ڹ��� collection
//		�ټ��� �����͸� ���� ȿ�������� 
//		ó���� �� �ִ� ǥ��ȭ�� �����
//		�����ϴ� Ŭ������ ����
//
//		1) list<>(ArrayList)
//		2) set<>(HashSet, TreeSet)
//		3) map<>(HashMap)
		
		HashSet<Integer> hs = new HashSet<>();
		
		// �ִ� ������ ���� �����ش�
		hs.add(1);
		hs.add(2);
		hs.add(4);
		hs.add(1);
		
		// set�� �迭�� ���� index�� �����ϴ� ���� �Ұ�
		// ��� for���� ��� set�� ������ �ִ� ��� ������ ��°�� ����ϴ� ���� ����
		System.out.println(hs);
		System.out.println(hs.size());
		
		// set�� index������ ������ �Ұ��ϱ� ������
		// 0, 1,2 ���� index�� �����ϰ� �ʹٸ� �迭�� ������ ��
		// ����� �迭�� ���ؼ� index�� ����
		
		// 0���� ������ �˾Ƽ� set size��ŭ ��������
		Integer[] arr = hs.toArray(new Integer[0]);
		System.out.println(arr.length);
		System.out.println(arr[1]);
		
		// set�� ���� ��� �޸𸮸� �ʱ�ȭ
		hs.clear();
		System.out.println(hs.size());
	}
}
