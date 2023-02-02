package Question3;

public class Main1 {

	public static void main(String[] args) {
		//create the instance of employee class and enter the value
		Address ad=new Address("N0073","Uluberia","Howrah","West Bengal","711316");
		Department d=new Department("ABCD2000","EE","Employee");
		Employee ep=new Employee("Soham Sen",(byte)23,"9804803563",ad,"ABC_047",20000,d);
	
		 
		ep.displayemp();

	}

}
