package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class Interface {

	public static void main(String[] args) {
		int[] num1={3, 2, 11, 4, 6, 7};
		int[] num2={1, 2, 8, 4, 9, 7};
		System.out.println("The values in num1 list are:3, 2, 11, 4, 6, 7");
		System.out.println("The values in num2 list are:1, 2, 8, 4, 9, 7");
		//Array list
	    List<Integer> commonValues = new ArrayList<>();
	    
	    //Looping condition 
	      for (int i = 0; i < num1.length; i++) {
	         for (int j = 0; j < num2.length; j++) {
	        	 
	      //if condition
	            if (num1[i] == num2[j]) {
	               commonValues.add(num1[i]);
	            }
	         }
	      }
	      System.out.println("The Equal Values in the Element: " + commonValues);
	   }
	}
	