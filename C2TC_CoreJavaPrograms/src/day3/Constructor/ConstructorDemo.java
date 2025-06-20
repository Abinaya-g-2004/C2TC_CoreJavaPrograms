package day3.Constructor;

import java.util.Scanner;

public class ConstructorDemo {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int cusId;
		String name ,city;
		System.out.print("Enter Customer Id : ");
		 int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();

		System.out.println("");
		CustomerDemo c1=new CustomerDemo(); 
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		 System.out.println(c1);
		 sc.close();
		 
		 
		
		
		
	}
	  
}