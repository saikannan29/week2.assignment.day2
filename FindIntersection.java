package week3.day2;

import java.util.LinkedHashSet;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int array1[]= {3,2,11,4,6,7};
    int array2[]= {1,2,8,4,9,7};
	LinkedHashSet<Integer> linkedset = new LinkedHashSet<Integer>();

    for(int i=0;i<array1.length;i++)
    {
    	for(int k=0;k<array2.length;k++)
    	{
    		if(array1[i]==array2[k])
    		{
    			linkedset.add(array1[i]);
    		}
    	}
    }
    System.out.println(linkedset);
    
	}

}
