package ex6_generic;

public class GenEx<T> {
	// ���ʸ� Ŭ����
	// ���ʸ� Ŭ������ �Ϲ����� �ڵ带 �ۼ��ϰ� �� �ڵ带
	// ������ Ÿ���� ��ü�� ���Ͽ� ������ �����ϵ��� �ϴ� ���α׷��� ���
	
	T value;
	
	int num;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
