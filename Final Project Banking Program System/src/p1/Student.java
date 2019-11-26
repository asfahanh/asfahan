package p1;
// this is design of a datatype
// a class is a datatype
public class Student {
	String name;
	String major;
	double gpa;
	
	// no return datatype
	// name is the same as the class name (starts with capital)
	// constructor 
	public Student(String name, String major, double gpa) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	public String toString() {
		return "Name: " + name +"; Major: " + major +"; Gpa: " + gpa;
	}
}

