package ex4_map_work;

import java.util.HashMap;
import java.util.Scanner;

public class MapWork {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kim",1111);
		map.put("park",2222);
		map.put("lee",3333);
		
		// id : kim
		// pw : 3333
		// ��й�ȣ ����ġ
		
		// id : lim
		// pw : 1234
		// ���̵� �������� �ʽ��ϴ�.
		
		// id : park
		// pw : 2222
		// �α��� ����!
		
		System.out.print("id : ");
		String id = new Scanner(System.in).next();
		System.out.print("pw : ");
		int pw = new Scanner(System.in).nextInt();
		if(map.containsKey(id)) {
			if(map.get(id) == pw) {
				System.out.println("�α��� ����!");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("���̵� ���� ���� �ʽ��ϴ�.");
		}
	}
}
