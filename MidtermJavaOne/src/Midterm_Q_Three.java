import java.util.*;
public class Midterm_Q_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner (System.in);
		
		double a = hours (x);
		double b = wage (x);
		double c = grossofincome(a, b);									
		System.out.println("The Gross for your income will be: $" + c );
		double d = withhold (a, b);
		System.out.println("The Withhold from your paycheck will be: $" + d);
		double e = netpay (c, d);
		System.out.print("The netpay of your paycheck will be: $" + e);
		
	}

	private static double netpay(double c, double d) {
		// TODO Auto-generated method stub
		double num1 = c - d;
		return num1;
	}

	private static double withhold(double a, double b) {
		// TODO Auto-generated method stub
		double num1 = (a * b) * .15; 
		return num1;
	}

	private static double grossofincome(double a, double b) {
		// TODO Auto-generated method stub
		double num1 = a * b; 
		return num1;
	}

	private static double wage(Scanner x) {
		// TODO Auto-generated method stub
		System.out.print("what is your wage at work: ");
		double num1 = x.nextDouble();
		return num1;
	}

	private static double hours(Scanner x) {
		// TODO Auto-generated method stub
		System.out.print("how many hours have you done for the week: ");
		double num1 = x.nextDouble();
		return num1;
	}

}
