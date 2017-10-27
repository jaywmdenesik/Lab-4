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
	public static Double calculatePrice(Product[] product)
	{
		double basePrice = 0;
		
		for (int i = 0; i < 10; i++)
		{basePrice += product[i].getPrice();}
		
		
		
		return price;
	};
};