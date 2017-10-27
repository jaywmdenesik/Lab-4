import java.util.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Product
{
	private String name;
	private double price;
	private int productID;
	
	public String getName(){return name;};
	public double getPrice(){return price;};
	public int getProductID(){return productID;};
	public Product(String nam, double pri, int pID)
	{
		name = nam;
		price = pri;
		productID = pID;
	}
};