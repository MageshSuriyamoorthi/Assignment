package SimpleMath;

import java.util.Scanner;

public class PrimeNumber {
	void display() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to find nearest prime number : ");
		int number = s.nextInt();
		
		for(int i=2;i<=(number+1)/2;i++)
		{
			while((number%i==0)==true)
			{
				number++;
			}
		}
		System.out.println(number);
		number++;
	}
}
