package ex4_work;

public class Updown {
	private int count = 0;
	private int correct;

	public void setCorrect(int correct) {
		this.correct = correct;
	}

	public boolean isUpdown(int ans) {
		boolean isCorrect = false;
		count++;
		if (ans < correct) {
			System.out.println("UP");
		} else if (ans > correct) {
			System.out.println("DOWN");
		} else {
			System.out.printf("%dȸ ���� ����!\n", count);
			isCorrect = true;
		}
		return isCorrect;
	}

}
