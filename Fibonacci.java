package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int sum;
		System.out.println("The Fibnacci Series");
		System.out.println(+a );
		System.out.println(+b );
		for (int i = 1 ; i <= 11 ; i++)
		{
			sum = a+b;
			a = b;
			b = sum;
			System.out.println(+ sum );
			if (sum > 56) 
			{
				break;
			}
		}
	}

}
