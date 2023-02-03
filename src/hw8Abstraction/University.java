package hw8Abstraction;

//a) Create an interface "University".
public interface University {

	// Can you create a Constructor inside the University interface?
	// no, interface can not have a constructor
	// a default Constructor on the University interface. If no, comment out the
	// JVM shows compile time error "Interfaces cannot have constructors"
	/*
	 * public University() {
	 * 
	 * }
	 */

	// Declare some methods inside the interface named--> classSize, playGround, and
	// teacher.

	public int classSize();

	public boolean playGround();

	public String teacher();

}
