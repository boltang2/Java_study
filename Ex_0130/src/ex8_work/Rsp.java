package ex8_work;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Rsp implements Serializable {
	private String user;
	private int[] winDrawDefeat;
	private Random rnd = new Random();

	public Rsp(String user) {
		// TODO Auto-generated constructor stub
		this.user = user;
		winDrawDefeat = new int[3];
	}

	public void rspGame() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%d�� %d�� %d��\n", winDrawDefeat[0], winDrawDefeat[1], winDrawDefeat[2]);
		out: while (true) {
			System.out.print("����(s) | ����(r) | ��(p) >> ");
			String userRsp = sc.next();
			if (userRsp.charAt(0) == 's' || userRsp.charAt(0) == 'r' || userRsp.charAt(0) == 'p') {
				rsp(userRsp);
				while (true) {
					System.out.print("���Ǵ� ? y | n >> ");
					String yN = sc.next();
					if (yN.charAt(0) == 'y') {
						continue out;
					} else if (yN.charAt(0) == 'n') {
						System.out.println("���� ����");
						break out;
					} else {
						System.out.println("�ùٸ� ���� �Է��ϼ���.");
					}
				}
			}
			System.out.println("�ùٸ� ���� �Է��ϼ���.");
		}

	}

	public void rsp(String userRsp) {
		String srp = "srp";
		int num = rnd.nextInt(3);
		String result = userRsp + srp.charAt(num);
		String[] win = { "rs", "pr", "sp" };
		String[] draw = { "ss", "rr", "pp" };
		String[] defeat = { "sr", "rp", "ps" };
		String[][] wdd = { win, draw, defeat };

		out: for (int i = 0; i < wdd.length; i++) {
			for (String occation : wdd[i]) {
				if (occation.equalsIgnoreCase(result)) {
					switch (i) {
					case 0:
						System.out.println("����� �̰���ϴ�.");
						break;
					case 1:
						System.out.println("����� �����ϴ�.");
						break;
					case 2:
						System.out.println("����� �����ϴ�.");
						break;
					default:
						break;
					}
					winDrawDefeat[i]++;
					System.out.printf("%d�� %d�� %d��\n", winDrawDefeat[0], winDrawDefeat[1], winDrawDefeat[2]);
					break out;
				}
			}
		}
	}
}
