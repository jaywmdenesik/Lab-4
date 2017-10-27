import java.util.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Order
{
	private Date dateRecieved;
	private Double price;
	private int orderID;
	
	public Date getDateRecieved(){return dateRecieved;};
	public Double calculatePrice(){return price;};
};