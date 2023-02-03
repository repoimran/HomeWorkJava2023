package hw9Abstraction;

public interface University {

	public int classSize();

	public boolean playGround();

	public String teacher();
	
	//Create one default .... gymnasium 
	public default void gymnasium() {
		System.out.println("******something******");
	}
	
	//and and one static method library inside the interface "University".
	public static void library() {
		System.out.println("******something******");
	}

}
