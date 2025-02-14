package project.malak.student;

public class CreditCard {
private Account acc;
private int pin;

 public CreditCard(Account acc , int pin)
 {
	 this.acc = acc;
	 this.pin = pin;
 }
 
  public boolean processPay(double amount , int codepin )
  {
	  if(codepin == pin)
	  {
		  return acc.paymentProcess(amount);
	  }
	  return false;
  }
}
