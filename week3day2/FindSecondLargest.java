package week3day2;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		TreeSet<Integer> S=new TreeSet<Integer>();
		for (int i=0;i<data.length;i++) {
		S.add(data[i]);
		}
		System.out.println(S);


	List<Integer> arr = new ArrayList<>(S);
	for (int i : S)
        arr.add(i);
    System.out.println(arr);
    System.out.println(arr.get(S.size()-2));
}
}
