package SimpleMath;

import java.util.Scanner;

public class PrimeNumberNext {
	void display() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to find next prime number : ");
		int number = s.nextInt();								//
		number++;
		for(int initial=2;initial<=(number+1)/2;initial++)
		{
			while((number%initial==0)==true)
			{
				number++;
			}
		}
		System.out.println(number);
		
	}
}