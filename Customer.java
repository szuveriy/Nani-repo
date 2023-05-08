package Demoo;

import java.util.Scanner;
import java.util.Date;

public class Customer {
	private long id ;
	private String name ;
	private String mobileNumber ;
	 
	private double averageSpendAmount; 
	private double totalAmount; 
	 
	private double rating; 
	
	Customer(long i, String name1, String mobileNumber1, double averageSpendAmount1, double totalAmount1, double rating1) {
		id=i;
		name=name1;
		mobileNumber=mobileNumber1;
		averageSpendAmount=averageSpendAmount1;
		totalAmount=totalAmount1;
		rating=rating1;
	}
	 
	 
	  public void setId(long i) {
		  id=i;
	  }
	  public void setName(String name1) {
		  name=name1;
	  }
	  public void setMobileNumber(String mobileNumber1) {
		  mobileNumber=mobileNumber1;
	  }
	  public void setAverageSpendAmount(double averageSpendAmount1 ) {
		  averageSpendAmount=averageSpendAmount1;  
	  }
	  public void TotalAmount(double totalAmount1 ) {
		  totalAmount=totalAmount1;   
	  }
	  public void  Rating(double rating1 ) {
		  rating=rating1;  
	  }
	  
	  public long getId(){
		   return id;
	  }
	  public String getName() {
		  return name;
	  }
	  public String getMobileNumber() {
		  return  mobileNumber;
	  }
	  public double getAverageSpendAmount( ) {
		  return averageSpendAmount;  
	  }
	  public double getTotalAmount( ) {
		 return totalAmount;   
	  }
	  public double  getRating( ) {
		  return rating;  
	  }




	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer1 details");
		 Date D= new Date();
		 long a=sc.nextLong();
		 String b= sc.next();
		 String c=sc.next();
		 double d=sc.nextDouble();
		 double e=sc.nextDouble();
		 double f=sc.nextDouble();
		 System.out.print("Enter customer2 details");
		 Date D1= new Date();	
		 long a1=sc.nextLong();
		 String b1= sc.next();
		 String c1=sc.next();
		 double d1=sc.nextDouble();
		 double e1=sc.nextDouble();
		 double f1=sc.nextDouble();
		 
			 

			Customer Customer1 = new Customer( a,b,c,d,e,f );
			System.out.println("Details of customer 1"); 
			System.out.println("id ="+ Customer1.getId() );
			System.out.println("name ="+ Customer1.getName());
			System.out.println("mobileNumber="+ Customer1.getMobileNumber());
			 System.out.println("Date ="+ D.toString());
			System.out.println("averageSpendAmount ="+ Customer1.getAverageSpendAmount());
			System.out.println("totalAmount ="+ Customer1.getTotalAmount());
			System.out.println("rating ="+ Customer1.getRating());
			 System.out.println("DateEnrolled ="+ D.toString());
			
			System.out.println("-----------------------------");
			System.out.println("Details of customer 2"); 
			Customer Customer2 = new Customer( a1,b1,c1,d1,e1,f1);
			System.out.println("id ="+ Customer2.getId());
			System.out.println("name ="+ Customer2.getName());
			System.out.println("mobileNumber="+ Customer2.getMobileNumber());
			 System.out.println("averageSpendAmount ="+ Customer2.getAverageSpendAmount());
			System.out.println("totalAmount ="+ Customer2.getTotalAmount());
			System.out.println("rating ="+ Customer2.getRating());
			 System.out.println("DateEnrolled ="+ D1.toString());
		
			System.out.println("------------------------------");
			
			if(Customer1==Customer2) {
				System.out.println("Customer1 and Customer2 are equal");
			}
				else{
					System.out.println(" equal");
				}
			}
		

	}


