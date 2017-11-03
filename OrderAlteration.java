import java.util.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class OrderAlteration
{
	private boolean match = false;
	private String checker = "";
	private int position = -1;
	private int quantity = -1;
	
	public double alterOrder(double price, Product[] product, String item)
	{
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++)
		{
			if (item.equals(product[i].getName()))
			{
				position = i;
				match = true;
				
			}
			
		}
		if (!match)
		{System.out.println("No match found...    ...returning..."); return price;}
	
		System.out.println("Successful match with item #: " + position + "");
		System.out.print("Would you like to remove this item, or purchase more? <remove/add>: ");
		checker = in.nextLine();
		if (checker.equals("remove") || checker.equals("add"))
		{
			if (checker.equals("remove"))
			{
				price = (price - product[position].getPrice());
				System.out.println("Item: " + product[position].getName() + " has been removed...");
				System.out.println("Item's price: $" + product[position].getPrice() + " has been subtracted from your total");
			}
			else
			{
				System.out.print("How many more " + product[position].getName() + " would you like to add? <#>: ");
				quantity = in.nextInt();
				price = (price + (product[position].getPrice() * quantity));
				System.out.println("An additional " + quantity + " " + product[position].getName() + "(s) have been added to your order!");
				System.out.println("" + product[position].getName() + " has a price of $" + product[position].getPrice() + "");
				System.out.println("Adding " + quantity + " * $" + product[position].getPrice() + " to your total");
			}
			return price;
		}
		System.out.println("entry not recognized");
		return price;
	}
};