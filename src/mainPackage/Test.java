package mainPackage;
public class Test {

	public static void main(String[] args) throws InsufficientFundsException {
		Account acc = new Account();
		acc.setId(1122);
		acc.setBalance(20000);
		acc.setAnnualInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.printf("The balance is $%4.2f, the monthly interest is %.2f%%, \nand the date the account was created is " + acc.getDate(), acc.getBalance(), acc.getMonthlyInterestRate());
	}

}
