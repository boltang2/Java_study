package ex1_list;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("���");
		sList.add("����");
		sList.add("Ȳ��");
		sList.add("�浿");
		sList.add("����");
		sList.add(0,"����");
		sList.add(1,"����");
		sList.remove(3);
		sList.remove(3);
		sList.remove(3);
		sList.remove(3);
		sList.add("����");
		sList.add("����");
		System.out.println(sList);
		
	}
}
