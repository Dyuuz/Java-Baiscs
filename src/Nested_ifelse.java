import java.util.Scanner;
public class Nested_ifelse {
	public static Scanner scn;
	public static void main(String [] args) {
		scn = new Scanner(System.in);
		int score, max, min;
		max = 100;
		min = 0;
		System.out.print("Input your CSC score: ");
		score = scn.nextInt();
		
		if (score >= 50 ) {
			System.out.println("You scored  " + score + ".");
			if (score >= 50 && score < 75) {
				System.out.print("Work hard to make A");
			}
			else if (score >= 75 && score < 90) {
				System.out.print("You got A. Attaboy!!");
			}
			else if (score >= 90 && score < max) {
				System.out.print("You turned out be a computer geek!");
			}
			else {
				System.out.print("Invalid input.");
			}
				
		}
		
		
		else {
			System.out.println("You scored  " + score + ".");
			if (score <= 49 && score > 25) {
				System.out.print("Work hard to make it above average.");
			}
			else if (score <= 25 && score > 10) {
				System.out.print("Way below the norms, still want to maintain? then work your ass off.");
			}
			else if (score <=10  && score > min) {
				System.out.print("Should i call this a failure? pls consider opting out. ");
			}
			else {
				System.out.print("Invalid input.");
			}
		}
	}

}
