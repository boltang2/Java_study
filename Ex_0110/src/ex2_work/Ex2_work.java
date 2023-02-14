package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// 키보드에서 입력받은 값 만큼의 행과 열을 가지는 마방진 만들기
		// 1은 반드시 1행 가운데 열 존재
		// (-1.1)위로 올라가서 다음 숫자 를 찍음 배열을 초과할 경우 알잘딱깔센
		// n 배수를 만나면 찍을 곳이 없어짐. (1,0) 찍음
		Scanner sc = new Scanner(System.in);
		int count = 1;
		String str = ""; // count를 형식에 맞춰 스트링으로 저장할 변수
		System.out.printf("마방진 크기를 결정해주세요(홀수).");
		int n = sc.nextInt();
		int[][] ms = new int[n][n]; // 마방진
		int[] x = new int[n];
		int[] y = new int[n]; // 각각 x,y좌표를 나타냄 -> (y[0],x[0]) 해당 배열의 0번째 인덱스 값이 현재 좌표를 나타낼꺼임.
		
		for (int i = 0; i < n; i++) { // 좌표 초기화 ex) (n = 3) -> x = [0,1,2], y = [0,1,2]
			x[i] = i;
			y[i] = i;
		}
		
		for (int i = 0; i < n / 2; i++) { // count == 1 일떄 x좌표가 가운데 부터 시작하므로 그만큼 x좌표를 이동함 ex) (n = 3) -> x = [1,2,0]
			shiftLeft(x);
		}
		
		for (int i = 0; i < n; i++) { // 마방진 입력
			for (int j = 0; j < n; j++) {
				//System.out.printf("현재 좌표는 %d %d이고 현재 count는 %d 입니다.\n", y[0], x[0], count);
				ms[y[0]][x[0]] = count; // 현재 좌표에 해당하는 count값 대입
				if ((count) % n == 0 && count != 1) { // n의 배수 차례 다음은 좌표가 (1,0)증가
					y = shiftLeft(y);
				} else { // 그 외 경우는 좌표가 (-1,1)증가
					y = shiftRight(y);
					x = shiftLeft(x);
				}
				count++;
			} // in for+
		} // out for
		
		for (int i = 0; i < n; i++) { // 마방진 출력
			for (int j = 0; j < n; j++) {
				System.out.printf("%02d\t", ms[i][j]);
			}
			System.out.println();
		}
		
	} // main
	
	private static int[] shiftLeft(int[] arr) { // ex [0,1,2,3,4] -> [1,2,3,4,0] 좌표 증가값이 양수일 때 사용
		int tmp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = tmp;
		return arr;
	}

	private static int[] shiftRight(int[] arr) { // ex [0,1,2,3,4] -> [4,0,1,2,3] 좌표 증가값이 음수일 때 사용
		int tmp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = tmp;
		return arr;
	}
}
