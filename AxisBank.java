package Week3.Day1Assignment;

public class AxisBank extends BankInfo {

	public void Deposit() {
		super.deposit();
		System.out.println("Axis Bank Deposit is override");

	}
	
	public static void main(String[] args) {
		AxisBank over1 = new AxisBank();
		over1.saving();
		over1.fixing();
		//over1.deposit();
	    over1.Deposit();
		
	}
}
