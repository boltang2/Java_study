package ex2_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		// �迭 : '���� �ڷ���'���� ��Ƶ� �ϳ��� ����
		// ȿ������ �ڷ������ ���� '�ݵ��' �˰� �־�� �ϴ� ����
		
		// 1) �迭 ����
		int[] arr;
		
		// 2) �迭 ����
		arr = new int[] {10,20,30,40};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
