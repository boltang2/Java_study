package ex2_class_array;

public class PersonMain {
	public static void main(String[] args) {
		String[] sArr = new String[3];
		sArr[0] = "aaa";
		sArr[1] = "bbb";
		sArr[2] = "ccc";

		// String클래스를 제외한 모든 클래스들은
		// 배열화 처리되었을 때 각 인덱스마다 메모리 할당을 해 줘야 한다.
		Person[] person = new Person[3];
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person(); // 타입이 다른 인자들을 하나의 배열요소 묶을 때 좋다.
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
