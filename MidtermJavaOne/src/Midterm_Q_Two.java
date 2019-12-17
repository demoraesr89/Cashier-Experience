import java.util.*;
public class Midterm_Q_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner x = new Scanner (System.in);
			
			System.out.println("Welcome to the Greaseburger!");
			System.out.println("Lard Burger: $2.47");
			System.out.println("Bucket of Fries: $4.29");
			System.out.println("Gallons of Sprite: $3.09");
			

			double a = burgers (x);
			double b = fries (x);
			double c = sprite (x);
			System.out.println("Total is $" + (a + b +c));

	}

	private static double sprite(Scanner x) {
		// TODO Auto-generated method stub
		System.out.println("How much sprite would you like? ");
		double num1 = x.nextInt();
		double num2 = 3.09;
		return (double) (num1 * num2);
	}

	private static double fries(Scanner x) {
		// TODO Auto-generated method stub
		System.out.println("how many fries you like? ");
		double num1 = x.nextInt();
		double num2= 4.29;
		return (double) (num1 * num2);
	}



	private static double burgers(Scanner x) {
		// TODO Auto-generated method stub
		System.out.println("how many burgers would you like? ");
		double num1= x.nextInt();
		double num2= 2.47;
		return (double) (num1 * num2);
	}

}
