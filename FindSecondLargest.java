package week3.day2;
import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3,2,11,4,6,7};
		ArrayList<Integer> list = new ArrayList<Integer>(data.length);
		 
        for (int i: data) {
            list.add(Integer.valueOf(i));
        }
    Collections.sort(list, Collections.reverseOrder());
    System.out.println("Second largest from the input: "+ list.get(1));
    
	}

}
