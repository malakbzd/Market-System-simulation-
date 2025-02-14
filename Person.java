package project.malak.student;

public class Personn {
 private String name;
 private Shoppingcart shoppingcart;
 private CreditCard creditcard;
 
  public  Personn(String name , double accountBalance , int pin)
  {
	  this.name = name;
	  this.shoppingcart = new Shoppingcart();
	  this.creditcard = new CreditCard(new Account (accountBalance ) , pin);
  }
  
  public String getName()
  {
	  return name;
  }
  
  public Shoppingcart getshoppingCart()
  {
	  return shoppingcart;
  }
  
  public CreditCard getcreditCard()
  {
	  return creditcard;
  }
}
