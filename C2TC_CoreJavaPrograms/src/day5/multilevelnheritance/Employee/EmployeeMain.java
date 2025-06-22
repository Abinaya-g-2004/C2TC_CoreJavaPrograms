package day5.multilevelnheritance.Employee;

import java.util.Date;


public class EmployeeMain {
public static void main(String[] args) {

	LevelOneEmployee p1 = (LevelOneEmployee) new Person();
	System.out.println(p1);

	p1 = (LevelOneEmployee) new Employee("Pranav", 8080807070l, new Date(1995, 05, 07), "Sales", 45000);
	System.out.println(p1);

	p1 = new LevelOneEmployee("Madhur", 9880807227l, new Date(1988, 15, 02), "Account", 85000, 200,
			"Signing Authority");
	System.out.println(p1);
}
}



