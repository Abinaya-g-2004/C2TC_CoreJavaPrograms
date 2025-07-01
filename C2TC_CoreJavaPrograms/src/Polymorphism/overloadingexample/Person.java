package Polymorphism.overloadingexample;

public class Person {
	private int id;
	private String name;
	private String city;
	
	public Person()//default constructor
	{
		this.id=100;
		this.name="Abi";
		this.city="chennai";
	}
	public Person(int id,String name)//parametrized(only 2 parameters)
	{
		this.id=id;
		this.name=name;
		
	}
	public Person(int id,String name,String city)//only 3 parameters
	{
		this.id=id;
		this.name=name;
		this.city="chennai";
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

}
