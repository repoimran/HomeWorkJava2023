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

}
