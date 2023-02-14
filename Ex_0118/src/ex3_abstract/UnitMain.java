package ex3_abstract;

public class UnitMain {
	public static void main(String[] args) {
		Terran t1 = new Terran("marine", 40, false);
		t1.decEnergy();
		System.out.println("t1 : " + t1.energy);
		
		Protoss p1 = new Protoss("zealot", 150, false);
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("p1 : " + p1.energy);
	}
}
