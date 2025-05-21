package week4.day1;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting3 {
	public static void main(String[] args) {
		//create a list o strings
		//company={"HCL", "Wipro", "Aspire Systems", "CTS"} ;
		ArrayList<String> al = new ArrayList<String>(); 
		//Add the strings into list
		al.add("Aspire Systems");
		al.add("CTS");
		al.add("HCL");
		al.add("Wipro");
		/* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al,Collections.reverseOrder()); 

        // Let us print the sorted list 
        System.out.println("List after the use of" + 
                        " Collection.sort() :\n" + al);

	}

	}
