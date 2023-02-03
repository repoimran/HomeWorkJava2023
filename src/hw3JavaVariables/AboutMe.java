package hw3JavaVariables;

public class AboutMe {
	int numInt;// decleared
	double numDouble = 22.22; // decleared
	String str = "Its a String"; // rest all initialized
	float numFloat = 22.56f;
	char anyChar = 'a';
	byte numByte = 127;
	short numShort = 12;
	long numLong = 9223372036854775807l;

	public static void main(String[] args) {
		AboutMe abtme = new AboutMe();
		abtme.numInt = 100; // initialized by the reference variable "abtme"
		System.out.println(abtme.str + abtme.numInt + abtme.numDouble);
	}
}
