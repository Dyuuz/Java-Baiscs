import java.util.Scanner;
public class SimpleAverage {
	public static Scanner inp;
	public static void main(String [] args) {
		inp = new Scanner(System.in);
		int grade, total, average, counter, avg;
		counter = 0;
		total = 0;
		
		System.out.println("Welcome to simple average program.\nThis program will calculate an average from a set of scores.");
		System.out.print("Input the total number of scores: ");
		avg = inp.nextInt();
		System.out.println("You can now input each numbers below.");
		
		while (counter < avg){
			System.out.print("Input a number: ");
			grade = inp.nextInt();
			total += grade;
			counter++;
		}
		
		average = total/avg;
		System.out.println("Average score: " + average);
	}

}
