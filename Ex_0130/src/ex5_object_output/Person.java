package ex5_object_output;

import java.io.Serializable;

// ��ü ����ȭ�� serializable�� ���� �����Ѵ�.
public class Person implements Serializable{
	
	// ��ü�� ��Ʈ������ ��°�� �����ϱ� ���ؼ��� ���ο� �޸� ������
	// �Ӽ��� �޼��带 �Ϸ��� �����ؼ� �����ص־� �Ѵ�
	// Serializable�� ���� ����ȭ�� ���������� �ڵ�ȭ �� �ش�
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
