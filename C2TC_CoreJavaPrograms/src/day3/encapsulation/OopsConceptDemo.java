package day3.encapsulation;

public class OopsConceptDemo {
	private int id,age;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "OopsConceptDemo [id=" + id + ", age=" + age + ", name=" + name + ", getId()=" + getId() + ", getAge()="
				+ getAge() + ", getName()=" + getName() + "]";
	}
	

}
