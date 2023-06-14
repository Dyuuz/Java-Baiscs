public class MethodOverloading {
	static int MethodOver(int x, int y) {
		return x + y;
	}
	static double MethodOver(double x, double y) {
		return x + y;
	}
	public static void main(String [] args) {
	
		int num1 = MethodOver(5, 19);
//		type casting
//		double num3 = num1;
		double num2 = MethodOver(5.8, 17.7);
		System.out.println("Int: " + num1);
		System.out.println("Int: " + num2);
	}
}
