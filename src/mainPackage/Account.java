package mainPackage;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		
	}
	
	public Account(int idVal, double balanceVal) {
		this.id = idVal;
		this.balance = balanceVal;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int idVal) {
		this.id = idVal;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balVal) {
		this.balance = balVal;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;	
	}
	
	public void setAnnualInterestRate(double rate) {
		this.annualInterestRate = rate;
	}
	
	public Date getDate() {
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return ((this.getAnnualInterestRate())/12);
	}
	
	public void withdraw(double amount) {
		this.setBalance((this.getBalance())-amount);
	}
	
	public void deposit(double amount) {
		this.setBalance((this.getBalance()) + amount);
	}
}


