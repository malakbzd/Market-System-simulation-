package project.malak.student;

import java.util.Vector;

public class Shoppingcart {
	Vector <Item> Shoppingcart = new Vector<>();
	
	public void add(Item item)
	{
		Shoppingcart.add(item);
	}
	
	public boolean remove(Item item)
	{
		return Shoppingcart.remove(item);
	}
	
	public Vector <Item> getItems()
	{
		return   Shoppingcart;
	}
	
	public double getprice()
	{
		double sum=0;
		for(int i=0 ; i<Shoppingcart.size() ; i++)
		{
			sum=sum+Shoppingcart.get(i).getPrice();		}
		return sum;
	}
	
	

}
