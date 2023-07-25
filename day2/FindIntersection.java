package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int numbersarray1 [] = {3,2,11,4,6,7};
		int numbersarray2 [] = {1,2,8,4,9,7};
		int matchingvaluesarray [] = {0,0,0,0,0};
		Arrays.sort(numbersarray1);
		Arrays.sort(numbersarray2);
		int len1 = numbersarray1.length;
		int len2 = numbersarray2.length;
		for (int i=0;i<len1;i++) {
			for ( int j=0;j<len2;j++) {
				if (numbersarray1[i] == numbersarray2[j]) {
					matchingvaluesarray [i] = numbersarray1[i];
					System.out.println(matchingvaluesarray[i]);
				}
			}
		}
		
	}

}
