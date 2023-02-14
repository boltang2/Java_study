package ex5_object_output;

import java.io.Serializable;

// 객체 직렬화를 serializable을 통해 진행한다.
public class Person implements Serializable{
	
	// 객체를 스트림으로 통째로 저장하기 위해서는 새로운 메모리 영역에
	// 속성과 메서드를 일려로 복사해서 저장해둬야 한다
	// Serializable를 통해 직렬화를 내부적으로 자동화 해 준다
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
