package SimpleMath;

import java.util.Scanner;

public class MiniCalculator {
	Scanner s = new Scanner(System.in);

	public void addition() {
		System.out.println("Enter how many values to multiply");
		int count;
		count = s.nextInt();
		System.out.println("Enter the values");
		double initialNo, finalInteger = 0;
		for (int i = 0; i < count; i++) {
			initialNo = s.nextInt();
			finalInteger = finalInteger + initialNo;
		}
		System.out.println("Addition:" + finalInteger);
	}

	public void subtract() {
		System.out.println("Enter how many values to multiply");
		int count;
		count = s.nextInt();
		double InitialNo, finalInteger = 0;
		System.out.println("Enter the values");
		for (int i = 0; i < count; i++) {
			InitialNo = s.nextInt();
			finalInteger = finalInteger - InitialNo;
		}
		System.out.println("Subtraction:" + finalInteger);
	}

	public void mul() {
		System.out.println("Enter how many values to multiply");
		int count;
		count = s.nextInt();
		double InitialNo = 0, finalInteger = 1;
		System.out.println("Enter the numbers");
		for (int i = 0; i < count; i++) {
			InitialNo = s.nextInt();
			finalInteger = finalInteger * InitialNo;
		}
		System.out.println("Multliplication:" + finalInteger);
	}

	public void div() {
		System.out.println("Enter how many values to multiply");
		int count;
		count = s.nextInt();
		double InitialNo, finalInteger = 1;
		System.out.println("Enter the values");
		for (int i = 0; i < count; i++) {
			InitialNo = s.nextInt();
			finalInteger = finalInteger / InitialNo;
		}
		System.out.println("Division:" + finalInteger);
	}

	public void mod() {
		System.out.println("Enter how many values to multiply");
		int count;
		count = s.nextInt();
		double InitialNo, finalInteger = 0;
		System.out.println("Enter the values");
		finalInteger = s.nextInt();
		for (int i = 0; i < count - 1; i++) {
			InitialNo = s.nextInt();
			finalInteger = finalInteger % InitialNo;
		}
		System.out.println("Modulus:" + finalInteger);

	}

	public void sq() {
		System.out.println("enter the no. to sq ");
		double count = 0;
		count = s.nextInt();

		System.out.println(Math.sqrt(count));

	}
}
