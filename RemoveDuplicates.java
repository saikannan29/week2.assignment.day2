package week3.day2;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week3";
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		String[] words = text.split("\\s");
		int length = words.length;
		for (int i = 0; i < length; i++) {
			linkedset.add(words[i]);
		}
		System.out.println(linkedset);
	}
}
