package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int secondmax = 0;
		Arrays.sort(data);
		int l = data.length;
		for (int i =0;i<l;i++) {
			secondmax = data[l-1];
		}
		System.out.println(secondmax);
	}

}
