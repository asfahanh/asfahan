package p1;

public class App {

	public static void main(String[] args) {
		//create an abject
		Customer customer1 = new Customer ("John", "doe", "(631)123-4567", "12345678", 1000.00);
//		customer1.firstName = "Jane";
				System.out.println(customer1.getFirstName());
		
				
				
//create another object
	Customer customer2 = new Customer(); //default constructor
		System.out.println(customer2);
	}
	
}
