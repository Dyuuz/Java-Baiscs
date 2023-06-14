
public class Exception_throw {
	static void checkage(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
		else {
			System.out.println("Access granted - you are old enough!");
		}
	}
	
	public static void main (String []args) {
		
		checkage(12);
	}

}
