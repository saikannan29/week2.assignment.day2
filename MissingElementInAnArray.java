package week3.day2;

import java.util.ArrayList;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 2, 3, 4, 6, 7, 8 ,10};
		ArrayList<Integer> list = new ArrayList<Integer>(input.length);
		for(int i=0;i<input.length-1;i++)
		{
			if((input[i+1]-1)!=input[i])
			{
				list.add(input[i]+1);
			}
		}
		System.out.println(list);
	}
}
