
import java.util.Scanner;
import java.util.Vector;

public class MarketSystem {
	
private Queue customerqueue;

  public  MarketSystem ()
  {
	  customerqueue = new Queue();
  }
  
  public void addcostumertoQueue (Personn customer)
  {
	  customerqueue.addCustomer(customer);
  }
  
  public Personn processQueue() {
	    if (!customerqueue.isEmpty()) {
	        return customerqueue.nextCustomer();
	    }
	    return null;
	}

}
