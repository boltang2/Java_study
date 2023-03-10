package ex3_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball {
	public static void main(String[] args) {
		// 이전에 제작한 숫자 야구 게임을
		// 배열을 사용을 사용하여 코드를 줄여보세요.
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int size = 5; // 내가 맞출 숫자 크기
		int[] com = new int[size]; // 컴퓨터가 낸 정답을 입력할 배열
		int[] user = new int[size]; // 내가 정답을 입력할 배열
		int count = 1; // 내가 정답을 맞추려고 시도한 횟수
		// 중복 없는 수 생성
		do {
			for (int i = 0; i < com.length; i++) {
				com[i] = rnd.nextInt(9) + 1;
			}
		} while (overlap(com));
		// 답출력
		System.out.print("정답 : ");
		for (int tmp : com) {
			System.out.print(tmp);
		} // for
		System.out.println();
		while (true) {
			for (int i = 0; i < user.length; i++) { // 내가 입력한 수 저장
				System.out.printf("수%d : ", i + 1);
				user[i] = sc.nextInt();
			} // for
			if(overlap(user)) { // 혹시 유저가 중복된 숫자를 입력했다면 기회 차감없이 다시 기회를 줌
				System.out.println("중복된 숫자를 입력 하셨어요. 다시 입력해주세요!");
				continue;
			}
			int[] strikeBall = strikeBall(com, user); // 내가 입력한 수와 컴퓨터가 낸 정답을 비교해 strike갯수 -> strikeball[0], ball갯수 -> strikeball[1]
			if (strikeBall[0] == size) { // 모두 strike라면 정답 출력후 반복문 빠져나오기
				System.out.printf("%d회 만에 정답!\n", count);
				break;
			} else {
				if (strikeBall[0] == 0 && strikeBall[1] == 0) { // 아무것도 맞추지 못했을 경우 out출력
					System.out.print("out!");
				} else { // 하나라도 맞췄을 경우 해당 strike, ball 개수를 출력 후 다시 반복
					System.out.printf("strike = %d, ball = %d 입니다.\n", strikeBall[0], strikeBall[1]);
				}
			} // if else 
			count++; // 내가 정답을 맞추려고 시도한 횟수 늘리기
			System.out.println("---------------");
		} // while
	} // main
	private static boolean overlap(int[] arr) { // 난수 값이 중복이 있는지 없는지 검사
		boolean isOverlap = false;
		for (int i = 0; i < arr.length - 1; i++) { // arr.length C 2 만큼 조사, 하나라도 중복이 발견 된다면 true 리턴
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return !isOverlap;
				}
			}
		}
		return isOverlap;
	}
	private static int[] strikeBall(int[] arr1, int[] arr2) { // strike와 ball개수 세기
		int[] strikeBall = { 0, 0 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (i == j) {
					if (arr1[i] == arr2[j]) {
						strikeBall[0]++;
					}
				} else {
					if (arr1[i] == arr2[j]) {
						strikeBall[1]++;
					}
				}
			}
		}
		return strikeBall;
	}
}
