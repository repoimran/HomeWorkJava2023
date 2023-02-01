package hw6IfElseCondition02;
import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {
		System.out.println("Today's Weather");
		Scanner sc = new Scanner(System.in);
		int todaysTemperature = sc.nextInt();
		if(todaysTemperature < 32) System.out.println("Freezing");
		else if(todaysTemperature < 55) System.out.println("Pleasant");
		else if(todaysTemperature < 73) System.out.println("Getting Warmer");
		else if(todaysTemperature > 101) System.out.println("Very Hot");
		else System.out.println("Please put a valid temperature");
	}
}
