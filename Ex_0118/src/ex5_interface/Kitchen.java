package ex5_interface;

public class Kitchen implements AllMenu{
//public class Kitchen implements Menu1, Menu2, Menu3 {
	// �������̽��� �����ɷ��� ���� ������
	// �ϳ��� Ŭ�������� �������� ���(����)�� ����
	@Override
	public String jjajang() {
		// TODO Auto-generated method stub
		return "�߸� + ����ҽ�";
	}

	@Override
	public String jjambbong() {
		// TODO Auto-generated method stub
		return "�߸� + «�ͼҽ�";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "������� + �������ҽ�";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "�� + ��ä";
	}

	@Override
	public String mando() {
		// TODO Auto-generated method stub
		return "������ + ��";
	}

	@Override
	public String rajogi() {
		// TODO Auto-generated method stub
		return "�� + ������ҽ�";
	}

}
