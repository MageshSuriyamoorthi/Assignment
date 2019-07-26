package SimpleMath;

import java.util.Scanner;

public class Fibonacci {
	public void display() {
		Scanner s=new Scanner(System.in);
		int initialNo = 0, SecondNo = 1;
		System.out.println("Enter the number to find fibonacci");
		int number=s.nextInt();
        System.out.print("Fibonacci for First " + number + " Number");
        int initial=1;
        System.out.println();
        		while(initial<=number)
        		{
            System.out.println(initialNo);
            int fibonacci = initialNo + SecondNo;
            initialNo= SecondNo;
            SecondNo = fibonacci;
            ++initial;
        }
	}
}
