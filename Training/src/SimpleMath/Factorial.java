package SimpleMath;

import java.util.Scanner;;

public class Factorial {
	public void display() {
		Scanner s = new Scanner(System.in);
		int initial, factorial = 1;
		System.out.println("Enter any no to find factorial");
		double number = s.nextDouble();// It is the number to calculate factorial.
		if (number != 0 && number > 0) {
			for (initial = 1; initial <= number; initial++) {
				factorial = factorial * initial;
			}
			System.out.println("Factorial of " + number + " is: " + factorial);
		} else {
			System.out.println("Error");
		}
	}
}
