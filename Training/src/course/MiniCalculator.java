package course;

import java.util.Scanner;

public class MiniCalculator {
	Scanner s = new Scanner(System.in);

	public void addition() {
		System.out.println("Enter how many values to process addititon");
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
		System.out.println("Enter how many values to find division");
		double initialNo, secondInteger, finalInteger = 0;
		int number,count;
		number = s.nextInt();
		if (number == 2) {
			System.out.println("Enter the first and second values");
			initialNo = s.nextInt();
			secondInteger = s.nextInt();
			finalInteger = initialNo - secondInteger;
		} else {
			count=number;
			System.out.println("The values are " +count);
			System.out.println("Enter the first  values followed by next values");
			for (int i = 0; i < count - 1; i++) {
				if(i==0)
				{
				finalInteger = s.nextInt();
				}
				initialNo=s.nextInt();
				finalInteger =finalInteger - initialNo;
				if (finalInteger <=0) {
					System.out.println("The Subtraction will be 0");
				}
			}
		}
		System.out.println("Subtraction:" + finalInteger);
	}

	public void mul() {
		System.out.println("Enter how many values to multiplication");
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
		System.out.println("Enter how many values to find division");
		double initialNo, secondInteger, finalInteger = 0;
		int number,count;
		number = s.nextInt();
		if (number == 2) {
			System.out.println("Enter the first and second values");
			initialNo = s.nextInt();
			secondInteger = s.nextInt();
			finalInteger = initialNo / secondInteger;
		} else {
			count=number;
			System.out.println("The values are " +count);
			System.out.println("Enter the first  values followed by next values");
			for (int i = 0; i < count - 1; i++) {
				if(i==0)
				{
				finalInteger = s.nextInt();
				}
				initialNo=s.nextInt();
				finalInteger =finalInteger/initialNo;
				if (finalInteger <= 0) {
					System.out.println("The division will be 0");
				}
			}
		}
		System.out.println("Division:" + finalInteger);
	}

	public void mod() {
		System.out.println("Enter how many values to find modulus");
		int count, number;
		double initialNo, secondInteger, finalInteger = 0;
		number = s.nextInt();
		if (number == 2) {
			System.out.println("Enter the first and second values");
			initialNo = s.nextInt();
			secondInteger = s.nextInt();
			finalInteger = initialNo % secondInteger;
		} else {
			count=number;
			System.out.println("The values are"+count);
			System.out.println("Enter the first  values");
			
			for (int i = 0; i < count - 1; i++) {
				if(i==0)
				{
				finalInteger = s.nextInt();
				}
				initialNo = s.nextInt();
				finalInteger =finalInteger % initialNo;
				if (finalInteger <= 0) {
					System.out.println("The modulus will be 0");
				}
			}
		}
		System.out.println("Modulus:" + finalInteger);

	}

	public void sq() {
		System.out.println("enter the no. to sq ");
		double count = s.nextInt();

		System.out.println(Math.sqrt(count));

	}
}
