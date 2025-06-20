package day3.Constructor;

public class Customerentitymain {
	private int id;
	private String name;
	private String city;
	public Customerentitymain(){
		this.id=101;
		this.name="Abi";
		this.city="Chennai";
	}
	public Customerentitymain(int id,String name) {
		this.id=103;
		this.name="Pune";
	}
	public Customerentitymain(int id,String name,String city) {
		this.id=102;
		this.name="jack";
		this.city="BAnglore";
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
		return "Customerentity [id=" + id + ", name=" + name + ", city=" + city + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getCity()=" + getCity() +  "]";
	}
}	
