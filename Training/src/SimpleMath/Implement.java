package SimpleMath;
import java.util.Scanner;

public class Implement extends MiniCalculator{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int Switch;
		MiniCalculator calc = new MiniCalculator();
		System.out.println("Enter the method to calculate");
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulus 6.Square root");
		Switch = s.nextInt();
		switch (Switch) {
		case 1:
			System.out.println("Addition");
			calc.addition();
			break;
		case 2:
			System.out.println("Subtraction");
			calc.subtract();
			break;
		case 3:
			System.out.println("Multiply");
			calc.mul();
			break;
		case 4:
			System.out.println("Division");
			calc.div();
			break;
		case 5:
			System.out.println("Modulus");
			calc.mod();
			break;
		case 6:
			System.out.println("Square Root");
			calc.sq();
			break;
		}
	}
}
