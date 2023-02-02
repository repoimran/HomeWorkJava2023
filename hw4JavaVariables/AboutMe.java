package hw4JavaVariables;

public class AboutMe {

	int age; // variable decleared in here
	double height;// variable decleared in here
	String name; // variable decleared in here
	float vision;// variable decleared in here
	char married;// variable decleared in here
	byte children;// variable decleared in here
	short childAge;// variable decleared in here
	long salary;// variable decleared in here

	public AboutMe() { // constructor is decleared in here
		System.out.println("This is all about us: ");
	}

	public void aboutMe() { // method is implemented in here
		System.out.println("hi, my name is " + name + " my age is " + age + ", im  " + height + " feet long, "
				+ "my vision is " + vision + ", i am " + married + ", i have " + children + " daughter"
				+ " and her age is " + childAge + ", my expected salary is " + salary + " !");
	}

}
