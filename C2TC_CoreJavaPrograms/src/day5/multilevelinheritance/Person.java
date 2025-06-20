package day5.multilevelinheritance;

import java.util.Date;

public class Person {
	private String name;
	private long contactNo;
	
	public Person(String name, long conatctNo, Date dateOfBirth) {
	
		
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	private Date dateOfBirth;
	@Override
	public String toString() {
		return "Person [name=" + name + ", contactNo=" + contactNo + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}
