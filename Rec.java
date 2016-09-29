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

//This while loop will make sure that the user can only enter a number for the error that is greater than 0.
	while  (EValue <= 0) {
		System.out.print("Please input a proper value for the error: ");
		EValue = input.nextDouble();

	/*
	*This if statement will let the user know that if a value entered for the error is 0 it will create a heap exception that will go deep into the recursion process
	*Also lets the user to know to enter a non negative number
	*/
	if (EValue <=0) {
			System.out.println("The number 0 as value should be used or else a heap exception may occur. The value entered for error should be a number that is of the non negative variety.");
		}
	}

	double firstGuess = xValue / 2;

	finalGuess = Sqrt(xValue, firstGuess, EValue);

	System.out.println("With the last Squareroot, the final result is(" + xValue+ ") presenting an error value of " + EValue + " which comes out to be " + finalGuess);
}

