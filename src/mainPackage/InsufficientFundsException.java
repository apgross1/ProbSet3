package mainPackage;

public class InsufficientFundsException extends Exception {
	private double amount;
	
	public InsufficientFundsException(double amt) {
		this.amount = amt;
		System.out.println("Insufficient funds.");
	}
	
	public double getAmount() {
		return this.amount;
	}
}
