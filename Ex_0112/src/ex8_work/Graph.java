package ex8_work;

public class Graph {

	public int[] coordinateValue(int[] arr) {
		int[] value = new int[10];
		for (int i = 0; i < arr.length; i++) {
			value[arr[i]]++;
		}
		return value;
	}

	public void showGraph(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
				System.out.printf("%dÀÇ °¹¼ö\t: ", i);
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("#");
			}
			System.out.printf(" (%d)\n", arr[i]);
		}
	}
}
