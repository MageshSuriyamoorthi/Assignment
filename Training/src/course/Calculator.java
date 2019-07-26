package course;

import java.util.Scanner;

public class Calculator extends MiniCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String option;
		MiniCalculator minicalc = new MiniCalculator();
		for (;;) {
			System.out.println("Enter the method to calculate");
			System.out.println(
					"One.Addition Two.Subtraction Three.Multiplication Four.Division Five.Modulus Six.Square root");
			option = s.nextLine();
			switch (option) {
			case "One":
				System.out.println("Addition");
				minicalc.addition();
				break;
			case "Two":
				System.out.println("Subtraction");
				minicalc.subtract();
				break;
			case "Three":
				System.out.println("Multiply");
				minicalc.mul();
				break;
			case "Four":
				System.out.println("Division");
				minicalc.div();
				break;
			case "Five":
				System.out.println("Modulus");
				minicalc.mod();
				break;
			case "Six":
				System.out.println("Square Root");
				minicalc.sq();
				break;
			default:
				System.out.println("please enter the correct option with matching uppercase and lowercase letters");
				break;
			}
		}
	}

}