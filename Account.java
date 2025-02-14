 package project.malak.student;

public class Account {
 private double balance;
 
 public Account(double balance)
 {
	 this.balance = balance;
 }
 
 public double getBalance()
 {
	 return balance;
 }
 
 public boolean paymentProcess( double amount)
 {
	 if(balance >= amount)
	 {
		 balance = balance - amount;
		 return true;
	 }
	 return false;
 }
 
 
}
