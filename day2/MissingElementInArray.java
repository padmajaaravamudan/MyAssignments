package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

	int[] arr = {1,2,3,4,7,6,8};
		int l = arr.length;
		int k1 = 0;
		int maxarr = 0;
		Arrays.sort(arr);
		for (int k=0;k<=l-1;k++) {
			maxarr = arr[l-1];
			}
		System.out.println(maxarr);
		for (int i=1;i<=maxarr;i++) {
			for (int j=0;j<=l-1;j++) {
				if (arr[j] == i) {
									k1 = 1;
								 }
			}
					if (k1 ==0) {
					System.out.println(i);
					
				}
					k1 = 0;
			}
}
}

