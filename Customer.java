import java.util.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Customer
{
	private String name;
	private String address;
	private float creditRating;
	private double discountRating;
	
	public Customer(String nam, String addres, float creditRatin, double discountRatin)
	{
		name = nam;
		address = addres;
		creditRating =creditRatin;
		discountRating = discountRatin;
	}
	public float getCreditRating(){return creditRating;};
	public String getName(){return name;};
	public String getAddress(){return address;};
	public double getDiscountRating(){return discountRating;};
};