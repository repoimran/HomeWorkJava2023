package hw5Q3Constructor;

public class Student {
	String stName; 
	int stID;
	char sex; 
	boolean isProgrammer; 
	float grade;
	
	public Student() {
		System.out.println("This is from the default Constructor of Student class.");
	}
	
	public Student(String stName, int stID, char sex, float grade, boolean isProgrammer) {
		System.out.println("Student Name: "+stName+", ID: "+stID +", Sex: "+sex+", Grade: "+grade+" and Java Programmer? Ans: "+true+".");
	}
}
