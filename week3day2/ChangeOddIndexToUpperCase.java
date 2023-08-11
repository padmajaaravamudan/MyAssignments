package week3day2;
public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = new char[test.length()];
		for (int i = 0; i < test.length(); i++) {
			ch[i] = test.charAt(i);
			if ((i % 2)!=0){
			char a=(Character.toUpperCase(ch[i]));
			ch[i]=a;
			}
          System.out.println(ch[i]);
         
}
}
	}