package homework4;

import java.util.Scanner;

public class homework41 {
	public static void main(String[] args) {

		int[] myArr = { 10, 5, 100, 300, 8, 4 };
		 int value = max(myArr);
		 
	
		 public static int max(int array[]) {
		int maxValue = array[0];
		for (int i : array) {

			if (i > maxValue) {

				maxValue = i;
			}

		}
		System.out.println(maxValue);

	}
}
	


}
