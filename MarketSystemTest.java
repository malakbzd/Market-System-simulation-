package project.malak.student;

import java.util.Scanner;

public class MarketSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
		 MarketSystem market = new  MarketSystem();
		 
		 Personn p1 = new Personn("malak", 1000 , 123);
		 Personn p2 = new Personn("ranim", 2000 , 124);

		 
		 p1.getshoppingCart().add(new Item ("milk",100));
		 p1.getshoppingCart().add(new Item ("apple",200));
		 p1.getshoppingCart().add(new Item ("candy",500));
		 
		 p2.getshoppingCart().add(new Item ("milk",900));
		 p2.getshoppingCart().add(new Item ("grapes",200));
		 
		 market.addcostumertoQueue(p1);
		 market.addcostumertoQueue(p2);
		 
		 Personn customer;
		 while((customer = market.processQueue()) != null)
		 {
			 System.out.println(" enter pin for : " + customer.getName() + " to pay :"  + customer.getshoppingCart().getprice() );
			 int pin = scanner.nextInt();
			 double totalcost = customer.getshoppingCart().getprice();
			 
			 if(customer.getcreditCard().processPay(totalcost, pin))
			 {
			 System.out.println("payment successful for " + customer.getName());
		 }
			 else
			 {
				 System.out.println("payment failed for " + customer.getName() + "  not enough cash or wrong pin");
			 }
		 
		 
	}
		 scanner.close();

	}
}
