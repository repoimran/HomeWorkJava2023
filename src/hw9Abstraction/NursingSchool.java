package hw9Abstraction;

public abstract class NursingSchool {
	// Can you create a Constructor inside MedicalSchool Abstract Class?
	/*
	 * Yes, we can create a constructor inside an abstract class in Java. However,
	 * an abstract class cannot be instantiated on its own, so the constructor of an
	 * abstract class is only used when it is subclassed and an instance of the
	 * subclass is created.
	 */

	// If yes, create a default Constructor.
	String onlyFromSubClass;

	public NursingSchool(String onlyFromSubClass) {
		this.onlyFromSubClass = onlyFromSubClass;
	}

	/*
	 * we can use the super keyword in the constructor of a subclass to call the
	 * constructor of its superclass (including an abstract class). This can be
	 * useful when we want to initialize the member variables of the superclass from
	 * within the subclass constructor. For example:
	 *
	 * abstract class AbstractClass { int x; AbstractClass(int x) { this.x = x; } }
	 *
	 * class SubClass extends AbstractClass { int y; SubClass(int x, int y) {
	 * super(x); this.y = y; } }
	 */

	// create 2 methods inside the Abstract Class -
	// one is abstract name -- hygiene
	public abstract void hygine();

	// and another one is the non-abstract name --caring.
	public void caring() {
		// Print something inside the non-abstract or implemented method.
		System.out.println("****something****");
	}

}
