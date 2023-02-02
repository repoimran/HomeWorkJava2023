package hw8Abstraction;

public class ColumbiaUniversity {
//Can you create a Constructor inside a regular Class?
	private int numOfStudents;
	public int numOfDept;

	public ColumbiaUniversity(int numOfDept, int numOfStudents) {
		// If yes, create default Constructor in ColumbiaUniversity.
		this.numOfDept = numOfDept;
		this.setNumOfStudents(numOfStudents);
	}

	private void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

	public int getNumOfStudents() {
		return this.numOfStudents;
	}
//create 2 methods inside the class -

	// one is abstract, Name -- chemistry, if any of them is not possible to
	// create,simply comment out the method and
	// public abstract void chemistry();

	// explain why in the Java comment, inside this class only.
	// we get a compile time error --> "The abstract method chemistry in type
	// ColumbiaUniversity can only be defined by an abstract class"

	// and biology.
	public void biology() {
		// Print something inside the non-abstract or implemented method.
		System.out.println("******something******");
	}

}
