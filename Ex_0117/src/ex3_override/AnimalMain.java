package ex3_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Bear bear = new Bear();
		
		System.out.println("eye : " + bear.getEye());
		System.out.println("leg : " + bear.getLeg());
		System.out.println("Ư¡ : " + bear.woong);
		
		System.out.println("------------------------");
		
		Lion lion = new Lion();
		
		System.out.println("eye : " + lion.getEye());
		System.out.println("leg : " + lion.getLeg());
		System.out.println("Ư¡ : " + lion.hair);
		
		System.out.println("------------------------");
		
		Elephant ele = new Elephant();
		
		System.out.println("eye : " + ele.getEye());
		System.out.println("leg : " + ele.getLeg());
		System.out.println("Ư¡ : " + ele.nose);
		
		System.out.println("------------------------");
		
		Snake sn = new Snake();
		
		System.out.println("eye : " + sn.getEye());
		System.out.println("leg : " + sn.getLeg());
		System.out.println("Ư¡ : " + sn.eye);
		
		System.out.println("------------------------");
		
		
	}
}
