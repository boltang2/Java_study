package ex5_thread;

public class T1 extends Thread {

	private int num;

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		try {
			for (int i = num; i >= 0; i--) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
