package ex4_constructor;

public class PenMain {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.result();
		Pen p2 = new Pen();
		p2.result();
		Pen p3 = new Pen("Gold", 30000);
		p3.result();
	} // main
}
