package SimpleMath;

import java.util.Scanner;

public class MenuDrivenProgram {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		PrimeNumber p = new PrimeNumber();
		PrimeNumberNext pn = new PrimeNumberNext();
		Fibonacci fi = new Fibonacci();
		Scanner s = new Scanner(System.in);
		for (;;) {
			System.out.println("Enter Any one Method To find Output");
			System.out.println("1.Factorial 2.Nearest Prime no 3.Next prime Number 4.Fibonacci");
			int index = s.nextInt();
			switch (index) {
			case 1:
				System.out.println("Factorial");
				f.display();
				break;
			case 2:
				System.out.println("Next Prime No");
				p.display();
				break;
			case 3:
				System.out.println("Next Prime No");
				pn.display();
				break;
			case 4:
				System.out.println("Fibonacci");
				fi.display();
				break;

			}
		}
	}
}