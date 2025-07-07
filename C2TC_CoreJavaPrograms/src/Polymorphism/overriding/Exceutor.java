package Polymorphism.overriding;

public class Exceutor {
	public static void main(String[] args) {
		
		//dynamic binding or late binding
		Shape s1=new Shape();
		
		s1.calArea();
		
		s1=new Square(5.25f);
		s1.calArea();
		
		s1=new Rectangle(5.2d,4.5d);
		s1.calArea();
	}

}
                                                                                                                               