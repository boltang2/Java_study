package ex1_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		// 2���� �迭�� ���� �� ����, �ʱ�ȭ�� �� ���� �ϱ�

		char[][] chArr = { { 'C', 'a', 't' }, { 'Y', 'o', 'u', 't', 'u', 'b', 'e' } };

		for (int i = 0; i < chArr.length; i++) {
			for (int j = 0; j < chArr[i].length; j++) {
				System.out.print(chArr[i][j]);
			}
			System.out.println();
		}
	}
}
