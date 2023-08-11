package week3day2;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {
	
	public static void main(String[] args) {

		String [] STR = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		Arrays.sort(STR, Collections.reverseOrder());  
		System.out.println(Arrays.toString(STR));   
               }
}
