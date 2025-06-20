package day3.scannerdemo;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println("Enter the salary");
		double salary = sc.nextDouble();
		System.out.println("Name:"+ name);
		System.out.println("Age:"+ age);
		System.out.println("Salary:"+ salary);
		sc.close();
		}

}
