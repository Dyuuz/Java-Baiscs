
public class Compound_Interest {

	public static void main(String[] args) {
		
		double amount;
		double principal = 10000;
		double rate = 0.1;
		
		for (int day = 1; day <= 10; day++) {
			amount = principal*Math.pow(1 + rate, day);
			System.out.println("Day "+ day + ":\t" + amount);
		}

	}

}
