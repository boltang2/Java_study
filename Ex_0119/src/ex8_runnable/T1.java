package ex8_runnable;

public class T1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i ++) {
			System.out.println(i);
		}
	}

}
