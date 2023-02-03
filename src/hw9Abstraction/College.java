package hw9Abstraction;

public interface College {
	// Declare some methods inside the interface - commonRoom, laboratory,
	// languageClub.
	public int commonRoom();

	public int laboratory();

	public boolean languageClub();

//	Create also one default  method dorm 
	public default void dorm() {
		System.out.println("*****something*****");
	}

	// and one static method studyRoom inside the interface "College".
	public static void studyRoom() {
		System.out.println("*****something*****");
	}

	/*
	 * i) how many keywords are used for the inheritance in Interface
	 * 
	 * --> Answer: extends keyword only
	 * 
	 * Can an interface inherit other Interfaces, or a regular class or abstract
	 * class by extends keyword?
	 * 
	 * --> Answer: Yes interface can inherit other interfaces, but thats all, An
	 * interface can not extend a regular class or abstract class by extends keyword
	 * 
	 * How many inheritances are possible? Use the Interface -- "University" to
	 * answer my questions (University extends College, Hospital) (by multiple line
	 * comments).
	 * 
	 * --> Answer: An interface can extend multiple Interfaces eg. interface
	 * University extends College, Hospital
	 */
	// ---------------------------------------------------------------------------------
	/*
	 * ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and
	 * NursingSchool. how many keywords are used for the inheritance in Java for
	 * Abstract Class?
	 * 
	 * --> Answer: 1 keywords, extends for a single class only
	 * 
	 * Can an Abstract Class inherit another Abstract Class or a regular class or
	 * interface by extends keyword?
	 * 
	 * --> Answer: yes, Abstract class can inherit another abstract class or a
	 * regular Class but not the interface, to inherit interface it must use the
	 * keyword "implements" an Abstract class can implement single or multiple
	 * interfaces.
	 * 
	 * How many inheritances are possible in an Abstract Class?
	 * 
	 * --> Answer: an abstract class can only extend a single class(either abstract
	 * or regular) eg. MedicalSchool extends NursingSchool or eg. MedicalSchool
	 * extends EngineeringSchool or eg. NursingSchool extend EngineeringSchool
	 */
	// ---------------------------------------------------------------------------------
	/*
	 * iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity,
	 * RockefellerUniversity. how many keywords are used for the inheritance in Java
	 * for a regular Class?
	 * 
	 * --> Answer: one keyword, a regular class can only extend a single class(either
	 * abstract or regular)
	 * 
	 * Can a regular Class inherit another Abstract Class or a regular class or
	 * interface by extends key word? 
	 * --> Answer: yes, regular class can inherit another abstract class or a regular Class 
	 * but not the interface, to inherit interface it must use the keyword "implements" 
	 * a regular class can implement single or multiple interfaces.
	 * 
	 * How many inheritances are possible by a regular Class? (use java comments for
	 * the above question). 
	 * --> Answer: one inheritance(class to class inheritance)
	 * eg. ColumbiaUniversity extends NYUniversity or 
	 * eg. ColumbiaUniversity extends RockefellerUniversity or 
	 * eg. NYUniversity extend RockefellerUniversity
	 */

}
