package ex5_interface;

public interface AllMenu extends Menu1, Menu2, Menu3{
		// 인터페이스끼리는 extends키워드를 통해 서로 상속이 가능함
		// Menu1을 상속받았다면 짜장, 짬봉 추상메서드까지 AllMenu에서 사용할 수 
		// 있게 됨을 의미
		String rajogi();
}
