package ex1_setter_getter;

public class Person {
	// setter & getter : private���� ������� �Ӽ��鿡 ������ �� �ֵ���
	private String name;
	private String phone;
	private int age;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
