import java.util.Random;
public class Conditional_ops {
	static Random rand =new Random();
	
	public static void main(String [] args) {
		int counter = 1;
		
		while (counter <= 5) {
			int score = 1+rand.nextInt(100);
			System.out.printf(score >= 50 ? "Class " +counter+ " passed!\n" : "Class "+counter+ " failed!\n");
			counter+= 1;
		}
	}

}
