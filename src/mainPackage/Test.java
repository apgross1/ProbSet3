package mainPackage;



public class Test {
	/**
	 * @category Main method for execution
	 * @param args
	 * @throws InsufficientFundsException
	 */
	public static void main(String[] args) throws InsufficientFundsException {
		Account acc = new Account();

		try {
			acc.setId(1122);
			acc.setBalance(20000);
			acc.setAnnualInterestRate(4.5);
			acc.withdraw(2500);
			acc.deposit(3000);
		} catch (InsufficientFundsException e) {
			//If insufficient funds when withdrawing, the program will terminate
			System.out.println("Insufficient funds.");
			return;
		}
		System.out.printf("The balance is $%4.2f, the monthly interest is %.2f%%, \nand the date the account was created is " + acc.getDate(), acc.getBalance(), acc.getMonthlyInterestRate());
	}

}
