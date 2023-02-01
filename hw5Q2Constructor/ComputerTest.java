package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer myComp1 = new Computer(); // with default constructor
		Computer myComp2 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false); // with parameterized constructor 01
		Computer myComp3 = new Computer("Dell", "LSN9855", "Windows 11 pro", 300, true, 'C'); // with parameterized constructor 02
	}
}
//My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in the USA? Ans: false. (console)
//My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in the USA? Ans: false. (requirement)
