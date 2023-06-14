import java.util.Scanner;

public class UserCustom_Variable {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		String username, password;
		System.out.print("Input your username: ");
		username = input.next();
		System.out.print("Input your password: ");
		password = input.next();
		
	System.out.println("Preparing Login Details....\nYour username is: "+ username + "\nYour password is: "+ password);
	}

}
