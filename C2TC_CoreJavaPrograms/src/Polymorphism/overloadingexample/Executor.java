package Polymorphism.overloadingexample;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Addition:"+OverloadingExample.addition("hello", "world"));
		System.out.println("Addition:"+OverloadingExample.addition(12, 100));
		System.out.println("Addition:"+OverloadingExample.addition(10, 4.67f));
		System.out.println("Addition:"+OverloadingExample.addition(35.8f, 156));
		System.out.println("Addition:"+OverloadingExample.addition(89.7f, 56.3f));
		
		Person p1=new Person();
		System.out.println(p1);
		
		p1=new Person(101,"Abi");
		System.out.println(p1);
		
		p1=new Person(102,"Abi","chennai");
		System.out.println(p1);
	}

}
