package project.malak.student;

import java.util.Vector;

public class Queue {
private Vector<Personn> queue;

 public Queue()
 {
	 queue = new Vector<>();
	 
 }
 
 public void addCustomer(Personn customer)
 {
	 queue.add(customer);
 }
 
  public Personn nextCustomer ()
  {
	  if(!queue.isEmpty())
	  {
		  Personn next = queue.get(0);
		   queue.remove(0);
		   return next;
	  }
	  return null;
  }
 
 public Personn exit(Personn customer)
 {
	 return queue.remove(queue.size());
 }
 
 public boolean isEmpty()
 {
	 return queue.isEmpty();
 }
 
 public String toString()
 {
	 return "the array" + queue;
 }
 
 public Personn getPerson(Personn customer)
 {
	 return customer;
 }
 
}
