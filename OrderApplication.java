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
		double price = order.calculatePrice(product);  // calculate price
		System.out.println("");
		System.out.println("Your final price is: " + price + "");
		return true;
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