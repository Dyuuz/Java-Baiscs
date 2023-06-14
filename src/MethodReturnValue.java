import java.util.Scanner;
import java.lang.Math;

public class MethodReturnValue {
	static double myMethod(double x) {
		x = Math.pow(2, x);
		return x;
	}
	public static Scanner scan;
	public static void main(String[]args) {
		scan = new Scanner(System.in);
		System.out.print("Input a number to be raised to the power of 2: ");
		double num = scan.nextInt();
		System.out.println(myMethod(num));
	}

}
