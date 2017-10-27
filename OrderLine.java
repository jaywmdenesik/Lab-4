import java.util.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class OrderLine
{
	private int quantity;
	private double price;
	private Product a;
	
	public OrderLine(Product product, int quantity, double price){};
	public Product getProduct(){return a;};
	public int getQuantity(){return quantity;};
	public double getPrice(){return price;};
};