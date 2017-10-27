import java.util.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Order
{
	private Date dateRecieved;
	private static Double price;
	private int orderID;
	
	public Order(){};
	public Date getDateRecieved(){return dateRecieved;};
	public static Double calculatePrice(Product[] product)   //*****Calculate Price*****
	{
		double basePrice = 0;
		
		for (int i = 0; i < 10; i++) //for all 10 products
		{
			basePrice += product[i].getPrice();		// add current products price to total price
			System.out.println("'" + product[i].getName() + "' costs $" + product[i].getPrice() + ""); // inform user
			System.out.println("Your total cost is now $" + basePrice + "");		
		}
		Customer customer = new Customer("","",0,0.9);
		System.out.println("Your total price before your 10% discount is $" + basePrice + ""); // print total 'pre-discount' price
		price = basePrice * customer.getDiscountRating();
		
		return price;
	};
};