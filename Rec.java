import java.util.Scanner;

public class Rec {
public static void main(String args[]) {
	//These are the intializers for the main class Rec
	double xValue = 0.0;
	double EValue = 0.0;
	double finalGuess = 0.0;

	Scanner input = new Scanner(System.in);

		// Will print and let the user know that the Babylonian Method is being used
		System.out.println("Square Root Finder (Babylonian Method)");
		while (xValue <= 0) {
		System.out.print("Please input a proper value for the x: ");
		xValue = input.nextDouble();

		//This if statement will not let the user enter a number that is lower than 0.
		if (xValue <= 0) {
			System.out.println("Cannot input a value lower than 0. Value entered must be greater than 0");
		}

}

