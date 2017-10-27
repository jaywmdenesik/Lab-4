import java.util.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class OrderApplication
{
	
	
		private static boolean importCatalogue()
		{
			Scanner in = new Scanner(System.in);												
			Product[] product;
			Product holder;
			product = new Product[10];
		
			try
			{
			  Scanner inFile = new Scanner(new FileReader("ProductCatalogue.txt"));
			  String fixer = "";
			
			for (int i = 0; i < 10; i++)
				{
			      product[i] = new Product(inFile.nextLine(),inFile.nextDouble(),inFile.nextInt());
				  fixer = inFile.nextLine();
				}
			}
		
			catch (IOException e)
			{e.printStackTrace();}
			return true;
		};
		
		public boolean createOrder(Order order)
		{
		this.importCatalogue();
		return true;
		};
		
		public static void main(String[] args)
	{
		importCatalogue();
	}
};