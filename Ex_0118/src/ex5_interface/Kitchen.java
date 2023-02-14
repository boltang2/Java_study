package ex5_interface;

public class Kitchen implements AllMenu{
//public class Kitchen implements Menu1, Menu2, Menu3 {
	// 인터페이스는 구현능력이 없기 때문에
	// 하나의 클래스에서 다중으로 상속(구현)이 가능
	@Override
	public String jjajang() {
		// TODO Auto-generated method stub
		return "중면 + 춘장소스";
	}

	@Override
	public String jjambbong() {
		// TODO Auto-generated method stub
		return "중면 + 짬뽕소스";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "돼지고기 + 탕수육소스";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "밥 + 야채";
	}

	@Override
	public String mando() {
		// TODO Auto-generated method stub
		return "만두피 + 속";
	}

	@Override
	public String rajogi() {
		// TODO Auto-generated method stub
		return "닭 + 라조기소스";
	}

}
