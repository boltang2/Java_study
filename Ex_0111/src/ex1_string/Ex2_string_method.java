package ex1_string;

public class Ex2_string_method {
	public static void main(String[] args) {
		// String Ŭ������ �޼���(���)��
		// �޼���� � �۾��� �����ϱ� ���� ��ɹ����� ����
		// �ݺ������� ���Ǵ� �ڵ带 ���̱� ���� ���� ����

		String name = "Hong Gil Dong";
		int len = name.length();
		System.out.println("������ ����  : " + len);
		int index = name.indexOf('o');
		System.out.println(index);
		index = name.lastIndexOf('o');
		System.out.println(index);
		
		char c = name.charAt(5);
		System.out.println(c);
		
		//name.substring(beginIndex);
		//name.substring(beginIndex, endIndex);
		
		String s1 = name.substring(5);
		System.out.println(s1);
		s1 = name.substring(5,10);
		System.out.println(s1);
		
		name = "Hong. Gil. Dong";
		s1 = name.replaceAll("\\.", "%");
		s1 = name.replace('%', '.');
		System.out.println(s1);
		
		name = "kim. lee. park.";
		String name2 = "kim. lee. park";
		
		name = name.replace('.', '/');
		name2 = name2.replaceAll(".", "/"); // �ڹ� ���ԽĿ��� .�տ� ���� �ϳ��� �νĵǾ� �̷� ����� ��Ÿ��. \\.�� ����ؾ���
		System.out.println(name);
		System.out.println(name2);
		
		String id = "         hi hello     ";
		id = id.trim();
		System.out.println(id);
		// Ư�� ������ �������� �迭���·� ������ �������ִ� �޼���
		String[] id2 = id.split(" ");
		for(String tmp : id2) {
			System.out.println(tmp);
		}
		String answer = "Apple";
		if(answer.equalsIgnoreCase("apple")) { // ��ҹ��� ����
			System.out.println("���� ����");
		}
		
		// ��Ʈ�� Ŭ������ �޼���� �ƴ����� , ������ ���� ����ϰԵ� �޼���
		// ���������� ���ڿ��� ������ ������ ���� ������ �ٲ㺸��
		// �⺻�ڷ����� wrapper��� �θ� Ŭ������ ����
		String num = "10";
		int a = Integer.parseInt(num); // �ݵ�� �������·� �����ؾ� ��ȯ ����
		System.out.println(a);
		
	}
}
