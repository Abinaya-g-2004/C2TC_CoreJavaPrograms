package day5.multilevelinheritance;

public class Vehicle {

	public static void main(String[] args) {
		car c;
		c=new car();
		c.vehicleType();
		
		maruti m=new maruti();
		m.vehicleType();
		m.brand();
		m.speed();
		
		maruti800 m1=new maruti800();
		m1.vehicleType();
		m1.brand();
		m1.speed();
		
		
	}

}
