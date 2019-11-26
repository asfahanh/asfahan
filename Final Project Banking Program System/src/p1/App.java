package p1;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// a class is a data type
		//int x = 5;
		//System.out.println("Hi");
		//Customer c1 = new Customer("John", "Doe", "6311234567", "1234567", 1000.00);
		Student s1 = new Student("Jane Doe", "Computer Science", 3.5);
		System.out.println(s1);
		Student s2 = new Student("Jane Doe", "English", 2.5);
		System.out.println(s2);
		Student[] students1 = {s1, s2};
		Student[] students2 = new Student[2];
		students2[0] = s1;
		students2[1] = s2;
		//System.out.println(Arrays.deepToString(students2));
		

	}

}
