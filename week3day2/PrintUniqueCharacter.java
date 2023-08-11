package week3day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String txt = "padmaja                                                                                      ";
	    Set<Character> uniqueStr = new HashSet<Character>();
	    for (int i = 0; i < txt.length(); i++) {
	        uniqueStr.add(txt.charAt(i));
	    }
	    System.out.println(uniqueStr);
	}

}
