package week3day1;

public class Assignment3AxisBank extends Assignment3BankInfo{
	public void deposit() {
		System.out.println("Deposit");
	}

	public void commondeposit() {

		super.deposit();
	}
	
	public static void main(String[] args) {
		
		Assignment3AxisBank ob=new Assignment3AxisBank();
		ob.deposit();
		
}
}