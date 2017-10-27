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
	private float discountRating;
	
	public float getCreditRating(){return creditRating;};
	public String getName(){return name;};
	public String getAddress(){return address;};
	public float getDiscountRating(){return discountRating;};
};