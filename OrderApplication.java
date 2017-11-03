import java.util.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class OrderApplication
{
	
	
		private static Product[] importCatalogue() //*****Import Products*****\\
		{
			Scanner in = new Scanner(System.in);			//file input settup									
			Product[] product;								//product array construction
			Product holder;
			product = new Product[10];
		
			try
			{
			  Scanner inFile = new Scanner(new FileReader("ProductCatalogue.txt"));		//connection to input file 'ProductCatalogue.txt'
			  String fixer = "";														//arbitrary String variable
			
			for (int i = 0; i < 10; i++)						//for all 10 array elements
				{
			      product[i] = new Product(inFile.nextLine(),inFile.nextDouble(),inFile.nextInt());		//create a 'Product' Object using data from 'ProductCatalogue.txt'
				  fixer = inFile.nextLine();		// resolve .txt file spacing issue
				  
				  System.out.println("Adding item '" + product[i].getName() + "' to inventory");
				}
			}
		
			catch (IOException e)
			{e.printStackTrace();}
			return product;
		};
		
		public static boolean createOrder(Order order, Product[] product)   //*****Create Order*****\\
		{
		Scanner in = new Scanner(System.in);
		double price = order.calculatePrice(product);  // calculate price
		System.out.println("");
		System.out.println("Your final price is: " + price + "");
		System.out.println("");
		System.out.print("Would you like to alter your order? <y/n>: ");
		char checker = in.next().charAt(0);
		if (checker != 'y')
		{System.out.println("Finalizing order..."); return true;}
		
		System.out.print("To which item would you like to make alterations? <'item name'>: ");
		String checker2 = in.nextLine();
		checker2 = in.nextLine();
		OrderAlteration alter = new OrderAlteration();
		price = alter.alterOrder(price, product, checker2);
		System.out.print("Your new total is $" + price + "");
		System.out.print("");
		boolean done = false;
		
		while (!done)
		{
			System.out.print("Would you like to make another alteration? <y/n>: ");
			
			checker = in.next().charAt(0);
			if (checker != 'y')
			{System.out.println("Finalizing order..."); return true;}
		
			System.out.print("To which item would you like to make alterations? <'item name'>: ");
			checker2 = in.nextLine();
			checker2 = in.nextLine();
			price = alter.alterOrder(price, product, checker2);
			System.out.print("Your new total is $" + price + "");
			System.out.print("");
		}
		
		return false;
		};
		
		public static void main(String[] args)		//*****MAIN ALGORITHM*****\\
	{
		System.out.println("");
		Product[] product;
		product = new Product [10];
		product = importCatalogue();							//Import Products
		System.out.println("");
		Order a = new Order();						// 
		createOrder(a, product);								// Create Order
	}
};