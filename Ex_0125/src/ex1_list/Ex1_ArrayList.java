package ex1_list;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		// ArrayList : ũ���� �Ѱ踦 ������ ���� ����
		// index������ ������ �����Ͽ� ��� ��ȸ���̳� ��ü ������ ��
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(1,5); // Ư���ε����� �� �߰� �� �ڿ� �ִ� ������ �ϳ� �� �̷�� ä��
		list.set(2,4); // Ư���ε��� �� ����
		list.remove(1); // Ư���ε��� ����
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		System.out.println("------------------------");
		
		for(int tmp : list) {
			System.out.println(tmp);
		}
	}
}
