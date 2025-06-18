package day4.firstpackage;

public class Studententitymain {
	public static void main(String[] args) {
		Studententity st=Studententity.getObj();
		
		st.setId(101);
		st.setName("Abi");
		
		Studententity st1=Studententity.getObj();
		System.out.println(st1);
		System.out.println(st);


		
		
	}

}
