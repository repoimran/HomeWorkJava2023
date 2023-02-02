package hw8Abstraction;

public abstract class EngineeringSchool {

	// create 2 methods inside the Abstract Class - one is abstract and

//	...name mechanicalLab
	public abstract void mechanicalLab();

	// another one is non abstract name ... computerLab with a return type;
	public String computerLab(int numberOfLabs) {
//		Print something inside the non abstract or implemented method .
		System.out.println("********something********");
		return String.format("we have  %s   computer labs in our school", numberOfLabs);
	}

}
