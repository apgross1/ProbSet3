package mainPackage;

import java.util.*;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	
	/**
	 * @category Constructor
	 * @param N/A
	 * @return N/A
	 */
	public Account() {
		
	}
	
	/**
	 * @category Constructor
	 * @param idVal
	 * @param balanceVal
	 * @return N/A
	 */
	public Account(int idVal, double balanceVal) {
		this.id = idVal;
		this.balance = balanceVal;
	}
	
	/**
	 * @category getter for the ID of Account instance
	 * @return idVal, and int value
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * @category setter for ID of Account instance
	 * @param idVal
	 */
	public void setId(int idVal) {
		this.id = idVal;
	}
	
	/**
	 * @category getter for the balance of account (a double)
	 * @return balance, a double
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * setter for Balance, a double
	 * @param balVal
	 */
	public void setBalance(double balVal) {
		this.balance = balVal;
	}
	
	/**
	 * @category getter for APR, the interest rate on the amount in Account instance
	 * @return annualInterestRate, a double
	 */
	public double getAnnualInterestRate() {
		return this.annualInterestRate;	
	}
	
	/**
	 * @category setter for AnnualInterestRate
	 * @param rate , a double
	 */
	public void setAnnualInterestRate(double rate) {
		this.annualInterestRate = rate;
	}
	
	/**
	 * @category getter for the date the Account instance was created
	 * @return timestamp, a Date wrapper datatype
	 */
	public Date getDate() {
		Date timestamp = this.dateCreated;
		return timestamp;
	}
	
	/**
	 * @category calculates MonthylInterestRate, a double
	 * @return MonthlyInterestRate, a double
	 */
	public double getMonthlyInterestRate() {
		return ((this.getAnnualInterestRate())/12);
	}
	
	/**
	 * @category withdraws specified dollar amount from Account instance
	 * @param amount , a double
	 * @throws InsufficientFundsException if withdraw amount exceeds amount in Account instance
	 */
	public void withdraw(double amount) throws InsufficientFundsException {
		if ((this.getBalance()-amount) >= 0) {
			this.setBalance((this.getBalance())-amount);
		}	
		else {
			double deficit = (this.getBalance()-amount);
			throw new InsufficientFundsException(deficit);
		}
	}
	
	/**
	 * @category deposits specified dollar amount into Account instance
	 * @param amount , a double
	 */
	public void deposit(double amount) {
		this.setBalance((this.getBalance()) + amount);
	}
}


