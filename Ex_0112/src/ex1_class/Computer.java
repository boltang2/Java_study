package ex1_class;

public class Computer {
	
	// ��ǻ�͸� ����� ���� �����۾�
	private String brand = "apple";
	int ssd = 256;
	int ram = 32;
	float cpu = 24.f;
	String color = "white";
	
	// ��ǻ���� ������ Ȯ���ϱ� ���� �޼���(���)
	// �޼��� : �ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ� ����� ����
	
	public void getInfo() {
		System.out.println("brand : " + brand);
		System.out.println("ssd : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("cpu : " + cpu);
		System.out.println("color : " + color);
		System.out.println("-------------------");
	}
	
	// �޼����� ����
	// ���������� ��ȯ�� �޼��� �� (�Ķ����(�Ű�����))
	// public void getinfo() { �޼��� ȣ�� �� ���࿵�� }
	
	// ���������� :
	// 1) public : ���� ������Ʈ ���� ��� ��ü�鿡�� ����� �㰡
	// 2) private : ���� Ŭ���������� ����� �㰡
	// 3) protected : ��Ӱ����� ��ü�鿡�Ը� ����� �㰡
	// 4) default : ���� ��Ű�� ���� ��ü�鿡�� ����� �㰡 (���������� ������ �ƹ��͵� �ƹ��͵� �Ⱦ��� default ���)
	
	
}
