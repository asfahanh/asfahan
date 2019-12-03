package p1;

//design
//access modifier: public. private, default
public class Customer {
	//no one except its own class can access the private field directly
	private String firstName;
	private String lastName;
	private String phone;
	private String accountNumber;
	private double balance;

//overloaded constructor = more than one
	//constructor
	public Customer(String firstName, String lastName, String phone, String accountNumber, double balance) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.phone = phone;
	this.accountNumber = accountNumber;
	this.balance = balance + 1000.00;

}
	//another constructor
	public Customer() {
		balance = 1000.00;
}
	//setters mutators
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return firstName + " " + lastName + ": " + phone + ", " + accountNumber + ", $" + balance;
	}
}
