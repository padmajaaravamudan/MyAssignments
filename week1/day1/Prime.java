package week1.day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		int n = (num/2);
		for (int i = 2; i <= n;i++) 
		{
			if (num % i == 0)
					{
				System.out.println("The number " + num + "is not Prime");
				break;
					}
		}
		System.out.println("The number " + num +" is  Prime");
	}

}
