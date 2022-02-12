package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 14, 12, 13, 11, 15, 14, 18, 16, 19, 18, 17, 20 };
		LinkedHashSet<Integer> linkedset = new LinkedHashSet<Integer>();

		for (int i = 0; i < input.length; i++) {
			for (int k = 0; k < input.length; k++) {
				if (i != k) {
					if (input[i] == input[k]) {
						linkedset.add(input[i]);
					}
				}
			}
		}
		System.out.println(linkedset);

	}

}
