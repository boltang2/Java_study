package ex2_exception;

public class Ex1_TryCatch {
	public static void main(String[] args) {

		int result = 0;
		int[] arr = new int[3];

		try {
			result = 10 / 2;
			arr[2] = 1;
			// �������� try���� ���� �ڵ�� ���������ʰ�
			// �ٷ� catch�� �Ѿ
			// ��� ���������� �ϳ��� ����
			System.out.println("��������");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Exception�� ��� ���������� �θ�
			// try�������� ������ �߻��ϸ�
			// �ݵ�� catch������ �����Ѵ�.
			// 1)
			// e.printStackTrace();
			// 2)
			System.out.println("�迭�� �������� �ʴ� index�� �����߽��ϴ�.");

		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			// try���������� ���ܹ߻����ο� ���� ����
			// ������ ���� �Ǵ� ����
			System.out.println("finally");
		}

		System.out.println("��� : " + result);

		// try-catch(����ó��) : ���α׷� ������ ����(����, ����...)
		// �� �������� ���α׷��� ���������� ��ȿ�ȴ�.
		// ���δ� ���� ������ ������ ���� ���ܰ� �߻��ص� �̸� �����ϰų� �����Ͽ�
		// ��� �ڵ带 �����ؾ� �� ���� �ִ�.
		// ����ó�� ����� ���� ���α׷��� �� �������� ���Ḧ �ٿ�����!!

	}
}
