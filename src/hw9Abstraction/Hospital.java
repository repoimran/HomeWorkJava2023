package hw9Abstraction;

//b) Create an interface "Hospital".
public interface Hospital {

	public int emergencyRoom();
	public int surgeryRoom();
	public boolean cafeteria();
	//Create one default  morgue 
	public default void morgue() {
		System.out.println("*****something*****");
	}
	//and and one static method pharmacy inside the interface "Hospital". 
	public static void pahrmacy() {
		System.out.println("*****something*****");
	}
}
