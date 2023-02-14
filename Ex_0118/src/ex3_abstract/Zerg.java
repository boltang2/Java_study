package ex3_abstract;

public class Zerg extends Unit{
	
	public Zerg(String name, int enetgy, boolean fly) {
		// TODO Auto-generated constructor stub
		super.name = name;
		super.energy = enetgy;
		super.fly = fly;
	}

	@Override
	public void decEnergy() {
		// TODO Auto-generated method stub
		energy -= 10;
	}
	
}
