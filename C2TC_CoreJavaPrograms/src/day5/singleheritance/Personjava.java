//This program demonstrates person base class
package day5.singleheritance;

public class Personjava {
	private int id;
	private String name;
	private String city;
	public Personjava()//default constructor
	{
		this.id=101;
		this.name="unknown";
		this.city="chennai";
	}
	public Personjava(int id,String name,String city)//paramaterized constructor
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Personjava [id=" + id + ", name=" + name + ", city=" + city + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getCity()=" + getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
