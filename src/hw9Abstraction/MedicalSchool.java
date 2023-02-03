package hw9Abstraction;

public abstract class MedicalSchool {
	// create 2 methods inside the Abstract Class - one is abstract

	public abstract void anatomyLab();

	// and another one is non abstract
	public void biochemistryLab() {
		// Print something inside the non abstract or implemented method.
		System.out.println("this is a non-abstruct method in a Abstract Class");
	}

}
