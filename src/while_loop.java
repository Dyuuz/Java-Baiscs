import java.util.Scanner;
public class while_loop {
	private static Scanner input; 
	public static void main(String[]args) {
		input = new Scanner(System.in);	
		System.out.print("Input your score: ");
		int score = input.nextInt();
		while (score >= 5) {
			System.out.println("My score is: " + score);
			score--;
		}
	}
}
