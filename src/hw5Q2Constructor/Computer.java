package hw5Q2Constructor;

public class Computer {

	String brand;
	String model;
	String operatingSystem;
	int price;
	char grade;
	boolean madeInUsa;

	public Computer() { // default constructor
		System.out.println("This is from the default Constructor of Computer class.");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {// parameterized
																													// constructor
																													// 01
		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price: $" + price + ", Grade: " + grade + " and Made in the USA? Ans: " + madeInUsa + ".");
	}

	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUsa, char grade) {// parameterized
																													// constructor
																													// 02
		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price: $" + price + ", Grade: " + grade + " and Made in the USA? Ans: " + madeInUsa + ".");
	}
}
