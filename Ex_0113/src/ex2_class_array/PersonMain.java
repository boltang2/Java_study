package ex2_class_array;

public class PersonMain {
	public static void main(String[] args) {
		String[] sArr = new String[3];
		sArr[0] = "aaa";
		sArr[1] = "bbb";
		sArr[2] = "ccc";

		// StringŬ������ ������ ��� Ŭ��������
		// �迭ȭ ó���Ǿ��� �� �� �ε������� �޸� �Ҵ��� �� ��� �Ѵ�.
		Person[] person = new Person[3];
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person(); // Ÿ���� �ٸ� ���ڵ��� �ϳ��� �迭��� ���� �� ����.
		}

		person[0].setName("A");
		person[0].setAge(12);

		person[1].setName("B");
		person[1].setAge(24);

		person[2].setName("C");
		person[2].setAge(40);

		for (int i = 0; i < person.length; i++) {
			System.out.printf("%s / %d\n", person[i].getName(), person[i].getAge());
		}
	}
}
