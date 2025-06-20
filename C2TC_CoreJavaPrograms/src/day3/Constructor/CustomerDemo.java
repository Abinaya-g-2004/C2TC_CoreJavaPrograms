package day3.Constructor;

public class CustomerDemo {
	private String customerName;
	 private int customerId;
	 private String customerCity;
	 public CustomerDemo() {
			System.out.println("Default Constructor");
		}
		public CustomerDemo(String customerName, int customerId, String customerCity) {
			
			this();
			
			System.out.println("Parameterized Constructor");
			this.customerName = customerName;
			this.customerId = customerId;
			this.customerCity = customerCity;
		}
		
	 public String getCustomerName() {
		 return customerName;
	 }
	 public void setCustomerName(String customerName) {
		 this.customerName = customerName;
	 }
	 public int getCustomerId() {
		 return customerId;
	 }
	 public void setCustomerId(int customerId) {
		 this.customerId = customerId;
	 }
	 public String getCustomerCity() {
		 return customerCity;
	 }
	 public void setCustomerCity(String customerCity) {
		 this.customerCity = customerCity;
	 }
	 
}