package ex3_abstract;

public class Protoss extends Unit{

	public Protoss(String name, int energy, boolean fly) {
		// TODO Auto-generated constructor stub
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	@Override
	public void decEnergy() {
		// TODO Auto-generated method stub
		energy--;
	}

}
