package mainPackage;

public class InsufficientFundsException extends Exception {
	private double amount;
	
	public InsufficientFundsException(double amt) {
		this.amount = amt;
	}
	
	public double getAmount() {
		return this.amount;
	}
}
