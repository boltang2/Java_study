package ex1_list;

import java.util.ArrayList;

public class Ex4_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		Ex4_ArrayClass ac = new Ex4_ArrayClass();
		
		ac.setArr(arr);
		System.out.println(arr);
	}
}
