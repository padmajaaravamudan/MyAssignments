package week3day2;

public class Palindrome {

	public static void main(String[] args) {
	String varstring="madam";
	String revstring="";
	for (int i=varstring.length()-1;i>=0;i--) {
		
			revstring = revstring +  varstring.charAt(i);
		}
	boolean indicator = varstring.endsWith(revstring);
	if (indicator=true) {
		System.out.println("The string is a Palindrome");
	}
	else {
			System.out.println("The string is not a Palindrome");
	}

	}
	
}
